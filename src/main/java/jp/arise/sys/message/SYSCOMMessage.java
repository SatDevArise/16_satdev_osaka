package jp.arise.sys.message;

/**
 * COM用メッセージ
 * COMで共通利用されるメッセージ
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public enum SYSCOMMessage {

	/**
	 * メッセージID:COME001
	 */
	SYSCOME001("ユーザー名かパスワードが間違っています。"),

	/**
	 * メッセージID:COME002
	 */
	SYSCOME002("メッセージ文2"),

	/**
	 * メッセージID:COME003
	 */
	SYSCOME003("メッセージ文3");

	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * コンストラクタ
	 */
	SYSCOMMessage(String message) {
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
