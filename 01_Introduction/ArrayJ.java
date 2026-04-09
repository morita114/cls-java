public class ArrayJ {
    public static void main(String[] args) {
        int[][] m1 = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };

        int[][] m2 = new int[3][];
        m2[0] = new int[2];   // 1行目：2要素
        m2[1] = new int[4];   // 2行目：4要素
        m2[2] = new int[3];   // 3行目：3要素
    }
}


