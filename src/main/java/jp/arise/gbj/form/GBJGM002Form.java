package jp.arise.gbj.form;

/**
 * GBJGM002 現場情報新規登録・編集画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class GBJGM002Form {

	/**
	 * ユーザー
	 */
	private String user;


	/**
	 * 現場ID
	 */
	private String genba_id;

	/**
	 * 現場名
	 */

	private String genba_na;




	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 現場IDを取得
	 * @return genba_id
	 */
	public String getGenba_id() {
		return genba_id;
	}

	/**
	 * 現場IDを設定
	 * @param genba_id
	 */
	public void setGenba_id1(String genba_id) {
		this.genba_id = genba_id;
	}
	/**
	 * 現場IDを取得
	 * @return getGenba_na
	 */
	public String getGenba_na() {
		return getGenba_na();
	}

	/**
	 * 現場IDを設定
	 * @param getGenba_na
	 */
	public void setGenba_na(String genba_na) {
		this.genba_na = genba_na;
	}

}
