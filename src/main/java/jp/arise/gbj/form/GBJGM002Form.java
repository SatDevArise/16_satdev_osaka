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
	/**
	 * 最寄り駅1を取得
	 * @return address
	 */
	public String getMoyori_1_station() {
		return moyori_1_station;
	}

	/**
	 * 最寄り駅1を設定
	 * @param moyori_1_station
	 */
	public void setMoyori_1_station(String moyori_1_station) {
		this.moyori_1_station = moyori_1_station;
	}
	/**
	 * 最寄り駅2を取得
	 * @return moyori_1_station
	 */
	public String getMoyori_2_station() {
		return Moyori_2_station;
	}

	/**
	 * 最寄り駅2を設定
	 * @param Moyori_2_station
	 */
	public void setMoyori_2_station(String Moyori_2_station) {
		this.Moyori_2_station = Moyori_2_station;
	}
	/**
	 * 最寄り駅3を取得
	 * @return Moyori_3_station
	 */
	public String getMoyori_3_station() {
		return Moyori_3_station;
	}

	/**
	 * 最寄り駅3を設定
	 * @param Moyori_3_station
	 */
	public void setMoyori_3_station(String Moyori_3_station) {
		this.Moyori_3_station = Moyori_3_station;
	}
	/**
	 * 作業内容を取得
	 * @return work
	 */
	public String getWork() {
		return work;
	}

	/**
	 * 作業内容を設定
	 * @param work
	 */
	public void setWork(String work) {
		this.work = work;
	}
	/**
	 * フェーズリストを取得
	 * @return phaseList
	 */
	public String getPhaseList() {
		return phaseList;
	}

	/**
	 * フェーズリストを設定
	 * @param phaseList
	 */
	public void setPhaseList(String phaseList) {
		this.phaseList = phaseList;
	}
	/**
	 * 新規作成処理情報を取得
	 * @return create_btn
	 */
	public String getCreate_btn() {
		return create_btn;
	}

	/**
	 * 新規作成処理情報を設定
	 * @param create_btn
	 */
	public void setCreate_btn(String create_btn) {
		this.create_btn = create_btn;
	}
	/**
	 * 更新処理情報を取得
	 * @return update_btn
	 */
	public String getUpdate_btn() {
		return update_btn;
	}

	/**
	 * 更新処理情報を設定
	 * @param update_btn
	 */
	public void setUpdate_btn(String update_btn) {
		this.update_btn = update_btn;
	}
	/**
	 * 更新処理情報を取得
	 * @return delete_btn
	 */
	public String getDelete_btn() {
		return delete_btn;
	}

	/**
	 * 更新処理情報を設定
	 * @param delete_btn
	 */
	public void setDelete_btn(String delete_btn) {
		this.delete_btn = delete_btn;
	}
}
