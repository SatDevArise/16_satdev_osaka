package jp.arise.sij.controller;

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
		SIJGM002Servise sijgm002Servise = new SIJGM002Servise();



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
	 * 新規登録処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "entrySijGm002", method = RequestMethod.POST)
	public String entrySijGm002(SIJGM002Form sijGm002Form,Model model) {
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijGm002Form,sijGm002Dto);
		sijGm002Dto.setSyain_id(sijGm002Form.getSyain_id());
		System.out.print(sijGm002Dto.getSyain_id());
		System.out.print(sijGm002Form.getSyain_id());
		System.out.print(sijGm002Dto.getBirth());
		System.out.print(sijGm002Form.getBirth());
		System.out.print(sijGm002Dto.getMoyori_1_station());
		System.out.print(sijGm002Form.getMoyori_1_station());

//		sijGm002Dto.setName(sijGm002Form.getName());
//		sijGm002Dto.setBirth(sijGm002Form.getBirth());
//		sijGm002Dto.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
//		sijGm002Dto.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
//		sijGm002Dto.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
//		sijGm002Dto.setPhoneNumber(sijGm002Form.getPhoneNumber());
//		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
//		sijGm002Dto.setBirth_place(sijGm002Form.getBirth_place());
//		sijGm002Dto.setPosition(sijGm002Form.getPosition());
//		sijGm002Dto.setNyusya_dt(sijGm002Form.getNyusya_dt());
//		sijGm002Dto.setTeam_na(sijGm002Form.getTeam_na());
//		sijGm002Dto.setPhase_kb(sijGm002Form.getPhase_kb());
//		sijGm002Dto.setTanka(sijGm002Form.getTanka());
//		sijGm002Dto.setGenba_na(sijGm002Form.getGenba_na());
//		sijGm002Dto.setSankaku_dt(sijGm002Form.getSankaku_dt());
//		sijGm002Dto.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
//		sijGm002Dto.setPage(sijGm002Form.getPage());

		return "SIJGM002";
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
	public String updateSijGm002(SIJGM002Form sijGm002Form,Model model) {
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijGm002Form,sijGm002Dto);

		System.out.print(sijGm002Form.getSyain_id());
		System.out.println(sijGm002Form.getBirth());
		System.out.println(sijGm002Form.getBirth_place());
		System.out.println(sijGm002Form.getGenba_na());
		System.out.println(sijGm002Form.getMoyori_1_station());
		System.out.println(sijGm002Form.getMoyori_2_station());
		System.out.println(sijGm002Form.getMoyori_3_station());
		System.out.println(sijGm002Form.getName());
		System.out.println(sijGm002Form.getNyusya_dt());
		System.out.println(sijGm002Form.getPage());
		System.out.println(sijGm002Form.getPhase_kb());
		System.out.println(sijGm002Form.getPhoneNumber());
		System.out.println(sijGm002Form.getPosition());
		System.out.println(sijGm002Form.getPrevious());
		System.out.println(sijGm002Form.getSankaku_dt());
		System.out.println(sijGm002Form.getTanka());
		System.out.println(sijGm002Form.getTeam_na());
		System.out.println(sijGm002Form.getUser());
		/*sijGm002Dto.setSyain_id(sijGm002Form.getSyain_id());
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setBirth(sijGm002Form.getBirth());
		sijGm002Dto.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
		sijGm002Dto.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
		sijGm002Dto.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
		sijGm002Dto.setPhoneNumber(sijGm002Form.getPhoneNumber());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		sijGm002Dto.setBirth_place(sijGm002Form.getBirth_place());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setNyusya_dt(sijGm002Form.getNyusya_dt());
		sijGm002Dto.setTeam_na(sijGm002Form.getTeam_na());
		sijGm002Dto.setPhase_kb(sijGm002Form.getPhase_kb());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setGenba_na(sijGm002Form.getGenba_na());
		sijGm002Dto.setSankaku_dt(sijGm002Form.getSankaku_dt());
		sijGm002Dto.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
		sijGm002Dto.setPage(sijGm002Form.getPage());
		*/
		return "SIJGM002";
	}

	/**
	 * 削除処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "deleteSijGm002", method = RequestMethod.POST)
	public String deleteSijGm002(SIJGM002Form sijGm002Form,Model model) {
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		BeanUtils.copyProperties(sijGm002Form, sijGm002Dto);

		System.out.print(sijGm002Form.getSyain_id());
		System.out.println(sijGm002Form.getBirth());
		System.out.println(sijGm002Form.getBirth_place());
		System.out.println(sijGm002Form.getGenba_na());
		System.out.println(sijGm002Form.getMoyori_1_station());
		System.out.println(sijGm002Form.getMoyori_2_station());
		System.out.println(sijGm002Form.getMoyori_3_station());
		System.out.println(sijGm002Form.getName());
		System.out.println(sijGm002Form.getNyusya_dt());
		System.out.println(sijGm002Form.getPage());
		System.out.println(sijGm002Form.getPhase_kb());
		System.out.println(sijGm002Form.getPhoneNumber());
		System.out.println(sijGm002Form.getPosition());
		System.out.println(sijGm002Form.getPrevious());
		System.out.println(sijGm002Form.getSankaku_dt());
		System.out.println(sijGm002Form.getTanka());
		System.out.println(sijGm002Form.getTeam_na());
		System.out.println(sijGm002Form.getUser());

/*		sijGm002Dto.setSyain_id(sijGm002Form.getSyain_id());
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setBirth(sijGm002Form.getBirth());
		sijGm002Dto.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
		sijGm002Dto.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
		sijGm002Dto.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
		sijGm002Dto.setPhoneNumber(sijGm002Form.getPhoneNumber());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		sijGm002Dto.setBirth_place(sijGm002Form.getBirth_place());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setNyusya_dt(sijGm002Form.getNyusya_dt());
		sijGm002Dto.setTeam_na(sijGm002Form.getTeam_na());
		sijGm002Dto.setPhase_kb(sijGm002Form.getPhase_kb());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setGenba_na(sijGm002Form.getGenba_na());
		sijGm002Dto.setSankaku_dt(sijGm002Form.getSankaku_dt());
		sijGm002Dto.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
		sijGm002Dto.setPage(sijGm002Form.getPage());
	*/
		return "SIJGM002";
	}

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
		sijGm002Dto.setSyain_id(sijGm002Form.getSyain_id());
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setBirth(sijGm002Form.getBirth());
		sijGm002Dto.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
		sijGm002Dto.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
		sijGm002Dto.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
		sijGm002Dto.setPhoneNumber(sijGm002Form.getPhoneNumber());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		sijGm002Dto.setBirth_place(sijGm002Form.getBirth_place());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setNyusya_dt(sijGm002Form.getNyusya_dt());
		sijGm002Dto.setTeam_na(sijGm002Form.getTeam_na());
		sijGm002Dto.setPhase_kb(sijGm002Form.getPhase_kb());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setGenba_na(sijGm002Form.getGenba_na());
		sijGm002Dto.setSankaku_dt(sijGm002Form.getSankaku_dt());
		sijGm002Dto.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
		sijGm002Dto.setPage(sijGm002Form.getPage());
		sijGm002Service.inputCheck(sijGm002Dto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
		sijGm002MAV.setUser(sijGm002Form.getUser());
		sijGm002MAV.setSyain_id(sijGm002Form.getSyain_id());
		sijGm002MAV.setName(sijGm002Form.getName());
		sijGm002MAV.setBirth(sijGm002Form.getBirth());
		sijGm002MAV.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
		sijGm002MAV.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
		sijGm002MAV.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
		sijGm002MAV.setPhoneNumber(sijGm002Form.getPhoneNumber());
		sijGm002MAV.setPrevious(sijGm002Form.getPrevious());
		sijGm002MAV.setBirth_place(sijGm002Form.getBirth_place());
		sijGm002MAV.setPosition(sijGm002Form.getPosition());
		sijGm002MAV.setNyusya_dt(sijGm002Form.getNyusya_dt());
		sijGm002MAV.setTeam_na(sijGm002Form.getTeam_na());
		sijGm002MAV.setPhase_kb(sijGm002Form.getPhase_kb());
		sijGm002MAV.setTanka(sijGm002Form.getTanka());
		sijGm002MAV.setGenba_na(sijGm002Form.getGenba_na());
		sijGm002MAV.setSankaku_dt(sijGm002Form.getSankaku_dt());
		sijGm002MAV.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
		sijGm002MAV.setPage(sijGm002Form.getPage());
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
		sijGm002Dto.setUser(sijGm002Form.getUser());
		sijGm002Dto.setSyain_id(sijGm002Form.getSyain_id());
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setBirth(sijGm002Form.getBirth());
		sijGm002Dto.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
		sijGm002Dto.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
		sijGm002Dto.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
		sijGm002Dto.setPhoneNumber(sijGm002Form.getPhoneNumber());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		sijGm002Dto.setBirth_place(sijGm002Form.getBirth_place());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setNyusya_dt(sijGm002Form.getNyusya_dt());
		sijGm002Dto.setTeam_na(sijGm002Form.getTeam_na());
		sijGm002Dto.setPhase_kb(sijGm002Form.getPhase_kb());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setGenba_na(sijGm002Form.getGenba_na());
		sijGm002Dto.setSankaku_dt(sijGm002Form.getSankaku_dt());
		sijGm002Dto.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
		sijGm002Dto.setPage(sijGm002Form.getPage());
		sijGm002Service.inputCheck(sijGm002Dto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
		sijGm002MAV.setUser(sijGm002Form.getUser());
		sijGm002MAV.setUser(sijGm002Form.getUser());
		sijGm002MAV.setSyain_id(sijGm002Form.getSyain_id());
		sijGm002MAV.setName(sijGm002Form.getName());
		sijGm002MAV.setBirth(sijGm002Form.getBirth());
		sijGm002MAV.setMoyori_1_station(sijGm002Form.getMoyori_1_station());
		sijGm002MAV.setMoyori_2_station(sijGm002Form.getMoyori_2_station());
		sijGm002MAV.setMoyori_3_station(sijGm002Form.getMoyori_3_station());
		sijGm002MAV.setPhoneNumber(sijGm002Form.getPhoneNumber());
		sijGm002MAV.setPrevious(sijGm002Form.getPrevious());
		sijGm002MAV.setBirth_place(sijGm002Form.getBirth_place());
		sijGm002MAV.setPosition(sijGm002Form.getPosition());
		sijGm002MAV.setNyusya_dt(sijGm002Form.getNyusya_dt());
		sijGm002MAV.setTeam_na(sijGm002Form.getTeam_na());
		sijGm002MAV.setPhase_kb(sijGm002Form.getPhase_kb());
		sijGm002MAV.setTanka(sijGm002Form.getTanka());
		sijGm002MAV.setGenba_na(sijGm002Form.getGenba_na());
		sijGm002MAV.setSankaku_dt(sijGm002Form.getSankaku_dt());
		sijGm002MAV.setKensakuKeyList(sijGm002Form.getKensakuKeyList());
		sijGm002MAV.setPage(sijGm002Form.getPage());
		return new ModelAndView("forward:/initSijGm001","SIJGM002MAV",sijGm002MAV);
	}

}
