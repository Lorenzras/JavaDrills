package drill04_ifelseif;

/*
* 変数 score が以下のように分類される if-else if 文を作成してください。
* 分類結果を格納する変数名は result としてください。
*
* - 90 点以上：「S ランク」
* - 70 点以上 90 点未満：「A ランク」
* - 50 点以上 70 点未満：「B ランク」
* - 50 点未満：「C ランク」
*/

public class IfElseIf5 {
	public static void main(String[] args) {
		int score = 68;
		String result = "";

		// ここに条件を書いてください
		if (score >= 90) {
			result = "S ランク";
		} else if (score >= 70) {
			result = "A ランク";
		} else if (score >= 50) {
			result = "B ランク";
		} else {
			result = "C ランク";
		}

		System.out.println(result);
	}
}
