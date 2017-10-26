package jp.arise.sij.form;

/**
 * SIJGM002 社員情報新規登録・編集画面用Formクラス JSPとController間の値受け渡し用
 *
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
	private String birth_place;
	private String position;
	private String team_na;
	private String phase_kb;
	private String tanka;
	private String genba_na;
	private String kensakuKeyList;
	private String page;

	// *以下にgetメソッドを記入

	/**
	 * ユーザーを取得
	 *
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 社員IDを取得
	 *
	 * @return syain_id
	 */
	public String getSyain_id() {
		return syain_id;
	}

	/**
	 * 氏名を取得
	 *
	 * @return user
	 */
	public String getName() {
		return name;
	}

	/**
	 * 生年月日を取得
	 *
	 * @return birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * 最寄り駅1を取得
	 *
	 * @return moyori_1_station
	 */
	public String getMoyori_1_station() {
		return moyori_1_station;
	}

	/**
	 * 最寄り駅2を取得
	 *
	 * @return moyori_2_station
	 */
	public String getMoyori_2_station() {
		return moyori_2_station;
	}

	/**
	 * 最寄り駅3を取得
	 *
	 * @return moyori_3_station
	 */
	public String getMoyori_3_station() {
		return moyori_3_station;
	}

	/**
	 * エリアコードを取得
	 *
	 * @return area_cd
	 */
	public String getArea_cd() {
		return area_cd;
	}

	/**
	 * 市外局番地を取得
	 *
	 * @return city_cd
	 */
	public String getCity_cd() {
		return city_cd;
	}

	/**
	 * 加入者番号を取得
	 *
	 * @return subscriber_no
	 */
	public String getSubscriber_no() {
		return subscriber_no;
	}

	/**
	 * 前職を取得
	 *
	 * @return previous
	 */
	public String getPrevious() {
		return previous;
	}

	/**
	 * 出身地を取得
	 *
	 * @return birth_place
	 */
	public String getBirth_place() {
		return birth_place;
	}

	/**
	 * 役職を取得
	 *
	 * @return position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * チーム名を取得
	 *
	 * @return team_na
	 */
	public String getTeam_na() {
		return team_na;
	}

	/**
	 * フェーズを取得
	 *
	 * @return phase_kb
	 */
	public String getPhase_kb() {
		return phase_kb;
	}

	/**
	 * 単価を取得
	 *
	 * @return tanka
	 */
	public String getTanka() {
		return tanka;
	}

	/**
	 * 現場名を取得
	 *
	 * @return genba_na
	 */
	public String getGenba_na() {
		return genba_na;
	}

	/**
	 * 検索キーを取得
	 *
	 * @return kensakuKeyList
	 */
	public String getKensakukeyList() {
		return kensakuKeyList;
	}

	/**
	 * ページを取得
	 *
	 * @return page
	 */
	public String getPage() {
		return page;
	}

	// *下記にsetメソッドを記入

	/**
	 * ユーザーを設定
	 *
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 社員ID を設定
	 *
	 * @param user
	 */
	public void setsyain_id(String syain_id) {
		this.syain_id = syain_id;
	}

	/**
	 * 氏名を設定
	 *
	 * @param user
	 */
	public void setname(String name) {
		this.name = name;
	}

	/**
	 * 生年月日を設定
	 *
	 * @param birth
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * 最寄り駅1を設定
	 *
	 * @param moyori_1_station
	 */
	public void setMoyori_1_station(String moyori_1_station) {
		this.moyori_1_station = moyori_1_station;
	}

	/**
	 * 最寄り駅2を設定
	 *
	 * @param moyori_2_station
	 */
	public void setMoyori_2_station(String moyori_2_station) {
		this.moyori_2_station = moyori_2_station;
	}

	/**
	 * 最寄り駅3を設定
	 *
	 * @param moyori_3_station
	 */
	public void setMoyori_3_station(String moyori_3_station) {
		this.moyori_3_station = moyori_3_station;
	}

	/**
	 * エリアコードを設定
	 *
	 * @param area_cd
	 */
	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}

	/**
	 * 市街局番地を設定
	 *
	 * @param city_cd
	 */
	public void setCity_cd(String city_cd) {
		this.city_cd = city_cd;
	}

	/**
	 * 加入者番号を設定
	 *
	 * @param subscriber_no
	 */
	public void setSubscriber_no(String subscriber_no) {
		this.subscriber_no = subscriber_no;
	}

	/**
	 * 前職を設定
	 *
	 * @param previous
	 */
	public void setPrevious(String previous) {
		this.previous = previous;
	}

	/**
	 * 出身地を設定
	 *
	 * @param birth_place
	 */
	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}

	/**
	 * 役職を設定
	 *
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * チーム名を設定
	 *
	 * @param チーム名
	 */
	public void setTeam_na(String team_na) {
		this.team_na = team_na;
	}

	/**
	 * フェーズを設定
	 *
	 * @param phase_kb
	 */
	public void setPhase_kb(String phase_kb) {
		this.phase_kb = phase_kb;
	}

	/**
	 * 単価を設定
	 *
	 * @param tanka
	 */
	public void setTanka(String tanka) {
		this.tanka = tanka;
	}

	/**
	 * 現場名を設定
	 *
	 * @param genba_na
	 */
	public void setGenba_na(String genba_na) {
		this.genba_na = genba_na;
	}

	/**
	 * 検索キーを設定
	 *
	 * @param kensakuKeyList
	 */
	public void setkensakuKeyList(String kensakuKeyList) {
		this.kensakuKeyList = kensakuKeyList;
	}

	/**
	 * ページを設定
	 *
	 * @param page
	 */
	public void setPage(String page) {
		this.page = page;
	}

}
