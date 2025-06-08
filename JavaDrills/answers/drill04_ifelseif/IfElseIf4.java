package drill04_ifelseif;

/*
* 変数 temperature が以下のように分類される if-else if 文を作成してください。
* 分類結果を格納する変数名は condition としてください。
*
* - 38.0 度以上：「高熱」
* - 37.0 度以上 38.0 度未満：「微熱」
* - 37.0 度未満：「平熱」
*/

public class IfElseIf4 {
	public static void main(String[] args) {
		double temperature = 37.5;
		String condition = "";

		// ここに条件を書いてください
		if (temperature >= 38.0) {
			condition = "高熱";
		} else if (temperature >= 37.0) {
			condition = "微熱";
		} else {
			condition = "平熱";
		}

		System.out.println(condition);
	}
}
