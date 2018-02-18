/**
 * COMGM003 検索共通画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */

/**
 * 初期処理
 */
window.onload = function () {
	// 検索結果がある場合は呼び出し元画面に検索結果を返す
	var resultList = document.getElementById("resultList");
	var disp_id = document.getElementById("disp_id");
	if(!!resultList) {
		//検索結果が存在する場合
		if(disp_id.value == "GBJGM001"){
			window.opener.document.GBJGM001Form.resultList.value = resultList.value();
			window.close();
			return false;
		} else if(disp_id.value == "SIJGM001"){
			window.opener.document.SIJGM001Form.resultList.value = resultList.value();
			window.close();
			return false;
		}
	} else {
		//検索結果が存在しない場合
		//検索画面で処理継続
	}

	// 画面IDがGBJGM001の場合に項目の制御を行う
	if(disp_id.value == "GBJGM001"){
		//社員IDを非活性にする
		var $elementNodeReference = document.getElementById("syain_id");
		$elementNodeReference.disabled = true;

		//生年月日Fromを非活性にする
		var $elementNodeReference = document.getElementById("seinengappi_from");
		$elementNodeReference.disabled = true;

		//生年月日Toを非活性にする
		var $elementNodeReference = document.getElementById("seinengappi_to");
		$elementNodeReference.disabled = true;

		//前職を非活性にする
		var $elementNodeReference = document.getElementById("seinengappi_to");
		$elementNodeReference.disabled = true;

		//役職を非活性にする
		var $elementNodeReference = document.getElementById("position");
		$elementNodeReference.disabled = true;

		//入社日Fromを非活性にする
		var $elementNodeReference = document.getElementById("nyusyabi_from");
		$elementNodeReference.disabled = true;

		//入社日Toを非活性にする
		var $elementNodeReference = document.getElementById("nyusyabi_to");
		$elementNodeReference.disabled = true;

		//チームを非活性にする
		var $elementNodeReference = document.getElementById("team_na");
		$elementNodeReference.disabled = true;

		//単価を非活性にする
		var $elementNodeReference = document.getElementById("tanka");
		$elementNodeReference.disabled = true;
	}
};
