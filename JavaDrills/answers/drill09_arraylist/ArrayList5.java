package drill09_arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * 整数のリスト（11, 22, 33, 44, 55）を作成し、最後の要素を出力してください。
 */

public class ArrayList5 {
    public static void main(String[] args) {
        // ここの記述を考えてください
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println(list.get(list.size() - 1));
    }
}
