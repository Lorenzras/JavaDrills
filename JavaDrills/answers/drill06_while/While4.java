package drill06_while;

/*
 * 「現在 ○ 回目です」と出力しながら、1 回目〜3 回目まで表示してください。
 * （例：「現在 1 回目です」〜「現在 3 回目です」）
 */

public class While4 {
	public static void main(String[] args) {
		int count = 1;

		// ここにwhile文を書いてください
		while (count <= 3) {
			System.out.println("現在 " + count + " 回目です");
			count++;
		}
	}
}
