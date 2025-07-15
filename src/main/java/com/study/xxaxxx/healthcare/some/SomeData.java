package com.study.xxaxxx.healthcare.some;

public record SomeData (
    /** ワンちゃんの画像のURL */
    String message,

    /** APIの結果ステータス */
    String status,

    /** 処理失敗時のエラーメッセージ */
    String errorMessage) {

    /** エラーメッセージ設定 */
    public SomeData withErrorMessage(String newErrorMessage) {
    return new SomeData(this.message, this.status,
        newErrorMessage);
    }

}
