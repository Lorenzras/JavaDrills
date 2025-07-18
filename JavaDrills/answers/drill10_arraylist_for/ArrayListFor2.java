package drill10_arraylist_for;

/*
 * 【問題】
 * ArrayList に (9, 8, 7, 6, 5) を追加し、
 * 普通の for 文（拡張 for ではなく）で要素を逆順に出力してください。
 *
 * 【期待される出力】
 * 5
 * 6
 * 7
 * 8
 * 9
 */

import java.util.ArrayList;

public class ArrayListFor2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
