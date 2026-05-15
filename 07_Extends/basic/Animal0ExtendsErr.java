class Animal {  // 親クラス（Cat, Dogの共通部分）
    String name;  int age;
    void eat() { System.out.println(name + "が食べる"); }
}

class Dog extends Animal { // 子クラス1
    void wan() { System.out.println("ワン"); }
}
class Cat extends Animal { // 子クラス2
    void nya() { System.out.println("ニャー"); }
}

public class Animal0Extends {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 3); dog.eat(); dog.wan();
        Cat cat = new Cat("タマ", 2); cat.eat(); cat.nya();
    }
}


// !! コンストラクタないからコンパイル不可
