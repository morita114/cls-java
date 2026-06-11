import java.util.Arrays;
import java.util.List;

public class WildExtPrintBox {
    public static void printList(List<?> list) {                   // Listに何が入っててもOK
        for (Object obj : list) { System.out.print(obj + ", "); }
        System.out.println();
    }
    public static void printNumbers(List<? extends Number> list) { // List内をNumberかそのサブクラスに限定
        for (Number num : list) { System.out.print(num + ", "); }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        printNumbers(intList); // 1, 2, 3
        printList(intList);    // 1, 2, 3

        List<String> strList = Arrays.asList("a", "b", "c");
        // printNumbers(strList); // Compile error
        printList(strList);    // a, b, c
    }
}

