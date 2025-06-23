package drill10_arraylist_for;

import java.util.ArrayList;

/*
 * 【問題】
 * ArrayList に整数 (1, 2, 3, 4, 5) を追加し、
 * 普通の for 文（拡張 for ではなく）で順に出力してください。
 *
 * 【期待される出力】
 * 1
 * 2
 * 3
 * 4
 * 5
 */

public class ArrayListFor3 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
