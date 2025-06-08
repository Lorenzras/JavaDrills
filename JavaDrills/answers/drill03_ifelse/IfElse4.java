package drill03_ifelse;

/*
* 変数 temperature が 37.0 以上のとき「発熱あり」、
* そうでなければ「平熱」と出力する if-else 文を書いてください。
*
*/

public class IfElse4 {
	public static void main(String[] args) {
		double temperature = 36.8; // 値を自由に変えてみてください
		String result = "";

		// ここに条件を書いてください
		if (temperature >= 37.0) {
			result = "発熱あり";
		} else {
			result = "平熱";
		}

		System.out.println(result);
	}
}
