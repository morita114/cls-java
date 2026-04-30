class ZeroDivisionException extends Exception {
    private final int dividend; // 割られる数

    public ZeroDivisionException(String message, int dividend) {
        super(message);
        this.dividend = dividend;
    }

    public int getDividend() {
        return dividend;
    }
}

// 使用例
public class CustomExceptionExample {
    public static int divide(int a, int b) throws ZeroDivisionException {
        if (b == 0) {
            throw new ZeroDivisionException("ゼロ除算は許可されていません。dividend=" + a, a);
        }
        return a / b;
    }

    public static void main(String[] args) {
        int[][] testCases = {{10, 2}, {10, 0}, {9, 3}};

        for (int[] tc : testCases) {
            try {
                int result = divide(tc[0], tc[1]);
                System.out.printf("%d / %d = %d%n", tc[0], tc[1], result);

            } catch (ZeroDivisionException e) {
                System.out.printf("エラー: %s%n", e.getMessage());
                System.out.printf("  → %d を割ろうとしました%n", e.getDividend());
            }
        }
    }
}