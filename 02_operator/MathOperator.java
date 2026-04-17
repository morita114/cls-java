public class MathOperator {
    public static void main(String[] args) {
        // ① 整数除算はCと同じ（小数部切り捨て）
        System.out.println(7 / 2);     // → 3
        System.out.println(7.0 / 2);   // → 3.5

        // ② ++i と i++ の挙動はCと同じ
        int i = 5;
        System.out.println(i++);  // → 5（後置：使用後に+1）
        System.out.println(++i);  // → 7（前置：+1してから使用）

        // ③ Stringへの+は演算順序（左結合）に注意する
        System.out.println("値は" + 3 + 4);   // → "値は34"
        System.out.println("値は" + (3 + 4)); // → "値は7"
        System.out.println(3 + 4 + "です");   // → "7です"
    }
}

