class Utils {
    public static <T> void printArray(T[] array) {
        for (T item : array) { System.out.print(item + " "); }
        System.out.println();
    }

    public static <T> T[] swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}

public class GenMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D", "E"};

        Utils.<Integer>printArray(intArray); // 明示的に型引数を指定
        Utils.printArray(strArray);          // 型引数は推論されるため、省略可能

        Utils.swap(intArray, 0, 4);         // 型推論を利用して型引数を省略
        Utils.<String>swap(strArray, 1, 3); // 明示的に型引数を指定
    }
}

