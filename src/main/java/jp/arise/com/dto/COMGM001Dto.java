package jp.arise.com.dto;

import java.io.Serializable;
import java.util.List;

/**
 * COMGM001 ログイン画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001Dto implements Serializable{

	/**
	 * ユーザーID
	 */
	private String user_Id;

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
	 * @return user_Id
	 */
	public String getUser_id() {
		return user_Id;
	}

	/**
	 * ユーザーIDを設定
	 * @param user_Id
	 */
	public void setUser_id(String user_Id) {
		this.user_Id = user_Id;
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
