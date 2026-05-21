class Animal {
    private void speak() { System.out.println("..."); }
}
class Dog extends Animal {
    @Override
    void speak() { System.out.println("ワン"); }    // Dogに特化した実装
}

public class AnimalPrivate {
    public static void main(String[] args) {
        (new Dog()).speak(); // ワン
    }
}

