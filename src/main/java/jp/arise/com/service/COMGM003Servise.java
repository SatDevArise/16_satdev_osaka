package jp.arise.com.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import jp.arise.com.dao.COMGM003Dao;
import jp.arise.com.dto.COMGM003Dto;
import jp.arise.com.message.COMMessage;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.UTLContent;

/**
 * COMGM001 ログイン画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM003Servise {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private COMGM003Dao comGm003Dao;

	/**
	 * 入力チェック
	 * @param COMGM003Dto
	 * @return -
	 * @author AtsushiNishizawa
	 */
	public COMGM003Dto inputCheck(COMGM003Dto dto) {
		List<String> resultMessage = new ArrayList<String>();

		//社員IDの入力がある場合チェックを行う
		if(!StringUtils.isEmpty(dto.getSyain_id())) {
			// 数字チェック
			if (!numberCheck(dto.getSyain_id())) {
				resultMessage.add(COMMessage.COME009.getMessage());
			}
			// 桁数チェック
			if (!digitCheck(dto.getSyain_id(), UTLContent.INT_FOUR)) {
				resultMessage.add(COMMessage.COME009.getMessage());
			}
		}

		//生年月日（From）の入力がある場合チェックを行う
		if(!StringUtils.isEmpty(dto.getSeinengappi_from())) {
			// 数字チェック
			if (!numberCheck(dto.getSeinengappi_from())) {
				resultMessage.add(COMMessage.COME010.getMessage());
			}
			// 桁数チェック
			if (!digitCheck(dto.getSeinengappi_from(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME010.getMessage());
			}
			// 形式チェック
			if (!dateCheck(dto.getSeinengappi_from())) {
				resultMessage.add(COMMessage.COME011.getMessage());
			}
		}

		//生年月日（To）の入力がある場合チェックを行う
		if(!StringUtils.isEmpty(dto.getSeinengappi_to())) {
			// 数字チェック
			if (!numberCheck(dto.getSeinengappi_to())) {
				resultMessage.add(COMMessage.COME010.getMessage());
			}
			// 桁数チェック
			if (!digitCheck(dto.getSeinengappi_to(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME010.getMessage());
			}
			// 形式チェック
			if (!dateCheck(dto.getSeinengappi_to())) {
				resultMessage.add(COMMessage.COME011.getMessage());
			}
		}

		//入社日（From）の入力がある場合チェックを行う
		if(!StringUtils.isEmpty(dto.getNyusyabi_from())) {
			// 数字チェック
			if (!numberCheck(dto.getNyusyabi_from())) {
				resultMessage.add(COMMessage.COME012.getMessage());
			}
			// 桁数チェック
			if (!digitCheck(dto.getNyusyabi_from(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME012.getMessage());
			}
			// 形式チェック
			if (!dateCheck(dto.getNyusyabi_from())) {
				resultMessage.add(COMMessage.COME013.getMessage());
			}
		}

		//入社日（To）の入力がある場合チェックを行う
		if(!StringUtils.isEmpty(dto.getNyusyabi_to())) {
			// 数字チェック
			if (!numberCheck(dto.getNyusyabi_to())) {
				resultMessage.add(COMMessage.COME012.getMessage());
			}
			// 桁数チェック
			if (!digitCheck(dto.getNyusyabi_to(), UTLContent.INT_EIGHT)) {
				resultMessage.add(COMMessage.COME012.getMessage());
			}
			// 形式チェック
			if (!dateCheck(dto.getNyusyabi_to())) {
				resultMessage.add(COMMessage.COME013.getMessage());
			}
		}

		//単価の入力がある場合チェックを行う
		if (!StringUtils.isEmpty(dto.getTanka())) {
			// 数字チェック
			if (!numberPeriodCheck(dto.getTanka())) {
				resultMessage.add(COMMessage.COME012.getMessage());
			}
		}

		dto.setError_hyoji(resultMessage);

        return dto;
	}

	/**
	 * 遷移元画面取得
	 * @param COMGM003Dto
	 * @return COMGM003Dto
	 * @author AtsushiNishizawa
	 */
	public COMGM003Dto getMotoGamenId(COMGM003Dto dto) {

		// セッションから遷移元画面IDを取得
		dto.setDisp_id((String)loginInfo.getAttribute().getGamen_id());
		return dto;
	}

	/**
	 * 検索処理
	 * @param COMGM003Dto
	 * @return List<COMGM003Dto>
	 * @author AtsushiNishizawa
	 */
	public COMGM003Dto search(COMGM003Dto dto) {
		List<COMGM003Dto> resultList = new ArrayList<COMGM003Dto>();

		// 遷移元画面によって検索処理を分岐
		if(UTLContent.GMID_SIJGM001.equals(dto.getDisp_id())) {
			//社員情報検索処理
			resultList = comGm003Dao.getSyainInfoList(dto);
		} else if(UTLContent.GMID_GBJGM001.equals(dto.getDisp_id())) {
			//現場情報検索処理
			resultList = comGm003Dao.getGenbaInfoList(dto);
		}
		dto.setResultList(resultList);

		return dto;
	}

	/**
	 * 数字チェック
	 * @param String
	 * @return true:OK false:NG
	 * @author AtsushiNishizawa
	 */
	private boolean numberCheck(String str) {
		if(!str.matches("^[0-9]+$")) {
			return false;
		}
		return true;
	}

	/**
	 * 数字チェック(ピリオド含む)
	 * @param String
	 * @return true:OK false:NG
	 * @author AtsushiNishizawa
	 */
	private boolean numberPeriodCheck(String str) {
		if(!str.matches("^[0-9.]+$")) {
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

	/**
	 * 日付形式チェック
	 * @param String,int
	 * @return true:OK false:NG
	 * @author AtsushiNishizawa
	 */
	private boolean dateCheck(String str) {
		DateFormat format=new SimpleDateFormat("YYYYMMDD");
		try {
		    format.parse(str);
		    return true;
		} catch (ParseException e) {
			return false;
		}
	}
}
