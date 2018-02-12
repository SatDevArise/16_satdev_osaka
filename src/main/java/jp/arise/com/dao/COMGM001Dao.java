package jp.arise.com.dao;

import java.io.Serializable;

import jp.arise.com.dto.COMGM001Dto;
import jp.arise.utl.LoginInfoDto;

/**
 * COMGM001 ログイン画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface COMGM001Dao extends Serializable{

	/**
	 * userを取得
	 * @return user_id
	 * ログインユーザー情報取得
	 * @return LoginInfoDto
	 */
	public LoginInfoDto getLoginInfo(COMGM001Dto COMGM001Dto);

	/**
	 * ログイン履歴存在チェック
	 * @return -
	 */
	public String getRireki(LoginInfoDto loginInfoDto);

	/**
	 * ログイン履歴作成処理
	 * @return -
	 */
	public void createRireki(LoginInfoDto loginInfoDto);

	/**
	 * ログイン履歴更新処理
	 * @return -
	 * ログインユーザー情報取得
	 * @return LoginInfoDto
	 */
	public LoginInfoDto getLoginInfo(COMGM001Dto COMGM001Dto);

	/**
	 * ログイン履歴存在チェック
	 * @return -
	 */
	public String getRireki(LoginInfoDto loginInfoDto);

	/**
	 * ログイン履歴作成処理
	 * @return -
	 */
	public void createRireki(LoginInfoDto loginInfoDto);

	/**
	 * ログイン履歴更新処理
	 * @return -
	 */
	public void updateRireki(LoginInfoDto loginInfoDto);

}
