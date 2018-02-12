package jp.arise.com.form;

import java.util.List;

import jp.arise.com.dto.COMGM002Dto;

/**
 * COMGM002 メニュー画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM002Form {

	/**
	 * お知らせ情報
	 */
	private List<COMGM002Dto> news;

	/**
	 * お知らせ情報を取得
	 * @return news
	 */
	public List<COMGM002Dto> getNews() {
		return news;
	}

	/**
	 * お知らせ情報を設定
	 * @param news
	 */
	public void setNews(List<COMGM002Dto> news) {
		this.news = news;
	}

}
