public class IfStatement {
    public static void main(String[] args) {
        int x = 1;

        if (x) { }  // → コンパイルエラー（Javaは条件式にboolean型を要求する）
        if (x != 0) {  // → 条件式をboolean型にする必要がある
            System.out.println("x is not equal to zero.");
        }
    }
}

