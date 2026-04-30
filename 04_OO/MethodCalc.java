class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    void showResult(int result) {
        System.out.println("結果は " + result + " です。");
    }
    String className() { return "Calculator"; }
}

public class MethodCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        calc.showResult(result); // 8
        System.out.println(calc.className());
    }
}
