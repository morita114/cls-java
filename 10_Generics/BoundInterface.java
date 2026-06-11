public class BoundInterface {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 5)); // 5
        System.out.println(max("apple", "banana")); // banana
    }
}

