package jp.arise.com.dto;

import java.io.Serializable;

/**
 * COMGM002 メニュー画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM002Dto implements Serializable{

	/**
	 * お知らせID
	 */
	private String osirase_id;

	/**
	 * カテゴリコード
	 */
	private int categori_cd;

	/**
	 * お知らせ名
	 */
	private String osirase_na;

	/**
	 * お知らせ内容
	 */
	private String osirase_info;

	/**
	 * お知らせIDを取得
	 * @return user
	 */
	public String getOsirase_id() {
		return osirase_id;
	}

	/**
	 * お知らせIDを設定
	 * @param user
	 */
	public void setOsirase_id(String osirase_id) {
		this.osirase_id = osirase_id;
	}

	/**
	 * カテゴリコードを取得
	 * @return user
	 */
	public int getCategori_cd() {
		return categori_cd;
	}

	/**
	 * カテゴリコードを取得
	 * @return user
	 */
	public void setCategori_cd(int categori_cd) {
		this.categori_cd = categori_cd;
	}

	/**
	 * お知らせ名を取得
	 * @return user
	 */
	public String getOsirase_na() {
		return osirase_na;
	}

	/**
	 * お知らせ名を取得
	 * @return user
	 */
	public void setOsirase_na(String osirase_na) {
		this.osirase_na = osirase_na;
	}

	/**
	 * お知らせ内容を取得
	 * @return user
	 */
	public String getOsirase_info() {
		return osirase_info;
	}

	/**
	 * お知らせ内容を取得
	 * @return user
	 */
	public void setOsirase_info(String osirase_info) {
		this.osirase_info = osirase_info;
	}

}
