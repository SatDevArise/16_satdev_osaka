package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM002Dao;
import jp.arise.com.dto.COMGM002Dto;
import jp.arise.com.message.COMMessage;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;
import jp.arise.utl.UTLContent;

/**
 * COMGM002 メニュー画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM002Servise {

	@Autowired
	private COMGM002Dao comGm002Dao;

	@Autowired
	public LoginInfo loginInfo;

	/**
	 * お知らせ情報取得処理
	 * @param COMGM002Dto
	 * @return List<COMGM002Dto>
	 * @author AtsushiNishizawa
	 */
	public List<COMGM002Dto> getOsiraseInfo(COMGM002Dto dto) {
        List<COMGM002Dto> resultList = comGm002Dao.getOsiraseInfo(loginInfo.getAttribute().getUnyoubi());

        //　お知らせ情報がなかった場合
        if(resultList.isEmpty()) {
        	COMGM002Dto osiraseInfo = new COMGM002Dto();
        	osiraseInfo.setOsirase_info(COMMessage.COMI007.getMessage());
        	resultList.add(osiraseInfo);
        }

		return resultList;
	}

	/**
	 * セッション情報設定処理
	 * @param -
	 * @return -
	 * @author AtsushiNishizawa
	 */
	public void setSession() {
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUser_id(loginInfo.getAttribute().getUser_id());
		loginInfoDto.setUser_na(loginInfo.getAttribute().getUser_na());
		loginInfoDto.setUnyoubi(loginInfo.getAttribute().getUnyoubi());
		loginInfoDto.setGamen_id(UTLContent.GMID_COMGM002);
		loginInfo.setAttribute(loginInfoDto);
	}

	/**
	 * ログアウト処理
	 * @param -
	 * @return -
	 * @author AtsushiNishizawa
	 */
	public void logout() {
		// セッション情報を破棄
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUser_id("");
		loginInfoDto.setUser_na("");
		loginInfoDto.setUnyoubi("");
		loginInfoDto.setGamen_id("");
		loginInfo.setAttribute(loginInfoDto);

		// ログイン履歴更新
		comGm002Dao.updateRireki();
	}
}
