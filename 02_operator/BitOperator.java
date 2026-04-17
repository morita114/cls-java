public class BitOperator {
    public static void main(String[] args) {
        int n = -1;

        System.out.println(n >> 1);   // → -1（符号ビットを保持）
        System.out.println(n >>> 1);  // → 2147483647（0埋め）

        // 元データ:      11111111 11111111 11111111 11111111
        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        // 符号ありシフト 11111111 11111111 11111111 11111111
        System.out.println(String.format("%32s", Integer.toBinaryString(n >> 1)).replace(' ', '0'));
        // 符号なしシフト 01111111 11111111 11111111 11111111
        System.out.println(String.format("%32s", Integer.toBinaryString(n >>> 1)).replace(' ', '0'));

    }
}

