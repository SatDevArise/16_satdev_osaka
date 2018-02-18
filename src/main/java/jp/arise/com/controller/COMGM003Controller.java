package jp.arise.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.dto.COMGM003Dto;
import jp.arise.com.form.COMGM003Form;
import jp.arise.com.message.COMMessage;
import jp.arise.com.modelandview.COMGM003MAV;
import jp.arise.com.service.COMGM003Servise;


/**
 * COMGM003 検索共通画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class COMGM003Controller {

	@Autowired
	private COMGM003Servise comGm003Service;

	public COMGM003MAV comGm003MAV = new COMGM003MAV();

    @ModelAttribute
    public COMGM003Form setComGm003Formm() {
    	COMGM003Form comGm003Form = new COMGM003Form();
        return comGm003Form;
    }

	/**
	 * 初期処理
	 * @param model
	 * @return COMGM003.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm003", method = RequestMethod.GET)
	public String initComGm003(Model model) {
		COMGM003Form comGm003Form = new COMGM003Form();
		COMGM003Dto comGm003Dto = new COMGM003Dto();
		BeanUtils.copyProperties(comGm003Form,comGm003Dto);

		//　遷移元画面取得処理
    	comGm003Service.getMotoGamenId(comGm003Dto);
    	BeanUtils.copyProperties(comGm003Dto,comGm003Form);
		model.addAttribute("COMGM003Form",comGm003Form);

		return "COMGM003";
	}

	/**
	 * 初期処理(検索後)
	 * @param model
	 * @return COMGM003.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/reInitComGm003", method = RequestMethod.GET)
	public String reInitComGm003(Model model) {
		COMGM003Form comGm003Form = new COMGM003Form();
		BeanUtils.copyProperties(comGm003MAV, comGm003Form);
		model.addAttribute("COMGM003Form",comGm003Form);

		return "COMGM003";
	}

	/**
	 * エラー画面表示
	 * @param model
	 * @return COMGM003.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/errorComGm003", method = RequestMethod.POST)
	public String errorComGm003(Model model) {
		COMGM003Form comGm003Form = new COMGM003Form();
		BeanUtils.copyProperties(comGm003MAV, comGm003Form);
		model.addAttribute("COMGM003Form",comGm003Form);

		return "COMGM003";
	}

	/**
	 * 検索処理
	 * @param COMGM003Form
	 * @return COMGM003.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm003",params = "searchComGm003",method = RequestMethod.POST)
	public ModelAndView  searchComGm003(COMGM003Form comGm003Form,Model model) {
		COMGM003Dto comGm003Dto = new COMGM003Dto();
		BeanUtils.copyProperties(comGm003Form,comGm003Dto);

		//入力チェック処理
		comGm003Dto = comGm003Service.inputCheck(comGm003Dto);
		if(!comGm003Dto.getError_hyoji().isEmpty()) {
			BeanUtils.copyProperties(comGm003Dto, comGm003MAV);
			return new ModelAndView("forward:/errorComGm003","COMGM003MAV",comGm003MAV);
		}

		//検索処理
		comGm003Dto = comGm003Service.search(comGm003Dto);
		if(comGm003Dto.getResultList().isEmpty()) {
			List<String> resultMessage = new ArrayList<String>();
			resultMessage.add(COMMessage.COME008.getMessage());
			comGm003Dto.setError_hyoji(resultMessage);
			BeanUtils.copyProperties(comGm003Dto, comGm003MAV);
			return new ModelAndView("forward:/errorComGm003","COMGM003MAV",comGm003MAV);
		}

		BeanUtils.copyProperties(comGm003Dto, comGm003MAV);

		return new ModelAndView("forward:/reInitComGm003","COMGM003MAV",comGm003MAV);
	}

}
