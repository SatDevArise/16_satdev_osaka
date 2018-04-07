package jp.arise.sij.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import jp.arise.sij.dao.SIJGM002Dao;
import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.sij.message.SIJMessage;
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
	 * 社員情報更新処理
	 *
	 * @param SIJGM002Dto
	 * @return SIJGM002Dto
	 */
	public SIJGM002Dto upSyainInfo(SIJGM002Dto dto) {
		sijGm002Dao.upSyainInfo(dto);

//		//セッション情報設定処理
//		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
//		sijGm002Dto.setSyain_id(dto.getSyain_id());
//		sijGm002Dto.setName(dto.getName());

		return dto;
	}
	/**
	 * 社員情報新規情報登録処理
	 *
	 * @param SIJGM002Dto
	 * @return SIJGM002Dto
	 */
	public SIJGM002Dto insertSyainInfo(SIJGM002Dto dto) {
		sijGm002Dao.insertSyainInfo(dto);

//		//セッション情報設定処理
//		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
//		sijGm002Dto.setSyain_id(dto.getSyain_id());
//		sijGm002Dto.setName(dto.getName());


		return dto;
	}

	/**
	 * 社員情報削除処理
	 *
	 * @param SIJGM002Dto
	 * @return SIJGM002Dto
	 *
	 */
	public SIJGM002Dto delSyainInfo(SIJGM002Dto dto){
		sijGm002Dao.delSyainInfo(dto);

		//セッション情報設定処理
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		sijGm002Dto.setSyain_id(dto.getSyain_id());
		sijGm002Dto.setName(dto.getName());

		return dto;
	}


	/**
	 * 入力チェック
	 *
	 * @param dto
	 * @return
	 */
	public SIJGM002Dto inputCheck(SIJGM002Dto dto) {
		//入力チェック
		validation(dto);
		if(!dto.getError_hyoji().isEmpty()) {
			return dto;
		}
		return dto;
	}
		/**
		 * 入力チェック
		 * @param SIJGM002Dto
		 * @return -
		 * @author SyoriMori
		 */
		private void validation(SIJGM002Dto dto) {
		List<String> resultMessage = new ArrayList<String>();
		// 社員ID：必須入力チェック
		if (StringUtils.isEmpty(dto.getSyain_id())) {
			 resultMessage.add(SIJMessage.SIJE001.getMessage());
		} else {
			// 社員ID：半角文字チェック
			if (!patternCheck(dto.getSyain_id())) {
				resultMessage.add(SIJMessage.SIJE008.getMessage());
			}
			// 社員ID：桁数チェック
			if (!digitCheck(dto.getSyain_id(), UTLContent.INT_EIGHT)) {
				resultMessage.add(SIJMessage.SIJE012.getMessage());
			}
		}

		// 氏名：必須入力チェック
		if (StringUtils.isEmpty(dto.getName())) {
			 resultMessage.add(SIJMessage.SIJE002.getMessage());
		} else {
			// 氏名：全角文字チェック
			if (patternCheck(dto.getName())) {
				resultMessage.add(SIJMessage.SIJE013.getMessage());
			}
			// 氏名：桁数チェック
			if (!digitCheck(dto.getName(), UTLContent.INT_EIGHT)) {
				resultMessage.add(SIJMessage.SIJE014.getMessage());
			}
		}

		// 生年月日：必須入力チェック
		if (StringUtils.isEmpty(dto.getBirth())) {
			   resultMessage.add(SIJMessage.SIJE003.getMessage());
		} else {
			// 生年月日：半角文字チェック
			if (!patternCheck(dto.getBirth())) {
				resultMessage.add(SIJMessage.SIJE004.getMessage());
			}
			// 生年月日：桁数チェック
			if (!digitCheck(dto.getBirth(), UTLContent.INT_EIGHT)) {
				resultMessage.add(SIJMessage.SIJE005.getMessage());
			}
		}
		// 最寄り駅1：必須入力チェック
		if (StringUtils.isEmpty(dto.getMoyori_1_station())) {
			 resultMessage.add(SIJMessage.SIJE006.getMessage());
		} else {
			// 最寄り駅1：全角文字チェック
			if (patternCheck(dto.getMoyori_1_station())) {
				resultMessage.add(SIJMessage.SIJE015.getMessage());
			}
			// 最寄り駅1：桁数チェック
			if (!digitCheck(dto.getMoyori_1_station(), UTLContent.INT_EIGHT)) {
				resultMessage.add(SIJMessage.SIJE016.getMessage());
			}
		}

		// 最寄り駅2：必須入力チェック
		if (!StringUtils.isEmpty(dto.getMoyori_3_station())) {
			 resultMessage.add(SIJMessage.SIJE007.getMessage());
		} else {
			// 最寄り駅2：全角文字チェック
			if (patternCheck(dto.getMoyori_2_station())) {
				resultMessage.add(SIJMessage.SIJE017.getMessage());
			}
			// 最寄り駅2：桁数チェック
			if (!digitCheck(dto.getMoyori_2_station(), UTLContent.INT_EIGHT)) {
				resultMessage.add(SIJMessage.SIJE018.getMessage());
			}
		}
		// 連絡先：必須入力チェック
		if (!StringUtils.isEmpty(dto.getPhoneNumber())) {
			 resultMessage.add(SIJMessage.SIJE008.getMessage());
		} else {
			// 連絡先：半角文字チェック
			if (!patternCheck(dto.getPhoneNumber())) {
				resultMessage.add(SIJMessage.SIJE009.getMessage());
			}
			// 連絡先：桁数チェック
			if (!digitCheck(dto.getPhoneNumber(), UTLContent.INT_EIGHT)) {
				resultMessage.add(SIJMessage.SIJE0010.getMessage());
			}
		}

		dto.setError_hyoji(resultMessage);
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

