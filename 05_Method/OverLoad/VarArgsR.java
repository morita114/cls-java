import java.util.Arrays;

public class VarArgsR {
    static double calc (String op, double x) {
        System.out.println(x + " = ");
        return x;
    }

    static double calc(String op, double... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("calc() requires at least one number.");
        }

        // 先頭要素と「残り全部」に分割して再帰
        double head = nums[0];
        double[] tail = Arrays.copyOfRange(nums, 1, nums.length);
        double restResult = calc(op, tail); // tailを渡して再帰

        return switch (op) {
            case "+" -> head + restResult;
            case "*" -> head * restResult;
            case "-" -> head - restResult;
            default -> throw new IllegalArgumentException("Unsupported operator: " + op);
        };
    }

    public static void main(String[] args) {
        System.out.println(calc("+",   1, 2, 3, 4));        // 10.0
        System.out.println(calc("*",   2, 3, 4));            // 24.0
        System.out.println(calc("max", 3, 1, 4, 1, 5, 9));  // 9.0
        System.out.println(calc("min", 3, 1, 4, 1, 5, 9));  // 1.0
        System.out.println(calc("-",   10, 3, 2));           // 5.0
    }
}
