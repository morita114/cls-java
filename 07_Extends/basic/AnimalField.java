class Animal {
    String name = "動物";
}
class Dog0 extends Animal {
    void show() { System.out.println(this.name + ", " + super.name); }
}
class Dog1 extends Animal {
    String name = "犬";  // 親と同名のフィールドを定義
    void show() { System.out.println(this.name + ", " + super.name); }
}

public class AnimalField {
    public static void main(String[] args) {
        (new Dog0()).show(); // 動物, 動物
        (new Dog1()).show(); // 犬, 動物
    }
}


