package drill04_ifelseif;

/*
* 変数 height が以下のように分類される if-else if 文を作成してください。
* 分類結果を格納する変数名は category としてください。
*
* - 180cm 以上：「高身長」
* - 160cm 以上 180cm 未満：「平均」
* - 160cm 未満：「低身長」
*/

public class IfElseIf3 {
    public static void main(String[] args) {
        int height = 170; // 値を自由に変えてみてください
        String category = "";

        // ここに条件を書いてください
        if (height >= 180) {
            category = "高身長";
        } else if (height >= 160) {
            category = "平均";
        } else {
            category = "低身長";
        }

        System.out.println(category);
    }
}
