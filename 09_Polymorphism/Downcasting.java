class Animal {
              void speak() { System.out.println("..."); }
}
class Dog extends Animal {
    @Override void speak() { System.out.println("ワン"); }
}
class Cat extends Animal {
    @Override void speak() { System.out.println("ニャー"); }
}




public class Downcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog) a;       // Animal → Dog へのダウンキャスト
        d.speak();             // ワン

        Animal a2 = new Cat(); // Animal → Cat へのアップキャスト
        // Dog d2 = (Dog) a2;     // Animal → Dog へのダウンキャスト(エラー)
    }
}

