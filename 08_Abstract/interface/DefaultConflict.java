interface A {
    default void hello() { System.out.println("Hello from A"); }
}

interface B {
    default void hello() { System.out.println("Hello from B"); }
}

// コンパイルエラー： どちらの hello() を継承するか不明
// class C implements A, B { }

class C implements A, B {
    @Override
    public void hello() {
        A.super.hello();                    // Aの実装を利用
        B.super.hello();                    // Bの実装を利用
        System.out.println("Hello from C"); // Cの独自実装
    }
}


public class DefaultConflict {
    public static void main(String[] args) {
        C c = new C();
        c.hello();  // Hello from A
    }
}

