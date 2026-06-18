@FunctionalInterface
interface Hello {      void sayHello(); }

@FunctionalInterface
interface Power {      int pow2(int x); }

@FunctionalInterface
interface Calculator { int calculate(int a, int b); }

public class FuncInterface {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello, World!");
        Power pow = x -> x * x;           // 引数1個
        Calculator add = (a, b) -> a + b; // 1行で書く場合
        Calculator multiply = (a, b) -> { // 複数行の場合
            return a * b;
        };
        
        hello.sayHello();
        System.out.println(pow.pow2(5));              // 25
        System.out.println(add.calculate(5, 3));      // 8
        System.out.println(multiply.calculate(5, 3)); // 15
    }
}

