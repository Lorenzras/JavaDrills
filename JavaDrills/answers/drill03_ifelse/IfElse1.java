package drill03_ifelse;

/*
* 変数 score が 60 以上なら「合格」と出力し、
* そうでなければ「不合格」と出力する if-else 文を書いてください。
*
*/

public class IfElse1 {
	public static void main(String[] args) {
		int score = 65;
		String result = "";

		// ここに条件を書いてください
		if (score >= 60) {
			result = "合格";
		} else {
			result = "不合格";
		}

		System.out.println(result);
	}
}
