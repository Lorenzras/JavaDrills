package drill06_while;

/*
 * 文字列「★」を 3 回繰り返して出力してください。
 * 改行しなくて構いません。print を使ってください。
 * ※do-while 文を使ってください。
 */

public class While3 {
	public static void main(String[] args) {
		int i = 0;

		// ここに do-while文 を書いてください
		do {
			System.out.print("★");
			i++;
		} while (i < 3);
	}
}
