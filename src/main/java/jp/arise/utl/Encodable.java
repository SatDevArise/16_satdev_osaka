package jp.arise.utl;

import java.io.Serializable;

/**
 *  Enum用エンコーダーインターフェース
 *
 * @param <T> Enum定義
 * @author KenshiKouno
 * @since 2017/11/26
 */

public interface Encodable<T extends Serializable> {

    /**
     * エンコーダー
     *
     * @return Enum定義
     */
    T getCode();

    /**
     * コードの名称を返す.
     *
     * @return 名称
     */
    String getName();
}