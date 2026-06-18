import java.util.*;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        numbers.sort((a, b) -> a - b);  // 昇順
        System.out.println(numbers);  // [1, 2, 3, 5, 8, 9]

        numbers.sort((a, b) -> b - a);  // 降順
        System.out.println(numbers);  // [9, 8, 5, 3, 2, 1]
    }
}



// @FunctionalInterface
// public interface Comparator<T> {
//     int compare(T o1, T o2);
// }

