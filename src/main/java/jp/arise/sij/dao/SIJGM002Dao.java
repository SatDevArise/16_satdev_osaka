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
	 * 社員情報を取得
	 *
	 * @return List<SIJGM002Dto>
	 */
	public List<SIJGM002Dto> getSyain_info(SIJGM002Dto SIJGM002Dto);

	/**
	 * 最寄り駅チェックを取得
	 *
	 * @return List<SIJGM002Dto>
	 */
	public List<SIJGM002Dto> getCheckInputStation(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報新規登録処理
	 *
	 */
	public void insertSyainInfo(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報更新処理
	 *
	 */
	public void upSyainInfo(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員情報削除処理
	 *
	 */
	public void delSyainInfo(SIJGM002Dto SIJGM002Dto);

}
