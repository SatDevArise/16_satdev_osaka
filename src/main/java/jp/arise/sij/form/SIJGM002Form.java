package jp.arise.sij.form;

/**
 * SIJGM002 社員情報新規登録・編集画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM002Form {

	/**
	 * ユーザー
	 */
	private String user;
	private String syain_id;
	private String name;
	private String birth;
	private String moyori_1_station;
	private String moyori_2_station;
	private String moyori_3_station;
	private String area_cd;
	private String city_cd;
	private String subscriber_no;
	private String previous;
	private String brth_place;
	private String psition;
	private String team_na;
	private String phase_kb;
	private String tanka;
	private String genba_na;
	private String kensakuKeyList;
	private String page;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * 社員IDを取得
	 * @return user
	 */
	public String getsyain_cd() {
		return syain_cd;
	}
	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * 社員IDを設定
	 * @param user
	 */
	public void setsyain_cd(String syain_cd) {
		this.syain_cd = syain_cd;
	}
}
