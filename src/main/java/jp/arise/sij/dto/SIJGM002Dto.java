package jp.arise.sij.dto;

import java.io.Serializable;
import java.util.List;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM002Dto implements Serializable{

	/**
	 * ユーザー
	 */
	private String user;

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
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ユーザーIDを取得
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 社員ID
	 */
	private String syain_id;

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
	 * 氏名
	 */
	private String name;

	/**
	 * 氏名を取得
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 氏名を設定
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 生年月日
	 */
	private String birth;

	/**
	 * 生年月日を取得
	 * @return birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * 生年月日を設定
	 * @param birth
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * 最寄り駅1
	 */
	private String moyori_1_station;

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
	 * 最寄り駅2
	 */
	private String moyori_2_station;

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
	 * 最寄り駅3
	 */
	private String moyori_3_station;

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
	 * 連絡先
	 */
	private String phoneNumber;

	/**
	 * 連絡先を取得
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 連絡先を設定
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 前職
	 */
	private String previous;

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
	 * 出身地
	 */
	private String birth_place;

	/**
	 * 出身地を取得
	 * @return birth_place
	 */
	public String getBirth_place() {
		return birth_place;
	}

	/**
	 * 出身地を設定
	 * @param birth_place
	 */
	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}

	/**
	 * 役職
	 */
	private String position;

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
	 * 入社日
	 */
	private String nyusya_dt;

	/**
	 * 入社日を取得
	 * @return position
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
	 * チーム名
	 */
	private String team_na;

	/**
	 * チーム名を取得
	 * @return position
	 */
	public String getTeam_na() {
		return team_na;
	}

	/**
	 * チーム名を設定
	 * @param team_na
	 */
	public void setTeam_na(String team_na) {
		this.team_na = team_na;
	}

	/**
	 * フェーズ
	 */
	private String phase;

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
	public void setphase(String phase) {
		this.phase = phase;
	}

	/**
	 * 単価
	 */
	private String tanka;

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
	 * 現場名
	 */
	private String genba_na;

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
	 * 参画日
	 */
	private String sankaku_dt;

	/**
	 * 参画日を取得
	 * @return sankaku_dt
	 */
	public String getSankaku_dt() {
		return sankaku_dt;
	}

	/**
	 * 参画日を設定
	 * @param sankaku_dt
	 */

	public void setSankaku_dt(String sankaku_dt) {

		this.sankaku_dt = sankaku_dt;
	}

	/**
	 * 検索キー
	 */
	private String kensakuKeyList;

	/**
	 * 検索キーを取得
	 * @return kensakuKeyList
	 */
	public String getKensakuKeyList() {
		return kensakuKeyList;
	}

	/**
	 * 検索キーを設定
	 * @param kensakuKeyList
	 */
	public void setKensakuKeyList(String kensakuKeyList) {
		this.kensakuKeyList = kensakuKeyList;
	}

	/**
	 * ページ
	 */
	private String page;

	/**
	 * ページを取得
	 * @return page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * ページを設定
	 * @param page
	 */
	public void setPage(String page) {
		this.page = page;
	}
	/**
	 * エラー表示
	 */
	private List<String> error_hyoji;
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

}
