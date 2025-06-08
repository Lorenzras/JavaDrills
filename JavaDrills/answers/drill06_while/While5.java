package drill06_while;

/*
 * 「カウント:○」と 1〜3 まで表示してください。
 * （例：「カウント:1」〜「カウント:3」）
 * do-while 文を使ってください。
 */

public class While5 {
	public static void main(String[] args) {
		int count = 1;

		// ここに do-while文 を書いてください
		do {
			System.out.println("カウント:" + count);
			count++;
		} while (count <= 3);
	}
}
