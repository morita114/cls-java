class Animal {}
class Dog extends Animal {
    void wan() { System.out.println("ワン"); }
}
class Cat extends Animal {
    void nya() { System.out.println("ニャー"); }
}

public class InstanceOf {
    public static void main(String[] args) {
        Animal ad = new Dog();

        // IF文で型チェック（従来の方法）
        if      (ad instanceof Dog) { Dog d = (Dog) ad;  d.wan(); }  // ワン
        else if (ad instanceof Cat) { Cat c = (Cat) ad;  c.nya(); }  // 実行されない

        // IF文で型チェック（パターンマッチング）
        if      (ad instanceof Dog d) { d.wan(); }  // ワン
        else if (ad instanceof Cat c) { c.nya(); }  // 実行されない
    }
}

