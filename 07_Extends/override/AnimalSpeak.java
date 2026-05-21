class Animal {
    void speak() { System.out.println("..."); }
}
class Dog extends Animal {
    @Override
    void speak() { System.out.println("ワン"); }    // Dogに特化した実装
}
class Cat extends Animal {
    @Override
    void speak() { System.out.println("ニャー"); }  // Catに特化した実装
}

public class AnimalSpeak {
    public static void main(String[] args) {
        (new Dog()).speak(); // ワン
        (new Cat()).speak(); // ニャー
    }
}

