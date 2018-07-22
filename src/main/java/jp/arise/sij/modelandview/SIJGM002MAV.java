package jp.arise.sij.modelandview;

/**
 * SIJGM002 社員情報新規登録・編集画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 * @update 森
 */
public class SIJGM002MAV {



	/**
	 * ユーザー
	 */
	private String user;

	/**
	 * 社員ID
	 */
	private String syain_id;

	/**
	 * 名前
	 */
	private String syain_na;

	/**
	 * 生年月日
	 */
	private String birth_dt;

	/**
	 * 最寄り駅1
	 *
	 */
	private String moyori_eki_1;

	/**
	 * 最寄り駅2
	 *
	 */
	private String moyori_eki_2;

	/**
	 * 最寄り駅3
	 *
	 */
	private String moyori_eki_3;

	/**
	 * 連絡先
	 */
	private String syain_renrakusaki;

	/**
	 * 前職
	 */
	private String zensyoku_na;

	/**
	 * 出身地
	 */
	private String syussin_na;

	/**
	 * 役職
	 */
	private String yakusyoku_cd;

	/**
	 * 入社日
	 */
	private String nyusya_dt;

	/**
	 * チーム名
	 */
	private String syozoku_team;

	/**
	 * フェーズ
	 */
	private String phase_kb;

	/**
	 * 単価
	 */
	private String tanka_vl;

	/**
	 * 現場名
	 */
	private String genba_na;

	/**
	 * 参画日
	 */
	private String genba_sankaku_dt;

	/**
	 * 検索キーリスト
	 */
	private String kensakuKeyList;

	/**
	 * ページ
	 */
	private String page;

	/**
	 * エラー表示
	 */
	private String error_hyoji;


	//以下にgetterを記載
	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 社員IDを取得
	 * @return syain_id
	 */
	public String getSyain_id() {
		return syain_id;
	}

	/**
	 * 名前を取得
	 * @return name
	 */
	public String getSyain_na() {
		return syain_na;
	}

	/**
	 * 生年月日を取得
	 * @return birth
	 */
	public String getBirth_dt() {
		return birth_dt;
	}

	/**
	 * 最寄り駅1を取得
	 * @return  moyori_1_station
	 */
	public String getMoyori_eki_1() {
		return moyori_eki_1;
	}

	/**
	 * 最寄り駅2を取得
	 * @return  moyori_2_station
	 */
	public String getMoyori_eki_2() {
		return moyori_eki_2;
	}

	/**
	 * 最寄り駅3を取得
	 * @return  moyori_3_station
	 */
	public String getMoyori_eki_3() {
		return moyori_eki_3;
	}

	/**
	 * 連絡先を取得
	 * @return  phoneNumber
	 */
	public String getSyain_renrakusaki() {
		return syain_renrakusaki;
	}

	/**
	 * 前職を取得
	 * @return  previous
	 */
	public String getZensyoku_na() {
		return zensyoku_na;
	}

	/**
	 * 出身地
	 * @return  birth_place
	 */
	public String getSyussin_na() {
		return syussin_na;
	}

	/**
	 * 役職
	 * @return  position
	 */
	public String getYakusyoku_cd() {
		return yakusyoku_cd;
	}

	/**
	 * 入社日
	 * @return  nyusya_dt
	 */
	public String getNyusya_dt() {
		return nyusya_dt;
	}

	/**
	 * チーム名
	 * @return  team_na
	 */
	public String getSyozoku_team() {
		return syozoku_team;
	}

	/**
	 * フェーズ
	 * @return  phase_kb
	 */
	public String getPhase_kb() {
		return phase_kb;
	}

	/**
	 * 単価
	 * @return tanka
	 */
	public String getTanka_vl() {
		return tanka_vl;
	}

	/**
	 * 現場名
	 * @return genba_na
	 */
	public String getGenba_na() {
		return genba_na;
	}

	/**
	 * 参画日
	 * @return sankaku_dt
	 */
	public String getGenba_sankaku_dt() {
		return genba_sankaku_dt;
	}

	/**
	 * 検索キーリスト
	 * @return  kensakuKeyList
	 */
	public String getKensakuKeyList() {
		return  kensakuKeyList;
	}

	/**
	 * ページ
	 * @return page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * エラー表示
	 * @return error_hyoji
	 */
	public String getError_hyoji(){
		return error_hyoji;
	}

	//以下にsetterを記載
	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 社員IDを設定
	 * @param syain_id
	 */
	public void setSyain_id(String syain_id) {
		this.syain_id = syain_id;
	}

	/**
	 * 名前を設定
	 * @param namae
	 */
	public void setSyain_na(String syain_na) {
		this.syain_na = syain_na;
	}

	/**
	 * 生年月日を設定
	 * @param birth
	 */
	public void setBirth_dt(String birth_dt) {
		this.birth_dt = birth_dt;
	}

	/**
	 * 最寄り駅1を設定
	 * @param moyori_1_station
	 */
	public void setMoyori_eki_1(String moyori_eki_1) {
		this.moyori_eki_1 = moyori_eki_1;
	}

	/**
	 * 最寄り駅2を設定
	 * @param moyori_2_station
	 */
	public void setmoyori_eki_2(String moyori_eki_2) {
		this.moyori_eki_2 = moyori_eki_2;
	}

	/**
	 * 最寄り駅3を設定
	 * @param moyori_3_station
	 */
	public void setmoyori_eki_3(String moyori_eki_3) {
		this.moyori_eki_3 = moyori_eki_3;
	}

	/**
	 * 連絡先を設定
	 * @param phoneNumber
	 */
	public void setSyain_renrakusaki(String syain_renrakusaki) {
		this.syain_renrakusaki = syain_renrakusaki;
	}

	/**
	 * 前職を設定
	 * @param previous
	 */
	public void setPrevious(String syain_renrakusaki) {
		this.syain_renrakusaki = syain_renrakusaki;
	}

	/**
	 * 出身地を設定
	 * @param birth_place
	 */
	public void setSyussin_na(String syussin_na) {
		this.syussin_na = syussin_na;
	}

	/**
	 * 役職を設定
	 * @param position
	 */
	public void setYakusyoku_cd(String yakusyoku_cd) {
		this.yakusyoku_cd = yakusyoku_cd;
	}

	/**
	 * 入社日を設定
	 * @param nyusya_dt
	 */
	public void setNyusya_dt(String nyusya_dt) {
		this.nyusya_dt = nyusya_dt;
	}

	/**
	 * チーム名を設定
	 * @param team_na
	 */
	public void setSyozoku_team(String syozoku_team) {
		this.syozoku_team = syozoku_team;
	}

	/**
	 * フェーズを設定
	 * @param phase_kb
	 */
	public void setPhase_kb(String phase_kb) {
		this.phase_kb = phase_kb;
	}

	/**
	 * 単価を設定
	 * @param tanka
	 */
	public void setTanka_vl(String tanka_vl) {
		this.tanka_vl = tanka_vl;
	}

	/**
	 * 現場名を設定
	 * @param genba_na
	 */
	public void setGenba_na(String genba_na) {
		this.genba_na = genba_na;
	}

	/**
	 * 参画日を設定
	 * @param sankaku_dt
	 */
	public void setGenba_sankaku_dt(String genba_sankaku_dt) {
		this.genba_sankaku_dt = genba_sankaku_dt;
	}

	/**
	 * 検索キーリスト
	 * @param string
	 * @return  kensakuKeyList
	 */
	public String setKensakuKeyList(String kensakukeylist) {
		return  kensakuKeyList;
	}

	/**
	 * ページ
	 * @return page
	 */
	public String setPage(String page) {
		return page;
	}

	/**
	 * エラー表示
	 * @return
	 */
	public String setError_hyoji() {
		return error_hyoji;
	}



}
