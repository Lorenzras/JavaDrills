package drill08_for_continue;

/*
 * 整数を 0 ～ 10 まで出力するループを書いてください。
 * ただし、奇数はスキップして、偶数だけ出力してください。
 */

public class ForContinue4 {
	public static void main(String[] args) {

		// ここにfor文を書いてください
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
