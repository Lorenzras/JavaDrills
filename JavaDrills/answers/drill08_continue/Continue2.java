package drill08_continue;

/*
 * 整数を 0 ～ 10 まで出力するループを書いてください。
 * ただし、2 と 4 は表示せずにスキップするように continue 文を使ってください。
 */

public class Continue2 {
	public static void main(String[] args) {

		// ここにfor文を書いてください
		for (int i = 0; i <= 10; i++) {
			if (i == 2 || i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
}
