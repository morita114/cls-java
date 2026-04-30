public class ThrowArithmetricException {
    public static void main(String[] args) {
        System.out.printf("10 / 2 = %d%n", divide(10, 2));  // 5
        System.out.printf("10 / 0 = %d%n", divide(10, 0));  // エラー

        // try {
        //     System.out.printf("10 / 2 = %d%n", divide(10, 2));  // 5
        //     System.out.printf("10 / 0 = %d%n", divide(10, 0));  // エラー
        // } catch (ArithmeticException e) {
        //     System.out.println("ゼロ除算は許可されていません。");
        // } finally {
        //     System.out.println("プログラムは正常に終了します。");
        // }
    }

    public static int divide(int a, int b) throws ArithmeticException {
    // public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("ゼロ除算は許可されていません。");
        }
        return a / b;
    }
}

