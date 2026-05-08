public class Ex2Repeat {
    static String repeat(String s, int n) {
        String result = "";
        for (int i = 0; i < n; i++) { result += s; }
        return result;
    }

    static String repeat(String s) {
        return repeat(s, 3);
    }

    static String repeat(char c, int n) {
        return repeat(String.valueOf(c), n);
    }

    public static void main(String[] args) {
        System.out.println(repeat("x", 2)); // xx
        System.out.println(repeat("y"));    // yyy
        System.out.println(repeat('z', 5)); // zzzzz
    }
}

