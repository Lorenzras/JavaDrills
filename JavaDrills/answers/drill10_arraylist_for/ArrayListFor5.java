package drill10_arraylist_for;

import java.util.ArrayList;

/*
 * 【問題】
 * ArrayList に (5, 10, 15, 20, 25) を追加し、
 * for 文（拡張 for ではなく）で 5 倍した値をそれぞれ出力してください。
 *
 * 【期待される出力】
 * 25
 * 50
 * 75
 * 100
 * 125
 */

public class ArrayListFor5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) * 5);
        }
    }
}
