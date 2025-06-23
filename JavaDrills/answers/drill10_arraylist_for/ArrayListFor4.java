package drill10_arraylist_for;

import java.util.ArrayList;

/*
 * 【問題】
 * ArrayList に (100, 200, 300, 400) を追加し、
 * 合計値を for 文（拡張 for ではなく）で計算して出力してください。
 *
 * 【期待される出力】
 * 1000
 */

public class ArrayListFor4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum);
    }
}
