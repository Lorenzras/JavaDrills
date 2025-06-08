package drill05_switch;

/*
* 変数 day に 1〜4 の数字が入るとき、それぞれに対応した曜日を switch 文で出力してください。
* 1:「月曜日」、2:「火曜日」、3:「水曜日」、4:「木曜日」、その他は「その他の日」
*/

public class Switch1 {
	public static void main(String[] args) {
		int day = 4;

		// ここにswitch文を書いてください
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		default:
			System.out.println("その他の日");
			break;
		}
	}
}
