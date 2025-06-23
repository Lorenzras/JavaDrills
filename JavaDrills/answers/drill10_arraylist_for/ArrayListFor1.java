package drill10_arraylist_for;

/*
 * 【問題】
 * ArrayList に偶数 (2, 4, 6, 8, 10) を追加し、
 * 普通の for 文（拡張 for ではなく）で順に出力してください。
 *
 * 【期待される出力】
 * 2
 * 4
 * 6
 * 8
 * 10
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListFor1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
