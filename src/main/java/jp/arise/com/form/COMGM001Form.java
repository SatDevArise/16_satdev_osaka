package jp.arise.com.form;

/**
 * COMGM001 ログイン画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001Form {

	/**
	 * ユーザー
	 */
	private String user_id;

	/*パスワード*/
	private String password;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーを設定
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


}
