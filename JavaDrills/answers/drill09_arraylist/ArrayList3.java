package drill09_arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 空の文字列 List を作成し、3 つの動物名（例：「Cat」「Dog」「Elephant」）を追加し、
 * 最初の要素を出力してください。
 */

public class ArrayList3 {
    public static void main(String[] args) {
        // ここの記述を考えてください
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");

        System.out.println(animals.get(0));
    }
}
