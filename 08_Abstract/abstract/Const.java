abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }

    abstract void speak();
    void introduce() {
        System.out.print(name + "が鳴きます: ");
        speak();
    }
}

class Dog extends Animal {
    // 親のコンストラクタを呼び出す
    Dog(String name) { super(name); }
    @Override void speak() {
        System.out.println("ワン！");
        }
}

public class Const {
    public static void main(String[] args) {
        Dog d = new Dog("ポチ");
        d.introduce();  // ポチが鳴きます: ワン！
    }
}

