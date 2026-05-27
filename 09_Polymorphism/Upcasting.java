class Animal {
    void speak() { System.out.println("..."); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("ワン"); }
}

public class Upcasting {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak(); // "ワン" ← Dog.speak() が呼ばれる

        Animal a = new Dog();   // アップキャスト（暗黙）
        a.speak(); // "ワン" ← Dog.speak() が呼ばれる
    }
}

