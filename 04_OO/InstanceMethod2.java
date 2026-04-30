class MyPow {
    static double pow2(double x) { return Math.pow(x, 2.0); }
    static double power2a(double x) { return MyPow.pow2(x); }
           double power2b(double x) { return MyPow.pow2(x); }
           double power2c(double x) { return this.pow2(x); }
    
           double pow3(double x) { return Math.pow(x, 3.0); }
    // static double power3a(double x) { return MyPow.pow3(x); }   // Compile error
        //    double power3b(double x) { return MyPow.pow3(x); }   // Compile error
           double power3c(double x) { return this.pow3(x); }
}

class InstanceMethod2 {
    public static void main(String[] args) {
        double p2a = MyPow.power2a(3.0);
        // double p2b = MyPow.power2b(3.0);        // Compile error
        double p2b = new MyPow().power2b(3.0);
        double p2c = new MyPow().power2c(3.0);

        double p3c = new MyPow().power3c(3.0);

        System.out.println("3^2 = " + p2a + ", " + p2b + ", " + p2c);
        System.out.println("3^3 = " + p3c);
    }
}

