package drill05_switch;

/*
* 変数 season に季節名（"春", "夏", "秋", "冬"）が入るとき、
* それぞれに対応するメッセージを switch 文で自由に出力してください。
* それ以外の季節は「不明な季節です」と出力してください。
*/


public class Switch5 {
	public static void main(String[] args) {
		String season = "夏"; // 自由に値を変えてください

		// ここにswitch文を書いてください
		switch (season) {
		case "春":
			System.out.println("花が咲く季節です");
			break;
		case "夏":
			System.out.println("海に行こう");
			break;
		case "秋":
			System.out.println("紅葉がきれいです");
			break;
		case "冬":
			System.out.println("雪が降ります");
			break;
		default:
			System.out.println("不明な季節です");
		}
	}
}
