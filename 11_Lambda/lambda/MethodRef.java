import java.util.function.*;

public class MethodRef {
    public static int square(int x) { return x * x; }
    public static int doubleIt(int x) { return x * 2; }

    public static int procX(int x, Function<Integer, Integer> func) {
        return func.apply(x);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> process =
            Math.random() < 0.5 ?       // 乱数でメソッドを切り替える
            MethodRef::square :   // trueの場合
            MethodRef::doubleIt;  // falseの場合

        System.out.println(process.apply(5));  // 後から実行
        System.out.println(procX(5, process)); // 引数として渡す
    }
}

