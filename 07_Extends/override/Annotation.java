class Animal {
    private void speak() { System.out.println("..."); }
}
class Dog0 extends Animal {
    void spek() { System.out.println("ワン！"); }
}
class Dog1 extends Animal {
    @Override
    void spek() { System.out.println("ワン！"); } // コンパイル不可
}

public class Annotation {
    public static void main(String[] args) {
        (new Dog0()).speak(); // ...
        (new Dog1()).speak(); // コンパイル不可
    }
}


