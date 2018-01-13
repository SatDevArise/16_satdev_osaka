package jp.arise.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.sys.form.SYSCOMForm;
import jp.arise.sys.modelandview.SYSCOMMAV;
import jp.arise.sys.service.SYSCOMServise;

/**
 * SYSCOM メニュー画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class SYSCOMController {

	@Autowired
	private SYSCOMServise SYSCOMService;

    @ModelAttribute
    public SYSCOMForm setSYSCOMFormm() {
    	SYSCOMForm SYSCOMForm = new SYSCOMForm();
        return SYSCOMForm;
    }

	/**
	 * 初期処理
	 * @param model
	 * @return SYSCOM.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initSysComGm",params = "goSysComGm", method = RequestMethod.POST)
	public String initSysComGm(SYSCOMMAV sysComMAV,Model model) {
		SYSCOMForm SYSCOMForm = new SYSCOMForm();
//		SYSCOMForm.setUser(sysComMAV.getUser());
		model.addAttribute("SYSCOMForm",SYSCOMForm);
		return "SYSCOM";
	}

	/**
	 * メニューに戻る
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/initSysComGm", params = "goComGm002",method = RequestMethod.POST)
	public ModelAndView goComGm002() {
		return new ModelAndView("forward:/initComGm002");
	}

}