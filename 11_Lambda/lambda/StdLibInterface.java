import java.util.function.Function;
import java.util.function.BiFunction;

// @FunctionalInterface interface Power      { int pow2(int x); }
// @FunctionalInterface interface Calculator { int calculate(int a, int b); }

public class StdLibInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> pow = x -> x * x;
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
            return a * b;
        };
        
        System.out.println(pow.apply(5));         // 25
        System.out.println(add.apply(5, 3));      // 8
        System.out.println(multiply.apply(5, 3)); // 15
    }
}

