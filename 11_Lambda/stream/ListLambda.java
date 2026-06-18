import java.util.*;

public class ListLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // forEach：各要素に処理を適用
        numbers.forEach(n -> System.out.println(n));

        // 条件に合う要素の抽出
        List<Integer> evens = new ArrayList<>(); // 結果格納用
        numbers.forEach(n -> { if (n % 2 == 0) evens.add(n); });
        // メソッド参照で出力
        evens.forEach(System.out::println);  // 2, 4
        
        // 各要素を変換
        List<Integer> doubled = new ArrayList<>();  // 結果格納用
        numbers.forEach(n -> doubled.add(n * 2));
        doubled.forEach(System.out::println);  // 2, 4, 6, 8, 10
    }
}

