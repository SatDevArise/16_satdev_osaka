package jp.arise.com.message;

/**
 * COM用メッセージ
 * COMで共通利用されるメッセージ
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public enum COMMessage {

	/**
	 * メッセージID:COME001
	 */
	COME001("ユーザーIDは半角英数字で入力してください。"),

	/**
	 * メッセージID:COME002
	 */
	COME002("ユーザーIDはAR+半角数字6桁で入力してください。"),

	/**
	 * メッセージID:COME003
	 */
	COME003("パスワードは半角英数字で入力してください"),

	/**
	 * メッセージID:COME004
	 */
	COME004("ユーザーIDかパスワードが正しくありません。"),

	/**
	 * メッセージID:COME005
	 */
	COME005("ユーザーIDを入力してください。"),

	/**
	 * メッセージID:COME006
	 */
	COME006("パスワードを入力してください。"),

	/**
	 * メッセージID:COME007
	 */
	COMI007("現在お知らせ情報はありません。");

	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * コンストラクタ
	 */
	COMMessage(String message) {
		this.message = message;
	}

	/**
	 * messageを取得
	 * @return message
	 */
	public String getMessage() {
		return this.message;
	}

}
