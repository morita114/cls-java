class Animal {
    Animal(String name) { System.out.println("Animal called: " + name); }
    void speak() { System.out.println("Animal speaks"); }
    void eat() { System.out.println("Animal eats"); }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);  // Animal のコンストラクタを呼ぶ
        System.out.println("Dog called: " + name);
    }
    @Override
    void eat() { System.out.println("Dog eats"); }
}

class Inu extends Dog {
    Inu(String name) {
        super(name);  // Inu のコンストラクタを呼ぶ（Animalは直接呼べない）
        System.out.println("Inu called: " + name);
    }
}

public class Multiple {
    public static void main(String[] args) {
        Inu inu = new Inu("norainu");
        inu.speak();  // Animal クラスのメソッドも呼び出せる
        inu.eat();    // Dog クラスでオーバーライドされた eat() が呼び出される
    }
}

