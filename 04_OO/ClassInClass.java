class C1 {
    class C2 {
        private int y = 1;

        void print() {
            System.out.println("C2 has y = " + y);
        }
    }

    private int x = 2;
    C2 c2 = new C2();

    void print() {
        System.out.println("C1 has x = " + x + ", and");
        c2.print();
    }
}

public class ClassInClass {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.print();

        C1.C2 c2 = c1.new C2();
        c2.print();
    }
}

