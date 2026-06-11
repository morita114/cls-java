import java.util.ArrayList;

class CollectionUtils {
    public static <T> void printAll(ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T max(ArrayList<T> list) {
        if (list.isEmpty()) return null;

        T result = list.get(0);
        for (T item : list) {
            if (item.compareTo(result) > 0) {
                result = item;
            }
        }
        return result;
    }
}

public class Ex2Method {
    public static void main(String[] args) {
        // Integer
        ArrayList<Integer> nums = new ArrayList<>();
        for (int n : new int[]{38, 91, 55, 73, 60, 47, 82}) {
            nums.add(n);
        }
        CollectionUtils.printAll(nums);                 // 全要素の表示
        System.out.println(CollectionUtils.max(nums));  // 最大値

        // String
        ArrayList<String> words = new ArrayList<>();
        for (String w : new String[]{"banana", "apple", "elderberry", "cherry", "date"}) {
            words.add(w);
        }
        CollectionUtils.printAll(words);                // 全要素の表示
        System.out.println(CollectionUtils.max(words)); // 最大値
    }
}