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
        d.speak(); // ワン ← Dog.speak() が呼ばれる

        Animal a1 = (Animal) d;         // 明示
        Animal a4 = (Animal) new Dog(); // 明示
        Animal a2 = d;                  // 暗黙
        Animal a3 = new Dog();          // 暗黙
        // a*.speak(); // ワン：いずれも Dog.speak()
    }
}

