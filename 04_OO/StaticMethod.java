class MyMath {
    static double staticSqrt(double x) { return Math.sqrt(x); }
           double sqrt(double x) { return Math.sqrt(x); }
}

class StaticMethod {
    public static void main(String[] args) {
        double result1 = MyMath.staticSqrt(2.0);
        System.out.println("sqrt(2) = " + result1);

        MyMath math = new MyMath();
        double result2 = math.sqrt(2.0);
        System.out.println("sqrt(2) = " + result2);
    }
}

