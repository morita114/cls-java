public class TernaryOperator {
    public static void main(String[] args) {
        int x = 1;

        // String y = x ? "not zero" : "zero";  // → コンパイルエラー
        String y = (x != 0) ? "not zero" : "zero";
        System.out.println("y is " + y);
    }
}

