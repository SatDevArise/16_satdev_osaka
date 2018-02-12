/**
 * COMGM002 メニュー画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */



/**
 * 確認ダイアログの表示
 */
function logout()
  {
	if (window.confirm('ログアウトしますか?')) {
		return true;
	} else {
		return false;
	}
}
