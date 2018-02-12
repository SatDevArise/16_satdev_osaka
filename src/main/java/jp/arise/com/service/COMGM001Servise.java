package jp.arise.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import jp.arise.com.dao.COMGM001Dao;
import jp.arise.com.dto.COMGM001Dto;
import jp.arise.com.message.COMMessage;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;
import jp.arise.utl.UTLContent;

/**
 * COMGM001 ログイン画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM001Servise {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private COMGM001Dao comGm001Dao;

	/**
	 * ユーザーチェック処理
	 * @param COMGM001Dto
	 * @return COMGM001Dto
	 * @author AtsushiNishizawa
	 */
	public COMGM001Dto login(COMGM001Dto dto) {
		//入力チェック
		validation(dto);
		if(!dto.getError_hyoji().isEmpty()) {
			return dto;
		}

		//ログインユーザー判定処理
		LoginInfoDto resultDto = comGm001Dao.getLoginInfo(dto);

		if(StringUtils.isEmpty(resultDto)) {
			List<String> resultMessage = new ArrayList<String>();
			resultMessage.add(COMMessage.COME004.getMessage());
			dto.setError_hyoji(resultMessage);
			return dto;
		}

		//ログイン履歴作成処理
		if(StringUtils.isEmpty(comGm001Dao.getRireki(resultDto))) {
			comGm001Dao.createRireki(resultDto);
		} else {
			// ログイン履歴更新
			comGm001Dao.updateRireki(resultDto);
		}

		//セッション情報設定処理
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUser_id(resultDto.getUser_id());
		loginInfoDto.setUser_na(resultDto.getUser_na());
		loginInfoDto.setUnyoubi(resultDto.getUnyoubi());
		loginInfoDto.setGamen_id(UTLContent.GMID_COMGM001);
		loginInfo.setAttribute(loginInfoDto);

		return dto;
	}

	/**
	 * 入力チェック
	 * @param COMGM001Dto
	 * @return -
	 * @author AtsushiNishizawa
	 */
	private void validation(COMGM001Dto dto) {

		List<String> resultMessage = new ArrayList<String>();
		//ユーザーID：必須入力チェック
		if(StringUtils.isEmpty(dto.getUser_id())) {
			resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// ユーザーID：半角英数字チェック
			if (!patternCheck(dto.getUser_id())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// ユーザーID：桁数チェック
			if (!digitCheck(dto.getUser_id(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}

		//パスワード：必須入力チェック
		if(StringUtils.isEmpty(dto.getPassword())) {
			resultMessage.add(COMMessage.COME006.getMessage());
		} else {
			// パスワード：半角英数字チェック
			if (!patternCheck(dto.getPassword())) {
				resultMessage.add(COMMessage.COME003.getMessage());
			}
		}

		dto.setError_hyoji(resultMessage);
	}

	/**
	 * 半角英数字チェック
	 * @param String
	 * @return true:OK false:NG
	 * @author AtsushiNishizawa
	 */
	private boolean patternCheck(String str) {
		if(!str.matches("^[0-9A-Za-z]+$")) {
			return false;
		}
		return true;
	}

	/**
	 * 桁数チェック
	 * @param String,int
	 * @return true:OK false:NG
	 * @author AtsushiNishizawa
	 */
	private boolean digitCheck(String str,int digit) {
		if(!(digit == str.length())) {
			return false;
		}
		return true;
	}
}
