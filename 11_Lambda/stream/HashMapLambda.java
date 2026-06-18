import java.util.*;

public class HashMapLambda {
    public static void main(String[] args) {
        // Hashmap を定義と同時に初期化
        HashMap<String, Integer> map3 = new HashMap<>() {{
            put("Taro", 75); put("Hanako", 45); put("Mie", 92);
        }};

        // forEach：各要素に処理を適用
        map3.forEach((name, score) -> System.out.println("ALL " + name + ": " + score));

        // 条件に合う要素の抽出
        HashMap<String, Integer> over60 = new HashMap<>(); // 結果格納用
        map3.forEach((name, score) -> { if (score > 60) over60.put(name, score); });
        over60.forEach((name, score) -> System.out.println("OVER 60 " + name + ": " + score));

        // 各要素を変換
        HashMap<String, Integer> doubled = new HashMap<>();  // 結果格納用
        map3.forEach((name, score) -> doubled.put(name, score * 2));
        doubled.forEach((name, score) -> System.out.println("DOUBLED " + name + ": " + score));
    }
}

