package jp.arise.sij.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.sij.dto.SIJGM002Dto;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface SIJGM002Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	public List<SIJGM002Dto> getUser(SIJGM002Dto SIJGM002Dto);


	/**
	 * 社員情報を取得
	 * @return syainlistinfo
	 */
	public List<SIJGM002Dto> getSyain_id(SIJGM002Dto SIJGM002Dto);

///*	/**
//	 * 氏名を取得
//	 * @return syain_na
//	 */
//	public List<SIJGM002Dto> getSyain_na(SIJGM002Dto SIJGM002Dto);
//
//
//	/**
//	 * 生年月日を取得
//	 * @return birth
//	 */
//	public List<SIJGM002Dto> getBirth(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 最寄り駅3を取得
//	 * @return moyori_1_station
//	 */
//	public List<SIJGM002Dto> getMoyori_1_station(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 最寄り駅3を取得
//	 * @return moyori_2_station
//	 */
//	public List<SIJGM002Dto> getMoyori_2_station(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 最寄り駅3を取得
//	 * @return moyori_3_station
//	 */
//	public List<SIJGM002Dto> getMoyori_3_station(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 連絡先を取得
//	 * @return phonenumber
//	 */
//	public List<SIJGM002Dto> getPhonenumber(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 前職
//	 * @return previous
//	 */
//	public List<SIJGM002Dto>  getPrevious(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 入社日
//	 * @return nyusya_dt
//	 */
//	public List<SIJGM002Dto> getNyusya_dt(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 出身地
//	 * @return birth_place
//	 */
//	public List<SIJGM002Dto> getBirth_place(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * 役職
//	 * @return position
//	 */
//	public List<SIJGM002Dto> getPosition(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * チーム
//	 * @return team
//	 */
//	public List<SIJGM002Dto> getTeam(SIJGM002Dto SIJGM002Dto);
//
//	/**
//	 * フェーズ
//	 * @return phase
//	 */
//	public LIST<SIJGM002Dto> getPhase(SIJGM002Dto SIJGM002Dto);
//*/
}


