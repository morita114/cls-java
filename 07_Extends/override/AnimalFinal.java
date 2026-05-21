class Animal {
    final void speak() { System.out.println("..."); }
}
class Dog extends Animal {
    @Override
    void speak() { System.out.println("ワン"); }    // Dogに特化した実装
}

public class AnimalFinal {
    public static void main(String[] args) {
        (new Dog()).speak(); // ワン
    }
}

