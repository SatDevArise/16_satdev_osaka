package jp.arise.sij.message;

/**
 * SIJ用メッセージ
 * SIJで共通利用されるメッセージ
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public enum SIJMessage {

	/**
	 * メッセージID:SIJE001
	 */
	SIJE001("社員IDが未入力です。社員IDを数字4桁で入力してください"),

	/**
	 * メッセージID:SIJE002
	 */
	SIJE002("氏名が未入力です。全角で入力してください"),

	/**
	 * メッセージID:SIJE003
	 */
	SIJE003("生年月日が未入力です。"),


	/**
	 * メッセージID:SIJE004
	 */
	SIJE004("生年月日はyyyyMMdd形式で入力してください。"),

	/**
	 * メッセージID:SIJE005
	 */
	SIJE005("生年月日は8桁で入力してください。"),

	/**
	 * メッセージID:SIJE006
	 */
	SIJE006("最寄り駅１が未入力です。"),

	/**
	 * メッセージID:SIJE007
	 */
	SIJE007("最寄り駅2が未入力です。"),

	/**
	 * メッセージID:SIJE008
	 */
	SIJE008("電話番号が未入力です。");

	/**



	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * コンストラクタ
	 */
	SIJMessage(String message) {
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
