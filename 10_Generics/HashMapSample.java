import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 85); // 追加1
        map.put("Bob",   72); // 追加2
        map.put("Alice", 90); // 更新、同じキーはで上書き

        System.out.println(map.get("Alice")); // Aliceの値を取得: 90
        System.out.println(map.get("Dave"));  // 存在しないキーの値は null

        System.out.println(map.containsKey("Bob"));   // 「Bob」が存在するか: true
        System.out.println(map.containsKey("Dave"));  // 「Dave」が存在するか: false

        map.remove("Bob"); // 「Bob」を削除
        for (String key : map.keySet()) { System.out.println(key + ": " + map.get(key)); } // 一覧表示

        System.out.println(map.size()); // サイズの取得: 1
    }
}

