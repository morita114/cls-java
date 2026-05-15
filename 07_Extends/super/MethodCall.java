class Animal {  // 親クラス
    String name;  int age;
    Animal(String name, int age) { this.name = name; this.age = age; }
    void eat() { System.out.print(name + "が食べる"); }
}

class Dog extends Animal { // 子クラス
    Dog(String name, int age) { super(name, age); }
    void wan() { System.out.println("ワン"); }
    void eatWan() {
        super.eat(); // 親クラスのeat()を呼び出す
        this.wan();  // 子クラスのwan()を呼び出す
    }
}

public class MethodCall {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 3); dog.eatWan(); // ポチが食べるワン
    }
}

