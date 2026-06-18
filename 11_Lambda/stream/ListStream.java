import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 3, 1, 5);
        
        // forEach：各要素に処理を適用
        numbers.forEach(n -> System.out.println(n)); // 4, 2, 3, 1, 5

        // 条件に合う要素の抽出 (filter)
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        evens.forEach(System.out::println);  // 4, 2
        
        // 各要素を変換（map）
        numbers.stream()
               .map(n -> n * 2)
               .sorted()
               .forEach(System.out::println);  // 2, 4, 6, 8, 10
    }
}

