package drill09_arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList に[10, 20, 30]を追加し、2 番目の要素を出力してください。
 */

public class ArrayList1 {
    public static void main(String[] args) {
        // ここの記述を考えてください
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1));
    }
}
