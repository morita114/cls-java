import java.util.function.Function;

class InClassCapture {
    private        int multiplier1 = 2; // インスタンス変数
    private static int multiplier2 = 3; // クラス変数

    public void inClassCaptureTest() {
        // multiplier1をキャプチャするラムダ式
        Function<Integer, Integer> multiply1 = x -> x * this.multiplier1;
        this.multiplier1 = 5; // インスタンス変数は変更可能
        System.out.println(multiply1.apply(5));  // 25

        // multiplier2をキャプチャするラムダ式
        Function<Integer, Integer> multiply2 = x -> x * InClassCapture.multiplier2;
        InClassCapture.multiplier2 = 5; // クラス変数は変更可能
        System.out.println(multiply2.apply(5));  // 25
    }
}

public class Capture {
    public static void main(String[] args) {
        int multiplier = 2; // 事実上の最終変数
        // multiplier = 3;  // コンパイルエラー：変更するとキャプチャできない
    
        // multiplierをキャプチャするラムダ式
        Function<Integer, Integer> multiply = x -> x * multiplier;
        System.out.println(multiply.apply(5));  // 10
        
        // multiplier = 3; // コンパイルエラー：変更するとキャプチャできない

        (new InClassCapture()).inClassCaptureTest();
    }   
}

