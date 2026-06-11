import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        // String[] fruitsArray = new String[3];           // 固定長配列を用いる場合
        ArrayList<String> fruits = new ArrayList<>();   // ArrayListを用いる場合

        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits); // [apple, banana]

        System.out.println(fruits.get(0)); // apple, インデックスでの要素アクセス

        fruits.set(0, "cherry");    // インデックスでの要素更新
        System.out.println(fruits); // [cherry, banana]

        fruits.remove("cherry");    // 値で削除
        fruits.remove(0);           // インデックスで削除
        System.out.println(fruits); // []

        System.out.println(fruits.size()); // 0, 配列のサイズ
    }
}

