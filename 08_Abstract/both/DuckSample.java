abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }
    abstract void breathe();
}

interface Flyable {
    default void fly() { System.out.println("飛ぶ"); }
}

interface Swimable {
    default void swim() { System.out.println("泳ぐ"); }
}

class Duck extends Animal implements Flyable, Swimable {
    Duck(String name) { super(name); }

    @Override
    void breathe() {
        System.out.println(name + "が呼吸する");
    }
    // fly() と swim() は default 実装をそのまま使用
}

public class DuckSample {
    public static void main(String[] args) {
        Duck d = new Duck("アヒル");
        d.breathe();          // アヒルが呼吸する
        d.fly();              // 飛ぶ
        d.swim();             // 泳ぐ

        Animal a = d;
        a.breathe();         // アヒルが呼吸する

        Flyable f = d;
        f.fly();             // 飛ぶ

        Swimable s = d;
        s.swim();            // 泳ぐ
    }
}


