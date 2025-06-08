package drill07_while_break;

/*
 * 整数型の変数 i を 10 まで出力する while 文を書いてください。
 * ただし、5 を出力した時点でループを終了するように break 文を使ってください。
 * ※ 6 ～ 10 の数字は出力されません。
 */

public class WhileBreak1 {
	public static void main(String[] args) {
		int i = 1;

		// ここにwhile文を書いてください
		while (i <= 10) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			i++;
		}
	}
}
