package drill04_ifelseif;

/*
* 変数 age が以下のように分類される if-else if 文を作成してください。
* 分類結果を格納する変数名は result としてください。
*
* - 65 以上：「高齢者」
* - 18〜64：「成人」
* - 未満：「未成年」
*/

public class IfElseIf2 {
	public static void main(String[] args) {
		int age = 23; // 値を自由に変えてみてください
		String result = "";

		// ここに条件を書いてください
		if (age >= 65) {
			result = "高齢者";
		} else if (age >= 18) {
			result = "成人";
		} else {
			result = "未成年";
		}

		System.out.println(result);
	}
}
