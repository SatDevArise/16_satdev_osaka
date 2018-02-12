package jp.arise.com.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.com.dto.COMGM002Dto;

/**
 * COMGM002 メニュー画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface COMGM002Dao extends Serializable{

	/**
	 * お知らせ情報を取得
	 * @return user
	 */
	public List<COMGM002Dto> getOsiraseInfo(Object unyoubi);

	/**
	 * ログイン履歴更新処理
	 * @return -
	 */
	public void updateRireki();

}
