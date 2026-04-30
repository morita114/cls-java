public class ZeroDivision {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // ゼロ除算によるエラーが発生
        // System.out.printf("%d / %d = %d%n", a, b, a / b);

        // 例外処理を追加して、ゼロ除算のエラーをキャッチ
        try {
            // ゼロ除算によるエラーが発生
            System.out.printf("%d / %d = %d%n", a, b, a / b);
        } catch (ArithmeticException e) {
            System.out.println("ゼロ除算は許可されていません。");
        } finally {
            System.out.println("プログラムは正常に終了します。");
        }
    }
}

