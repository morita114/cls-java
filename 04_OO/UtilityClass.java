class MathUtil {
    static double pow2(double x) { return Math.pow(x, 2.0); }
    static double pow3(double x) { return Math.pow(x, 3.0); }
    static double cos(double x) { return Math.cos(x); }
}

public class UtilityClass {
    public static void main(String[] args) {
        System.out.println("3^2 = " + MathUtil.pow2(3.0));
        System.out.println("3^3 = " + MathUtil.pow3(3.0));
        System.out.println("cos(3.0) = " + MathUtil.cos(3.0));
    }
}

