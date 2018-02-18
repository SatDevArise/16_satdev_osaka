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
	COMI007("現在お知らせ情報はありません。"),

	/**
	 * メッセージID:COME007
	 */
	COME008("条件に該当する社員情報はありません"),

	/**
	 * メッセージID:COME009
	 */
	COME009("社員IDは数字4桁で入力してください。"),

	/**
	 * メッセージID:COME010
	 */
	COME010("生年月日は数字8桁で入力してください。"),

	/**
	 * メッセージID:COME011
	 */
	COME011("生年月日の入力が正しくありません。確認してください。"),

	/**
	 * メッセージID:COME012
	 */
	COME012("入社日は数字8桁で入力してください。"),

	/**
	 * メッセージID:COME013
	 */
	COME013("入社日の入力が正しくありません。確認してください。"),

	/**
	 * メッセージID:COME014
	 */
	COME014("単価は半角数字とピリオドで入力してださい。");

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
