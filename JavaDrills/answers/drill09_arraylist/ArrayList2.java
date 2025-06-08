package drill09_arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 文字列型の List を作成し、「Apple」「Banana」「Cherry」を追加してください。
 * 2 番目の要素を出力してください。
 */

public class ArrayList2 {
    public static void main(String[] args) {
        // ここの記述を考えてください
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits.get(1));
    }
}
