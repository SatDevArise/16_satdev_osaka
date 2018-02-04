package jp.arise.sij.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.sij.dto.SIJGM002Dto;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス間Daoクラス データベースアクセス時に利用するクラス
 *
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface SIJGM002Dao extends Serializable {

	/**
	 * userを取得
	 *
	 * @return user
	 */
	public List<SIJGM002Dto> getUser(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報を取得
	 *
	 * @return syainlistinfo
	 */
	public List<SIJGM002Dto> getSyain_id(SIJGM002Dto SIJGM002Dto);

	/**
	 * 最寄り駅チェックを取得
	 *
	 * @return getinputcheckstation
	 */
	public List<SIJGM002Dto> getCheckInputStation(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報新規登録処理を取得
	 *
	 * @return insertSyainInfo
	 */
	public List<SIJGM002Dto> insertSyainInfo(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報更新処理を取得
	 *
	 * @return upSyainInfo
	 */
	public List<SIJGM002Dto> upSyainInfo(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報削除処理を取得
	 *
	 * @return delsyainInfo
	 */
	public List<SIJGM002Dto> delSyainInfo(SIJGM002Dto SIJGM002Dto);

}
