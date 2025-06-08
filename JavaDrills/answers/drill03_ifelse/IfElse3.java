package drill03_ifelse;

/*
* 変数 num が 0 より大きければ「正の数」、そうでなければ「0 以下」と出力する if-else 文を書いてください。
*
*/

public class IfElse3 {
    public static void main(String[] args) {
        int num = -3; // 値を自由に変えてみてください
        String result = "";

        if (num > 0) {
            result = "正の数";
        } else {
            result = "0 以下";
        }

        System.out.println(result);
    }
}
