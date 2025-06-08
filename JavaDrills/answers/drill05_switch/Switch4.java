package drill05_switch;

/*
* 変数 color に色の名前（"赤", "青", "黄"）が入るとき、それぞれに対応した英語を switch 文で出力してください。
* それ以外の色の場合は「Other」と出力してください。
*/

public class Switch4 {
	public static void main(String[] args) {
		String color = "赤"; // 自由に値を変えてください

		// ここにswitch文を書いてください
		switch (color) {
		case "赤":
			System.out.println("Red");
			break;
		case "青":
			System.out.println("Blue");
//			break;
		case "黄":
			System.out.println("Yellow");
			break;
		default:
			System.out.println("Other");
		}
	}
}
