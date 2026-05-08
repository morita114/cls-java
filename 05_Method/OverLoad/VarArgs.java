public class VarArgs {
    static void print(int... nums)  { System.out.println("varargs"); }
    static void print(int x, int y) { System.out.println("fixed");   }

    public static void main(String[] args) {
        print(1);       // varargs
        print(1, 2);    // fixed
        print(1, 2, 3); // varargs
    }
}

