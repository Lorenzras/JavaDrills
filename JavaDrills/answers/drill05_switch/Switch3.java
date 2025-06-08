package drill05_switch;

/*
* 変数 number に 1〜2 の数字が入るとき、それぞれに対応した文字列を switch 文で出力してください。
* 1:「ON」、2:「OFF」、その他は「UNKNOWN」
*/

public class Switch3 {
	public static void main(String[] args) {
		int number = 2; // 自由に値を変えてください

		// ここにswitch文を書いてください
		switch (number) {
		case 1:
			System.out.println("ON");
			break;
		case 2:
			System.out.println("OFF");
			break;
		default:
			System.out.println("UNKNOWN");
		}
	}
}
