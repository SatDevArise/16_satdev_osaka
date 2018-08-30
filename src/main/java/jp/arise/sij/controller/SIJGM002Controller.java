package jp.arise.sij.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.sij.form.SIJGM002Form;
import jp.arise.sij.message.SIJMessage;
import jp.arise.sij.modelandview.SIJGM001MAV;
import jp.arise.sij.modelandview.SIJGM002MAV;
import jp.arise.sij.service.SIJGM002Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;

/**
 * SIJGM002 社員情報新規登録・編集画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class SIJGM002Controller {

	@Autowired
	public LoginInfo loginInfo;


	public SIJGM002MAV sijGm002MAV = new SIJGM002MAV();


	@Autowired
	private SIJGM002Servise sijGm002Service;

    @ModelAttribute
    public SIJGM002Form setSijGm002Form() {
    	SIJGM002Form sijGm002Form = new SIJGM002Form();
        return sijGm002Form;
    }

	/**
	 * 初期処理（遷移元：メニュー画面）
	 * @param model
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initSijGm002",params = "goSijGm002", method = RequestMethod.POST)
	public String initSijGm002(Model model) {
    	//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();
		System.out.println(loginInfoDto.getUser_id());

		//社員ID情報取得
		SIJGM002Dto sijgm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijgm002Dto, sijGm002Service);

		// Serviceクラスの社員ID採番処理を呼び出す
		String syainId = sijGm002Service.getSyainId();



		SIJGM002Form sijGm002Form = new SIJGM002Form();
		sijGm002Form.setUser(" ");
		model.addAttribute("SIJGM002Form",sijGm002Form);
		return "SIJGM002";
	}

	/**
	 * 初期処理（遷移元：社員情報一覧表示画面<）
	 * @param model
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initSijGm002",params = "goToSijGm002",method = RequestMethod.POST)
	public String initSijGm002(Model model,SIJGM001MAV sijGm001MAV) {
		SIJGM002Form sijGm002Form = new SIJGM002Form();
		sijGm002Form.setUser(sijGm001MAV.getUser());
		model.addAttribute("SIJGM002Form",sijGm002Form);
		return "SIJGM002";
	}

	/**
	 * 初期処理(新規作成・更新後)
	 * @param model
	 * @return SIJGM002.jsp
	 * @throws
	 * @author MasashiYamamoto
	 * @since 2018/08/23
	 */
	@RequestMapping(value = "/reInitSijGm002", method = RequestMethod.GET)
	public String reinitSijGm002(Model model) {
		SIJGM002Form sijGm002Form = new SIJGM002Form();
		BeanUtils.copyProperties(sijGm002MAV, sijGm002Form);
		model.addAttribute("SIJGM002Form",sijGm002Form);

		return "SIJGM002";
	}

	/**
	 * エラー画面表示
	 * @param model
	 * @return SIJGM002.jsp
	 * @throws
	 * @author SyoriMori
	 * @since 2018/03/11
	 *
	 */
	@RequestMapping(value = "/sijMessage", method = RequestMethod.POST)
	public String sijMessage(Model model) {
    	SIJGM002Form sijGm002Form = new SIJGM002Form();
		BeanUtils.copyProperties(sijGm002MAV, sijGm002Form);
		model.addAttribute("SIJGM002Form",sijGm002Form);

		return "SIJGM002";
	}

	/**
	 * 新規登録処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "entrySijGm002", method = RequestMethod.POST)
	public ModelAndView entrySijGm002(SIJGM002Form sijGm002Form,Model model) {
		//フォームの値をDtoへコピー
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijGm002Form,sijGm002Dto);
		System.out.println("Formの値");
		System.out.println(sijGm002Form.getSyain_id());
		System.out.println(sijGm002Form.getSyain_na());
		System.out.println(sijGm002Form.getBirth_dt());
		System.out.println(sijGm002Form.getMoyori_eki_1());

		System.out.println("Dtoの値");
		System.out.println(sijGm002Dto.getSyain_id());
		System.out.println(sijGm002Dto.getSyain_na());
		System.out.println(sijGm002Dto.getBirth_dt());
		System.out.println(sijGm002Dto.getMoyori_eki_1());

		//入力チェック処理
		sijGm002Service.inputCheck(sijGm002Dto);
		if(!sijGm002Dto.getError_hyoji().isEmpty()) {
			BeanUtils.copyProperties(sijGm002Dto,sijGm002MAV);
			System.out.println(sijGm002MAV.getError_hyoji());
			System.out.println(sijGm002MAV.getSyain_id());
			return new ModelAndView("forward:/sijMessage","initSijGm002",sijGm002MAV);
		}
		BeanUtils.copyProperties(sijGm002Dto,sijGm002MAV);
		System.out.println(sijGm002MAV.getMoyori_eki_1());
		return new ModelAndView("forward:/initSijGm002","SIJGM002MAV",sijGm002MAV);
	}

	/**
	 * 更新処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */

	@RequestMapping(value = "/initSijGm002",params = "updateSijGm002", method = RequestMethod.POST)
	public ModelAndView updateSijGm002(SIJGM002Form sijGm002Form,Model model) {
		//フォームの値をDtoへコピー
		SIJGM002Dto sijGm002Dto = setSijGm002dto(sijGm002Form);
		BeanUtils.copyProperties(sijGm002Form,sijGm002Dto);

		//入力チェック処理
		sijGm002Dto = sijGm002Service.inputCheck(sijGm002Dto);
		if(!sijGm002Dto.getError_hyoji().isEmpty()) {
			BeanUtils.copyProperties(sijGm002MAV,sijGm002Dto);
			return new ModelAndView("forward:/sijMessage","SIJGM002MAV",sijGm002MAV);
		}
		//更新処理
		sijGm002Dto = sijGm002Service.updateSyainInfo(sijGm002Dto);
//		sijGm002Service.updateSyainInfo(sijGm002Dto);
		if(!sijGm002Dto.getError_hyoji().isEmpty()) {
			List<String> resultMessage = new ArrayList<String>();
			resultMessage.add(SIJMessage.SIJE001.getMessage());
			resultMessage.add(SIJMessage.SIJE002.getMessage());
			resultMessage.add(SIJMessage.SIJE003.getMessage());
			resultMessage.add(SIJMessage.SIJE004.getMessage());
			resultMessage.add(SIJMessage.SIJE005.getMessage());
			resultMessage.add(SIJMessage.SIJE006.getMessage());
			resultMessage.add(SIJMessage.SIJE007.getMessage());
			resultMessage.add(SIJMessage.SIJE008.getMessage());
			resultMessage.add(SIJMessage.SIJE009.getMessage());
			resultMessage.add(SIJMessage.SIJE0010.getMessage());
			resultMessage.add(SIJMessage.SIJE011.getMessage());
			resultMessage.add(SIJMessage.SIJE012.getMessage());
			resultMessage.add(SIJMessage.SIJE013.getMessage());
			resultMessage.add(SIJMessage.SIJE014.getMessage());
			resultMessage.add(SIJMessage.SIJE015.getMessage());
			resultMessage.add(SIJMessage.SIJE016.getMessage());
			resultMessage.add(SIJMessage.SIJE017.getMessage());
			resultMessage.add(SIJMessage.SIJE018.getMessage());
			resultMessage.add(SIJMessage.SIJE0019.getMessage());
			resultMessage.add(SIJMessage.SIJE020.getMessage());
			resultMessage.add(SIJMessage.SIJE021.getMessage());
//			sijGm002Dto.setError_hyoji(resultMessage);
			sijGm002MAV.setError_hyoji(resultMessage);
			BeanUtils.copyProperties(sijGm002Dto,sijGm002MAV);
			return new ModelAndView("forward:/sijMessage","SIJGM002MAV",sijGm002MAV);
		}
		BeanUtils.copyProperties(sijGm002Dto,sijGm002MAV);
		return new ModelAndView("forward:/reInitSijGm002","SIJGM002MAV",sijGm002MAV);
	}

	/**
	 * 削除処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
//	@RequestMapping(value = "/initSijGm002",params = "deleteSijGm002", method = RequestMethod.POST)
//	public ModelAndView deleteSijGm002(SIJGM002Form sijGm002Form,Model model) {
//		//フォームの値をDtoへコピー
//		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
//		BeanUtils.copyProperties(sijGm002Form, sijGm002Dto);
//
//		//入力チェック処理
//		sijGm002Service.inputCheck(sijGm002Dto);
//		if(!sijGm002Dto.getError_hyoji().isEmpty()) {
//			BeanUtils.copyProperties(sijGm002Dto, sijGm002MAV);
//			return new ModelAndView("forward:/sijMessage","SIJGM002MAV",sijGm002MAV);
//		}
//
//		//削除処理
//		sijGm002Service.delSyainInfo(sijGm002Dto);
//			return new ModelAndView("forward:/initSijGm002","COMGM001MAV",sijGm002MAV);
//	}

	/**
	 * 戻る処理（遷移先：メニュー画面）
	 * @param SIJGM002Form
	 * @return COMGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "backComGm002", method = RequestMethod.POST)
	public ModelAndView backComGm002(SIJGM002Form sijGm002Form,Model model) {
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijGm002Form, sijGm002Dto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
		BeanUtils.copyProperties(sijGm002Form, sijGm002MAV);

		return new ModelAndView("forward:/initComGm002","SIJGM002MAV",sijGm002MAV);
	}

	/**
	 * 戻る処理（遷移先：社員情報一覧表示画面）
	 * @param SIJGM002Form
	 * @return SiJGM001Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "backSijGm001", method = RequestMethod.POST)
	public ModelAndView backSijGm001(SIJGM002Form sijGm002Form,Model model) {
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijGm002Form, sijGm002Dto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
		BeanUtils.copyProperties(sijGm002Form, sijGm002MAV);

		return new ModelAndView("forward:/initSijGm001","SIJGM002MAV",sijGm002MAV);
	}



private SIJGM002Dto setSijGm002dto(SIJGM002Form sijgm002Form) {

	// Dtoを生成
	SIJGM002Dto sijGm002Dto = new SIJGM002Dto();

	// 日付を取得
	Date date = new Date();
	// ログイン情報を取得
	LoginInfoDto loginInfoDto = new LoginInfoDto();
	String userId = (String)loginInfo.getAttribute().getUser_id();

	// DtoにFormの値を設定する
	BeanUtils.copyProperties(sijgm002Form,sijGm002Dto);

	return sijGm002Dto;
}

private SIJGM002Form setSijGm002Form(SIJGM002Dto sijgm002Dto) {

	// Formを生成
	SIJGM002Form sijGm002Form = new SIJGM002Form();

	// FormにDtoの値を設定する
	BeanUtils.copyProperties(sijgm002Dto, sijGm002Form);

	return sijGm002Form;
}
}

