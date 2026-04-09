public class ArrayN {
    public static void main(String[] args) {
        // Java：配列の配列（参照の配列）
        int[][] matrix1 = new int[3][4];    // 宣言＋確保（0）
        int[][] matrix2 = {                 // 宣言＋初期化
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12}
        };
        matrix2[1][2] = 99;                 // アクセス（同じ）

        final int rows = matrix2.length;    // 行数
        final int cols = matrix2[0].length; // 列数（1行目の列数）
    }
}


