package jp.arise.code;

import jp.arise.utl.Decoder;
import jp.arise.utl.Encodable;


/**
 * 役職コードの列挙型クラス
 *
 * @author KenshiKouno
 * @since 2017/11/26
 */
public enum YakusyokuCd implements
                     Encodable<String> {

    /** メンバー */
    MEMBER("01", "メンバー"),
    /** サブリーダー */
    SUBLEADER("02", "サブリーダー"),
    /** リーダー */
	LEADER("03", "リーダー"),
	/** マネージャ */
	MANAGER("04","マネージャ"),
	/** 部長 */
	DEPARTMENT("05","部長"),
	/** 代表取締役 */
	CEO("06","代表取締役"),
	/** 営業 */
	SALES("07","営業"),
	/** 契約社員 */
	PART("08","契約社員");

    /** デコーダー */
    private static final Decoder<String, YakusyokuCd> DECODER = Decoder.create(values());

    /** コード値 */
    private final String code;

    /** 名称 */
    private final String name;

    /**
     * コンストラクタ.
     *
     * @param code コード値
     * @param name 名称
     */
    private YakusyokuCd(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * コード値からEnumクラスを取得する.
     *
     * @param code コード値
     * @return 受領形式Enumクラス
     */
    public static YakusyokuCd decode(String code) {
        return DECODER.decode(code);
    }

    /**
     * コードを取得する
     *
     * @return コード
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * 名称を取得する.
     *
     * @return 名称
     */
    public String getName() {
        return name;
    }
}
