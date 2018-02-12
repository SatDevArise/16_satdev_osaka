package jp.arise.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.dto.COMGM002Dto;
import jp.arise.com.form.COMGM002Form;
import jp.arise.com.modelandview.COMGM001MAV;
import jp.arise.com.service.COMGM002Servise;

/**
 * COMGM002 メニュー画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class COMGM002Controller {

	@Autowired
	private COMGM002Servise comGm002Service;

    @ModelAttribute
    public COMGM002Form setComGm002Formm() {
    	COMGM002Form comGm002Form = new COMGM002Form();
        return comGm002Form;
    }

	/**
	 * 初期処理
	 * @param model
	 * @return COMGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", method = RequestMethod.POST)
	public String initComGm002(COMGM001MAV comGm001MAV,Model model) {
		COMGM002Dto comGm002Dto = new COMGM002Dto();

		//お知らせ情報取得処理
		List<COMGM002Dto> osiraseList = comGm002Service.getOsiraseInfo(comGm002Dto);

		COMGM002Form comGm002Form = new COMGM002Form();
		comGm002Form.setNews(osiraseList);
		model.addAttribute("COMGM002Form", comGm002Form);

		return "COMGM002";
	}

	/**
	 * 社員情報一覧表示画面遷移処理
	 * @param SYSCOMForm
	 * @return SIJGM001Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", params = "goSijGm001",method = RequestMethod.POST)
	public ModelAndView goSijGm001(COMGM002Form comGm002Form,Model model) {
		// セッション情報設定処理
		comGm002Service.setSession();

		return new ModelAndView("forward:/initSijGm001");
	}

	/**
	 * 社員情報新規登録・編集画面遷移処理
	 * @param SYSCOMForm
	 * @return SIJGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", params = "goSijGm002",method = RequestMethod.POST)
	public ModelAndView goSijGm002(COMGM002Form comGm002Form,Model model) {
		// セッション情報設定処理
		comGm002Service.setSession();

		return new ModelAndView("forward:/initSijGm002");
	}

	/**
	 * 現場情報一覧表示画面<遷移処理
	 * @param SYSCOMForm
	 * @return GBJGM001Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", params = "goGbjGm001",method = RequestMethod.POST)
	public ModelAndView goGbjGm001(COMGM002Form comGm002Form,Model model) {
		// セッション情報設定処理
		comGm002Service.setSession();

		return new ModelAndView("forward:/initGbjGm001");
	}

	/**
	 * 現場情報新規登録・編集画面遷移処理
	 * @param SYSCOMForm
	 * @return GBJGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", params = "goGbjGm002",method = RequestMethod.POST)
	public ModelAndView goGbjGm002(COMGM002Form comGm002Form,Model model) {
		// セッション情報設定処理
		comGm002Service.setSession();

		return new ModelAndView("forward:/initGbjGm002");
	}

	/**
	 * システム管理画面へ遷移処理
	 * @param SYSCOMForm
	 * @return
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", params = "goSysComGm",method = RequestMethod.POST)
	public ModelAndView goSysComGm(COMGM002Form comGm002Form,Model model) {
		// セッション情報設定処理
		comGm002Service.setSession();

		return new ModelAndView("forward:/initSysComGm");
	}

	/**
	 * ログイン画面遷移処理
	 * @param model
	 * @return COMGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm002", params = "goComGm001", method = RequestMethod.POST)
	public ModelAndView goComGm001(COMGM002Form comGm002Form,Model model) {

		//ログアウト処理
		comGm002Service.logout();

		return new ModelAndView("forward:/initComGm001");
	}
}
