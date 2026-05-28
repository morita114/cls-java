abstract class Animal {
    abstract void speak();
}
class Dog extends Animal { void speak() { System.out.println("ワン");   } }
class Cat extends Animal { void speak() { System.out.println("にゃー"); } }

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal a;   // コンパイル時はスーパークラスの型で定義されているメソッドのみを確認

        for (int i = 0; i < 5; i++) {
            a = Math.random() > 0.5 ? new Dog() : new Cat();
            a.speak(); // 実行時に Dog か Cat の speak() が呼ばれる
        }
    }
}

