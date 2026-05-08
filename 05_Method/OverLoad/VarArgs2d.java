public class VarArgs2 {
    static void print(int... nums)        { System.out.println("int..."); }
    // static void print(int x, int y)       { System.out.println("x, y");   }
    static void print(double x, int... nums) { System.out.println("x, int...");   }

    public static void main(String[] args) {
        print(1);       // reference to print is ambiguous
        print(1, 2);    // reference to print is ambiguous, print(int, x, int y)を実装すれば回避可能
        print(1, 2, 3); // reference to print is ambiguous
    }
}

