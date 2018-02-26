package jp.arise.sij.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import jp.arise.com.message.COMMessage;
import jp.arise.sij.dao.SIJGM002Dao;
import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.utl.UTLContent;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス
 *
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SIJGM002Servise {

	@Autowired
	private SIJGM002Dao sijGm002Dao;

	/**
	 * 社員ID取得処理
	 *
	 * @param dto
	 * @return
	 */
	public SIJGM002Dto getSyain_dt(SIJGM002Dto dto) {
		String syain_id = dto.getSyain_id();
		System.out.println(syain_id);

		sijGm002Dao.upSyainInfo(dto);

		return dto;
	}


	/**
	 * 入力チェック
	 *
	 * @param dto
	 * @return
	 */
	public SIJGM002Dto inputCheck(SIJGM002Dto dto) {

		List<String> resultMessage = new ArrayList<String>();
		// 社員ID：必須入力チェック
		if (StringUtils.isEmpty(dto.getSyain_id())) {
			// resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// 社員ID：半角文字チェック
			if (!patternCheck(dto.getSyain_id())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// 社員ID：桁数チェック
			if (!digitCheck(dto.getSyain_id(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}

		// 氏名：必須入力チェック
		if (StringUtils.isEmpty(dto.getName())) {
			// resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// 氏名：全角文字チェック
			if (patternCheck(dto.getName())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// 氏名：桁数チェック
			if (!digitCheck(dto.getName(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}

		// 生年月日：必須入力チェック
		if (StringUtils.isEmpty(dto.getBirth())) {
			// resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// 生年月日：半角文字チェック
			if (!patternCheck(dto.getBirth())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// 生年月日：桁数チェック
			if (!digitCheck(dto.getBirth(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}
		// 最寄り駅1：必須入力チェック
		if (StringUtils.isEmpty(dto.getMoyori_1_station())) {
			// resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// 最寄り駅1：全角文字チェック
			if (patternCheck(dto.getMoyori_1_station())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// 最寄り駅1：桁数チェック
			if (!digitCheck(dto.getMoyori_1_station(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}

		// 最寄り駅2：必須入力チェック
		if (!StringUtils.isEmpty(dto.getMoyori_3_station())) {
			// resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// 最寄り駅2：全角文字チェック
			if (patternCheck(dto.getMoyori_2_station())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// 最寄り駅2：桁数チェック
			if (!digitCheck(dto.getMoyori_2_station(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}
		// 連絡先：必須入力チェック
		if (!StringUtils.isEmpty(dto.getPhoneNumber())) {
			// resultMessage.add(COMMessage.COME005.getMessage());
		} else {
			// 連絡先：半角文字チェック
			if (!patternCheck(dto.getPhoneNumber())) {
				resultMessage.add(COMMessage.COME001.getMessage());
			}
			// 連絡先：桁数チェック
			if (!digitCheck(dto.getPhoneNumber(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME002.getMessage());
			}
		}

		return dto;
	}

	/**
	 * 半角文字チェック
	 *
	 * @param String
	 * @return true:OK false:NG
	 * @suthor Masashi.Yamamoto
	 */
	private boolean patternCheck(String str) {
		if (!str.matches("^[0-9A-Za-z]+$")) {
			return false;
		}
		return true;

	/**
	 * 半角文字チェック
	 *
	 * @param String
	 * @return true:OK false:NG
	 * @suthor Masashi.Yamamoto
	 */
	private boolean patternCheck(String str) {
		if (!str.matches("^[0-9A-Za-z]+$")) {
			return false;
		}
		return true;
	}



	/**
	 * 桁数チェック
	 *
	 * @param String,int
	 * @return true:OK false:NG
	 * @author MasashiYamamoto
	 */
	private boolean digitCheck(String str, int digit) {
		if (!(digit == str.length())) {
			return false;
		}
		return true;

	/**
	 * 半角文字チェック
	 *
	 * @param String
	 * @return true:OK false:NG
	 * @suthor Masashi.Yamamoto
	 */
	private boolean patternCheck(String str) {
		if (!str.matches("^[0-9A-Za-z]+$")) {
			return false;
		}
		return true;
	}



	/**
	 * 桁数チェック
	 *
	 * @param String,int
	 * @return true:OK false:NG
	 * @author MasashiYamamoto
	 */
	private boolean digitCheck(String str, int digit) {
		if (!(digit == str.length())) {
			return false;
		}
		return true;
	}



	/**
	 * 桁数チェック
	 *
	 * @param String,int
	 * @return true:OK false:NG
	 * @author MasashiYamamoto
	 */
	private boolean digitCheck(String str, int digit) {
		if (!(digit == str.length())) {
			return false;
		}
		return true;
}
}
}
}