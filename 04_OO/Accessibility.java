class Test {
    private int x = 2;
            int y = 1;
    public  int z = 3;

    private static int a = 4;
            static int b = 5;
    public  static int c = 6;
}

public class Accessibility {
    public static void main(String[] args) {
        Test test = new Test();

        // System.out.println(test.x); // エラー：private
        System.out.println(test.y);   // OK：default
        System.out.println(test.z);   // OK：public

        // System.out.println(Test.a); // エラー：private
        System.out.println(Test.b);   // OK：default
        System.out.println(Test.c);   // OK：public
    }
}

