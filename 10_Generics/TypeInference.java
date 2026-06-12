import java.util.ArrayList;
import java.util.HashMap;

public class TypeInference {
    public static <T> void printArrayList(ArrayList<T> list) {
        System.out.println("ArrayList contains: " + list);
    }

    public static void main(String[] args) {
        // インスタンス生成時
        ArrayList<String> list1 = new ArrayList<String>();  // 明示的に型指定
        ArrayList<String> list2 = new ArrayList<>();        // 型推論
        // ArrayList<> list3 = new ArrayList<String>();     // 型推論できない

        HashMap<String, Integer> map1 = new HashMap<String, Integer>(); // 型指定
        HashMap<String, Integer> map2 = new HashMap<>();                // 型推論
        // HashMap<> map1 = new HashMap<String, Integer>(); // 型推論できない

        // メソッド呼び出し時
        TypeInference.<String>printArrayList(list2); // 明示的に型指定
        printArrayList(list2);                       // 型推論
    }
}

