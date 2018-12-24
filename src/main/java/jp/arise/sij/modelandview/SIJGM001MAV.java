package jp.arise.sij.modelandview;

/**
 * SIJGM001 社員情報一覧表示画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM001MAV {

	/**
	 * ユーザー
	 */
	private String user;
	private String syainId;

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
	 * 社員IDを取得
	 *
	 * @return
	 */
	public String getSyainId() {
		return syainId;
	}

	/**
	 * 社員IDを設定
	 * @param syainId
	 */
	public void setSyainId(String syainId) {
		this.syainId = syainId;
	}



}
