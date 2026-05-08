public class Ex1Avg {
    static double sum (double... values) {
        double sum = 0;
        for (double v : values) { sum += v; }
        return sum;
    }
    
    static double mul(double... values) {
        double mul = 1;
        for (double v : values) { mul *= v; }
        return mul;
    }

    static double calc(String operator, double... values) {
        switch (operator) {
            case "+": return sum(values);
            case "*": return mul(values);
            default: throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        System.out.println(calc("+", 10.0, 20.0));    // 30.0
        System.out.println(calc("*", 1.0, 2.0, 3.0)); // 6.0
        System.out.println(calc("+"));                // 0.0
        System.out.println(calc("*"));                // 1.0
    }
}

