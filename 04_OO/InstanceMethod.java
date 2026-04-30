class MyPow {
    static double a = 2.0;  // クラスフィールド
           double b = 2.0;  // インスタンスフィールド
    
    static double power1a(double x) { return Math.pow(x, MyPow.a); }
    // static double power1b(double x) { return Math.pow(x, MyPow.b); }    // Compile error
           double power2a1(double x) { return Math.pow(x, this.a); }
           double power2a2(double x) { return Math.pow(x, MyPow.a); }
           double power2b(double x) { return Math.pow(x, this.b); }
}

class StaticMethod {
    public static void main(String[] args) {
        double p1a = MyPow.power1a(3.0);
        // double p1b = MyPow.power1b(3.0);
        double p2a1 = new MyPow().power2a1(3.0);
        double p2a2 = new MyPow().power2a2(3.0);
        double p2b = new MyPow().power2b(3.0);

        System.out.println("3^2 = " + p1a + ", " + p2a1 + ", " + p2a2 + ", " + p2b);
    }
}

