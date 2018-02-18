package jp.arise.com.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.com.dto.COMGM003Dto;

/**
 * COMGM003 検索共通画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface COMGM003Dao extends Serializable{

	/**
	 * 社員情報検索処理
	 * @return List<COMGM003Dto>
	 */
	public List<COMGM003Dto> getSyainInfoList(COMGM003Dto COMGM003Dto);

	/**
	 * 現場情報検索処理
	 * @return List<COMGM003Dto>
	 */
	public List<COMGM003Dto> getGenbaInfoList(COMGM003Dto COMGM003Dto);
}
