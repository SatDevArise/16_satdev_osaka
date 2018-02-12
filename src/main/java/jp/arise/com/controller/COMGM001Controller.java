package jp.arise.com.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.dto.COMGM001Dto;
import jp.arise.com.form.COMGM001Form;
import jp.arise.com.modelandview.COMGM001MAV;
import jp.arise.com.modelandview.COMGM002MAV;
import jp.arise.com.service.COMGM001Servise;
import jp.arise.utl.LoginInfo;


/**
 * COMGM001 ログイン画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class COMGM001Controller {

	@Autowired
	public LoginInfo loginInfo;

	public COMGM001MAV comGm001MAV = new COMGM001MAV();

	@Autowired
	private COMGM001Servise comGm001Service;

    @ModelAttribute
    public COMGM001Form setComGm001Formm() {
    	COMGM001Form comGm001Form = new COMGM001Form();
        return comGm001Form;
    }

	/**
	 * 初期処理
	 * @param model
	 * @return COMGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String initComGm001(Model model) {

		return "COMGM001";
	}

	/**
	 * 初期処理(ログアウト後)
	 * @param model
	 * @return COMGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm001",params = "goComGm001", method = RequestMethod.POST)
	public String initComGm001(Model model,COMGM002MAV comGm002MAV) {
		COMGM001Form comGm001Form = new COMGM001Form();
		model.addAttribute("COMGM001Form",comGm001Form);

		return "COMGM001";
	}

	/**
	 * エラー画面表示
	 * @param model
	 * @return COMGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/errorComGm001", method = RequestMethod.POST)
	public String errorComGm001(Model model) {
		COMGM001Form comGm001Form = new COMGM001Form();
		BeanUtils.copyProperties(comGm001MAV, comGm001Form);
		model.addAttribute("COMGM001Form",comGm001Form);

		return "COMGM001";
	}

	/**
	 * ログイン処理
	 * @param COMGM001Form
	 * @return COMGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/",params = "entryComGm001",method = RequestMethod.POST)
	public ModelAndView  entryComGm001(Model model,COMGM001Form comGm001Form) {
		COMGM001Dto comGm001Dto = new COMGM001Dto();
		BeanUtils.copyProperties(comGm001Form,comGm001Dto);

		//ユーザーチェック処理
		comGm001Service.login(comGm001Dto);
		if(!comGm001Dto.getError_hyoji().isEmpty()) {
			BeanUtils.copyProperties(comGm001Dto, comGm001MAV);
			return new ModelAndView("forward:/errorComGm001","COMGM001MAV",comGm001MAV);
		}

		BeanUtils.copyProperties(comGm001Dto, comGm001MAV);

		return new ModelAndView("forward:/initComGm002","COMGM001MAV",comGm001MAV);
	}

}
