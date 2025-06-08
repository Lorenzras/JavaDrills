package drill08_continue;

/*
 * 整数を 0 ～ 10 まで出力するループを書いてください。
 * ただし、3 のときだけは表示せずにスキップするように continue 文を使ってください。
 */

public class Continue1 {
	public static void main(String[] args) {
		// ここにfor文を書いてください
		for (int i = 0; i <= 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
}
