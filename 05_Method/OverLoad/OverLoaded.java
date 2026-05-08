public class OverLoaded {
    static int    abs(int x)    { return x < 0 ? -x : x; }
    static double abs(double x) { return x < 0 ? -x : x; }

    static double vecLength(double x, double y)           { return Math.sqrt(x * x + y * y); }
    static double vecLength(double x, double y, double z) { return Math.sqrt(x * x + y * y + z * z); }

    public static void main(String[] args) {
        System.out.println(abs(-5));
        System.out.println(abs(-3.14));

        System.out.println(vecLength(3.0, 4.0));
        System.out.println(vecLength(1.0, 2.0, 3.0));
    }
}

