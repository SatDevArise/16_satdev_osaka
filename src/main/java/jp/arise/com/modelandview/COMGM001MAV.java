package jp.arise.com.modelandview;

import java.util.List;

/**
 * COMGM001 ログイン画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001MAV {

	/**
	 * ユーザーID
	 */
	private String user_id;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * エラー表示
	 */
	private List<String> error_hyoji;

	/**
	 * ユーザーIDを取得
	 * @return user
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを設定
	 * @param user_id
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * パスワードを取得
	 *@param password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * エラー表示を取得
	 *@param error_hyoji
	 */
	public List<String> getError_hyoji() {
		return error_hyoji;
	}

	/**
	 * エラー表示を設定
	 * @param error_hyoji
	 */
	public void setError_hyoji(List<String> error_hyoji) {
		this.error_hyoji = error_hyoji;
	}

}
