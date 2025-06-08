package drill09_arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * List に 7, 14, 21, 28, 35 を追加し、4 番目の要素を出力してください。
 */

public class ArrayList4 {
    public static void main(String[] args) {
        // ここの記述を考えてください
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(14);
        numbers.add(21);
        numbers.add(28);
        numbers.add(35);

        System.out.println(numbers.get(3));
    }
}
