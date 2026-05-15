class Animal {  // 親クラス
    String name;  int age;
    Animal(String name, int age) { this.name = name; this.age = age; }
    void eat() { System.out.println(name + "が食べる"); }
}

class Dog extends Animal { // 子クラス
    Dog(String name, int age) { super(name, age); } // 親クラスのコンストラクタ呼び出し
    void wan() { System.out.println("ワン"); }
}

public class Constructor {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 3); dog.eat(); dog.wan();
    }
}

