abstract class Animal {
    String name;

    Animal(String name) {       // 抽象クラスでもコンストラクタは持てる
        this.name = name;
    }

    abstract void speak();

    void introduce() {
        System.out.print(name + "が鳴きます: ");
        speak();
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);            // 親のコンストラクタを呼び出す
    }

    @Override
    void speak() {
        System.out.println("ワン！");
    }
}

public class Const {
    public static void main(String[] args) {
        // Animal a = new Animal("動物");  // コンパイルエラー！抽象クラスはインスタンス化できない
        Dog d = new Dog("ポチ");
        d.introduce();  // ポチが鳴きます: ワン！
    }
}

