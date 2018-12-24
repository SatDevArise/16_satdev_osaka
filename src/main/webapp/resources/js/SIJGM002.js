/**
 * SIJGM002 社員情報新規登録・編集画面用JavaScript
 *
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */

/**
 * 必須チェック処理
 */
function requiredCheck() {
	var a = document.fa.NamA.value;
	var b = a.length;
	var txt = document.fa.NamA.value;
	var result = txt.match(/[^0-9]/g);

	if (document.fa.NamA.value == "") {
		alert("検索キーが入力されていません。");
		return false;
	} else if (b > 16) {
		alert(b + "桁入力されています。入力できる文字数は16桁です。");
		return false;
	} else if (b < 16) {
		alert(b + "桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		// ＊＊＊
		// OK場合はtrueを返す
		return true;
	}

}

/**
 * 削除確認処理
 */

function confirmDelete(){
	if (window.confirm('本当に削除しますか？')) {

		window.alert('削除しました。');
		return true;
	} else {
		window.alert('キャンセルしました。');
		return true;
	};
};

/**
 * 更新確認処理
 */

function confirmUpload(){
	if (window.confirm('本当に更新しますか？')){
		window.alert('更新しました。');
		return true;
	}else{
		window.alert('キャンセルしました。');
		return true;
	};
};


/**
 * ボタン非活性処理
 */
function disabled() {
	document.getElementById("update").disabled = true;
	document.getElementById("delete").disabled = true;
}

disabled();

/**
 * 非活性解除処理
 */
function undisabled() {
	document.getElementById("syainId").disabled = false;
}