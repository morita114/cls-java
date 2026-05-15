class Animal {  // 親クラス
    String name;  int age;
    Animal() {
        System.out.println("Animal() called.");
        this.name = "ポチ"; this.age = 3;
    }
    void eat() { System.out.println(name + "が食べる"); }
}

class Dog extends Animal { // 子クラス
    Dog() {
        // super(); // 明示的に呼び出す場合
        System.out.println("Dog() called.");
    }
    void wan() { System.out.println("ワン"); }
}

public class SuperDefConst {
    public static void main(String[] args) {
        Dog dog = new Dog(); dog.eat(); dog.wan();
    }
}

