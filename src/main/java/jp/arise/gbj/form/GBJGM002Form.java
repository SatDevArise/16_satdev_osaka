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
	private String phase;
	private String create_btn;
	private String update_btn;
	private String delete_btn;


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getGenba_id() {
		return genba_id;
	}


	public void setGenba_id(String genba_id) {
		this.genba_id = genba_id;
	}


	public String getGenba_na() {
		return genba_na;
	}


	public void setGenba_na(String genba_na) {
		this.genba_na = genba_na;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMoyori_1_station() {
		return moyori_1_station;
	}
	public void setMoyori_1_station(String moyori_1_station) {
		this.moyori_1_station = moyori_1_station;
	}
	public String getMoyori_2_station() {
		return Moyori_2_station;
	}
	public void setMoyori_2_station(String moyori_2_station) {
		Moyori_2_station = moyori_2_station;
	}
	public String getMoyori_3_station() {
		return Moyori_3_station;
	}
	public void setMoyori_3_station(String moyori_3_station) {
		Moyori_3_station = moyori_3_station;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getCreate_btn() {
		return create_btn;
	}
	public void setCreate_btn(String create_btn) {
		this.create_btn = create_btn;
	}
	public String getUpdate_btn() {
		return update_btn;
	}
	public void setUpdate_btn(String update_btn) {
		this.update_btn = update_btn;
	}
	public String getDelete_btn() {
		return delete_btn;
	}
	public void setDelete_btn(String delete_btn) {
		this.delete_btn = delete_btn;
	}


}
