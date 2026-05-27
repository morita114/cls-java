class Animal {
              void speak() { System.out.println("..."); }
}
class Dog extends Animal {
              void wan() { System.out.println("ワン"); }
    @Override void speak() { this.wan(); }
}
class Cat extends Animal {
              void nya() { System.out.println("ニャー"); }
    @Override void speak() { this.nya(); }
}

public class InstanceOf {
    public static void main(String[] args) {
        // あえてダウンキャストして、wan/nya を呼び出す
        Animal ad = new Dog();
        if      (ad instanceof Dog) { Dog d = (Dog) ad;  d.wan(); }  // ワン
        else if (ad instanceof Cat) { Cat c = (Cat) ad;  c.nya(); }  // 実行されない

        Animal ac = new Cat();
        if      (ac instanceof Dog) { Dog d = (Dog) ac;  d.wan(); }  // 実行されない
        else if (ac instanceof Cat) { Cat c = (Cat) ac;  c.nya(); }  // ニャー
    }
}

