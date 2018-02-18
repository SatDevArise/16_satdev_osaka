package jp.arise.com.modelandview;

import java.util.List;

import jp.arise.com.dto.COMGM003Dto;

/**
 * COMGM003 検索共通画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM003MAV {

	/**
	 * 社員ID
	 */
	private String syain_id;

	/**
	 * 生年月日（From）
	 */
	private String seinengappi_from;

	/**
	 * 生年月日（To）
	 */
	private String seinengappi_to;

	/**
	 * 前職
	 */
	private String previous;

	/**
	 * 役職
	 */
	private String position;

	/**
	 * 入社日（From）
	 */
	private String nyusyabi_from;

	/**
	 * 入社日（To）
	 */
	private String nyusyabi_to;

	/**
	 * チーム
	 */
	private String team_na;

	/**
	 * 現場名
	 */
	private String genba_na;

	/**
	 * フェーズ
	 */
	private String phase;

	/**
	 * 単価
	 */
	private String tanka;

	/**
	 * 自宅最寄り駅1
	 */
	private String moyori_1_station;

	/**
	 * 自宅最寄り駅2
	 */
	private String moyori_2_station;

	/**
	 * 自宅最寄り駅3
	 */
	private String moyori_3_station;

	/**
	 * 社員住所
	 */
	private String syain_address;

	/**
	 * 画面ID
	 */
	private String disp_id;

	/**
	 * エラー表示
	 */
	private List<String> error_hyoji;

	/**
	 * 現場ID
	 */
	private String genba_id;

	/**
	 * 社員名
	 */
	private String syain_na;

	/**
	 * 社員グループコード
	 */
	private String syain_group_cd;

	/**
	 * 入社日
	 */
	private String nyusya_dt;

	/**
	 * 参画日
	 */
	private String genba_sankaku_dt;

	/**
	 * 誕生日
	 */
	private String birth_dt;

	/**
	 * 経過年月
	 */
	private String keika_ym;

	/**
	 * 使用路線
	 */
	private String siyo_rosen_na;

	/**
	 * 出身地
	 */
	private String syussin_na;

	/**
	 * 社員連絡先
	 */
	private String syain_renrakusaki;

	/**
	 * 現場グループコード
	 */
	private String genba_group_cd;

	/**
	 * 案件名
	 */
	private String anken_na;

	/**
	 * 作業内容
	 */
	private String sagyonaiyo;

	/**
	 * プロジェクト参画日
	 */
	private String pj_start_dt;

	/**
	 * プロジェクト終了日
	 */
	private String pj_end_dt;

	/**
	 * 現場住所
	 */
	private String genba_address;

	/**
	 * 現場最寄り駅1
	 */
	private String genba_moyori_eki_1;

	/**
	 * 現場最寄り駅2
	 */
	private String genba_moyori_eki_2;

	/**
	 * 現場最寄り駅3
	 */
	private String genba_moyori_eki_3;

	/**
	 * 現場連絡先
	 */
	private String genba_phone_nm;

	/**
	 * 有効フラグ
	 */
	private String yuko_fg;

	/**
	 * 削除フラグ
	 */
	private String sakujo_fg;

	/**
	 * 検索結果
	 */
	private List<COMGM003Dto> resultList;

	/**
	 * 社員IDを取得
	 * @return syain_id
	 */
	public String getSyain_id() {
		return syain_id;
	}

	/**
	 * 社員IDを設定
	 * @param syain_id
	 */
	public void setSyain_id(String syain_id) {
		this.syain_id = syain_id;
	}

	/**
	 * 生年月日（From）を取得
	 * @return seinengappi_from
	 */
	public String getSeinengappi_from() {
		return seinengappi_from;
	}

	/**
	 * 生年月日（From）を設定
	 * @param seinengappi_from
	 */
	public void setSeinengappi_from(String seinengappi_from) {
		this.seinengappi_from = seinengappi_from;
	}

	/**
	 * 生年月日（To）を取得
	 * @return seinengappi_to
	 */
	public String getSeinengappi_to() {
		return seinengappi_to;
	}

	/**
	 * 生年月日（To）を設定
	 * @param seinengappi_to
	 */
	public void setSeinengappi_to(String seinengappi_to) {
		this.seinengappi_to = seinengappi_to;
	}

	/**
	 * 前職を取得
	 * @return previous
	 */
	public String getPrevious() {
		return previous;
	}

	/**
	 * 前職を設定
	 * @param previous
	 */
	public void setPrevious(String previous) {
		this.previous = previous;
	}

	/**
	 * 役職を取得
	 * @return position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * 役職を設定
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * 入社日（From）を取得
	 * @return nyusyabi_from
	 */
	public String getNyusyabi_from() {
		return nyusyabi_from;
	}

	/**
	 * 入社日（From）を設定
	 * @param nyusyabi_from
	 */
	public void setNyusyabi_from(String nyusyabi_from) {
		this.nyusyabi_from = nyusyabi_from;
	}

	/**
	 * 入社日（To）を取得
	 * @return nyusyabi_to
	 */
	public String getNyusyabi_to() {
		return nyusyabi_to;
	}

	/**
	 * 入社日（To）を設定
	 * @param nyusyabi_to
	 */
	public void setNyusyabi_to(String nyusyabi_to) {
		this.nyusyabi_to = nyusyabi_to;
	}

	/**
	 * チームを取得
	 * @return team_na
	 */
	public String getTeam_na() {
		return team_na;
	}

	/**
	 * チームを設定
	 * @param team_na
	 */
	public void setTeam_na(String team_na) {
		this.team_na = team_na;
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
	 * フェーズを取得
	 * @return phase
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * フェーズを設定
	 * @param phase
	 */
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * 単価を取得
	 * @return tanka
	 */
	public String getTanka() {
		return tanka;
	}

	/**
	 * 単価を設定
	 * @param tanka
	 */
	public void setTanka(String tanka) {
		this.tanka = tanka;
	}

	/**
	 * 最寄り駅1を取得
	 * @return moyori_1_station
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
	 * @return moyori_2_station
	 */
	public String getMoyori_2_station() {
		return moyori_2_station;
	}

	/**
	 * 最寄り駅2を設定
	 * @param moyori_2_station
	 */
	public void setMoyori_2_station(String moyori_2_station) {
		this.moyori_2_station = moyori_2_station;
	}

	/**
	 * 最寄り駅3を取得
	 * @return moyori_3_station
	 */
	public String getMoyori_3_station() {
		return moyori_3_station;
	}

	/**
	 * 最寄り駅3を設定
	 * @param moyori_3_station
	 */
	public void setMoyori_3_station(String moyori_3_station) {
		this.moyori_3_station = moyori_3_station;
	}

	/**
	 * 住所を取得
	 * @return syain_address
	 */
	public String getSyain_address() {
		return syain_address;
	}

	/**
	 * 住所を設定
	 * @param syain_address
	 */
	public void setSyain_address(String syain_address) {
		this.syain_address = syain_address;
	}

	/**
	 * 画面IDを取得
	 * @return syain_id
	 */
	public String getDisp_id() {
		return disp_id;
	}

	/**
	 * 画面IDを設定
	 * @param syain_id
	 */
	public void setDisp_id(String disp_id) {
		this.disp_id = disp_id;
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
	public void setGenba_id(String genba_id) {
		this.genba_id = genba_id;
	}

	/**
	 * 社員名を取得
	 * @return syain_na
	 */
	public String getSyain_na() {
		return syain_na;
	}

	/**
	 * 社員名を設定
	 * @param syain_na
	 */
	public void setSyain_na(String syain_na) {
		this.syain_na = syain_na;
	}

	/**
	 * 社員グループコードを取得
	 * @return syain_group_cd
	 */
	public String getSyain_group_cd() {
		return syain_group_cd;
	}

	/**
	 * 社員グループコードを設定
	 * @param syain_group_cd
	 */
	public void setSyain_group_cd(String syain_group_cd) {
		this.syain_group_cd = syain_group_cd;
	}

	/**
	 * 入社日を取得
	 * @return nyusya_dt
	 */
	public String getNyusya_dt() {
		return nyusya_dt;
	}

	/**
	 * 入社日を設定
	 * @param nyusya_dt
	 */
	public void setNyusya_dt(String nyusya_dt) {
		this.nyusya_dt = nyusya_dt;
	}

	/**
	 * 参画日を取得
	 * @return genba_sankaku_dt
	 */
	public String getGenba_sankaku_dt() {
		return genba_sankaku_dt;
	}

	/**
	 * 参画日を設定
	 * @param genba_sankaku_dt
	 */
	public void setGenba_sankaku_dt(String genba_sankaku_dt) {
		this.genba_sankaku_dt = genba_sankaku_dt;
	}

	/**
	 * 誕生日を取得
	 * @return birth_dt
	 */
	public String getBirth_dt() {
		return birth_dt;
	}

	/**
	 * 誕生日を設定
	 * @param birth_dt
	 */
	public void setBirth_dt(String birth_dt) {
		this.birth_dt = birth_dt;
	}

	/**
	 * 経過年月を取得
	 * @return keika_ym
	 */
	public String getKeika_ym() {
		return keika_ym;
	}

	/**
	 * 経過年月を設定
	 * @param keika_ym
	 */
	public void setKeika_ym(String keika_ym) {
		this.keika_ym = keika_ym;
	}

	/**
	 * 使用路線を取得
	 * @return siyo_rosen_na
	 */
	public String getSiyo_rosen_na() {
		return siyo_rosen_na;
	}

	/**
	 * 使用路線を設定
	 * @param siyo_rosen_na
	 */
	public void setSiyo_rosen_na(String siyo_rosen_na) {
		this.siyo_rosen_na = siyo_rosen_na;
	}

	/**
	 * 出身地を取得
	 * @return syussin_na
	 */
	public String getSyussin_na() {
		return syussin_na;
	}

	/**
	 * 出身地を設定
	 * @param syussin_na
	 */
	public void setSyussin_na(String syussin_na) {
		this.syussin_na = syussin_na;
	}

	/**
	 * 社員連絡先を取得
	 * @return syain_renrakusaki
	 */
	public String getSyain_renrakusaki() {
		return syain_renrakusaki;
	}

	/**
	 * 社員連絡先を設定
	 * @param syain_renrakusaki
	 */
	public void setSyain_renrakusaki(String syain_renrakusaki) {
		this.syain_renrakusaki = syain_renrakusaki;
	}

	/**
	 * 現場グループコードを取得
	 * @return genba_group_cd
	 */
	public String getGenba_group_cd() {
		return genba_group_cd;
	}

	/**
	 * 現場グループコードを設定
	 * @param genba_group_cd
	 */
	public void setGenba_group_cd(String genba_group_cd) {
		this.genba_group_cd = genba_group_cd;
	}

	/**
	 * 案件名を取得
	 * @return anken_na
	 */
	public String getAnken_na() {
		return anken_na;
	}

	/**
	 * 案件名を設定
	 * @param anken_na
	 */
	public void setAnken_na(String anken_na) {
		this.anken_na = anken_na;
	}

	/**
	 * 作業内容を取得
	 * @return sagyonaiyo
	 */
	public String getSagyonaiyo() {
		return sagyonaiyo;
	}

	/**
	 * 作業内容を設定
	 * @param sagyonaiyo
	 */
	public void setSagyonaiyo(String sagyonaiyo) {
		this.sagyonaiyo = sagyonaiyo;
	}

	/**
	 * プロジェクト参画日を取得
	 * @return pj_start_dt
	 */
	public String getPj_start_dt() {
		return pj_start_dt;
	}

	/**
	 * プロジェクト参画日を設定
	 * @param pj_start_dt
	 */
	public void setPj_start_dt(String pj_start_dt) {
		this.pj_start_dt = pj_start_dt;
	}

	/**
	 * プロジェクト終了日を取得
	 * @return pj_end_dt
	 */
	public String getPj_end_dt() {
		return pj_end_dt;
	}

	/**
	 * プロジェクト終了日を設定
	 * @param pj_end_dt
	 */
	public void setPj_end_dt(String pj_end_dt) {
		this.pj_end_dt = pj_end_dt;
	}

	/**
	 * 現場住所を取得
	 * @return genba_address
	 */
	public String getGenba_address() {
		return genba_address;
	}

	/**
	 * 現場住所を設定
	 * @param genba_address
	 */
	public void setGenba_address(String genba_address) {
		this.genba_address = genba_address;
	}

	/**
	 * 現場最寄り駅1を取得
	 * @return genba_moyori_eki_1
	 */
	public String getGenba_moyori_eki_1() {
		return genba_moyori_eki_1;
	}

	/**
	 * 現場最寄り駅1を設定
	 * @param genba_moyori_eki_1
	 */
	public void setGenba_moyori_eki_1(String genba_moyori_eki_1) {
		this.genba_moyori_eki_1 = genba_moyori_eki_1;
	}

	/**
	 * 現場最寄り駅2を取得
	 * @return genba_moyori_eki_2
	 */
	public String getGenba_moyori_eki_2() {
		return genba_moyori_eki_2;
	}

	/**
	 * 現場最寄り駅2を設定
	 * @param genba_moyori_eki_2
	 */
	public void setGenba_moyori_eki_2(String genba_moyori_eki_2) {
		this.genba_moyori_eki_2 = genba_moyori_eki_2;
	}

	/**
	 * 現場最寄り駅3を取得
	 * @return genba_moyori_eki_3
	 */
	public String getGenba_moyori_eki_3() {
		return genba_moyori_eki_3;
	}

	/**
	 * 現場最寄り駅3を設定
	 * @param genba_moyori_eki_3
	 */
	public void setGenba_moyori_eki_3(String genba_moyori_eki_3) {
		this.genba_moyori_eki_3 = genba_moyori_eki_3;
	}

	/**
	 * 現場連絡先を取得
	 * @return genba_phone_nm
	 */
	public String getGenba_phone_nm() {
		return genba_phone_nm;
	}

	/**
	 * 現場連絡先を設定
	 * @param genba_phone_nm
	 */
	public void setGenba_phone_nm(String genba_phone_nm) {
		this.genba_phone_nm = genba_phone_nm;
	}

	/**
	 * 有効フラグを取得
	 * @return yuko_fg
	 */
	public String getYuko_fg() {
		return yuko_fg;
	}

	/**
	 * 有効フラグを設定
	 * @param yuko_fg
	 */
	public void setYuko_fg(String yuko_fg) {
		this.yuko_fg = yuko_fg;
	}

	/**
	 * 削除フラグを取得
	 * @return sakujo_fg
	 */
	public String getSakujo_fg() {
		return sakujo_fg;
	}

	/**
	 * 削除フラグを設定
	 * @param sakujo_fg
	 */
	public void setSakujo_fg(String sakujo_fg) {
		this.sakujo_fg = sakujo_fg;
	}

	/**
	 * 検索結果を取得
	 * @return resultList
	 */
	public List<COMGM003Dto> getResultList() {
		return resultList;
	}

	/**
	 * 検索結果を設定
	 * @param resultList
	 */
	public void setResultList(List<COMGM003Dto> resultList) {
		this.resultList = resultList;
	}
}
