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
	private String genba_id;
	private String genba_na;
	private String address;
	private String moyori_1_station;
	private String Moyori_2_station;
	private String Moyori_3_station;
	private String work;
	private String phaseList;
	private String create_btn;
	private String update_btn;
	private String delete_btn;
	private String back_btn;
	private String back_btn1;
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
	public String Getgenba_id() {
		return genba_id;
	}

	/**
	 * 現場IDを設定
	 * @param genba_id
	 */
	public void setGenba_id(String genba_id) {
		this.genba_id = genba_id;
	}
	/**
	 * 現場名を取得
	 * @return genba_na
	 */
	public String getGenba_na() {
		return genba_na;
	}

	/**
	 * 現場名を設定
	 * @param genba_na
	 */
	public void setGenba_na(String genba_na) {
		this.genba_na = genba_na;
	}
	/**
	 * 住所を取得
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所を設定
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
