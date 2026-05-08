public class TypeMethods {
    static int    absInt(int x)       { return x < 0 ? -x : x; }
    static double absDouble(double x) { return x < 0 ? -x : x; }

    static double vecLength2d(double x, double y)           { return Math.sqrt(x * x + y * y); }
    static double vecLength3d(double x, double y, double z) { return Math.sqrt(x * x + y * y + z * z); }

    public static void main(String[] args) {
        System.out.println(absInt(-5));
        System.out.println(absDouble(-3.14));

        System.out.println(vecLength2d(3.0, 4.0));
        System.out.println(vecLength3d(1.0, 2.0, 3.0));
    }
}

