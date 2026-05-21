class Animal {
    public    String name   = "animal"; // どこからでもアクセス可
    protected int    age    = 3;        // 同パッケージ＋子クラスからアクセス可
    private   double weight = 5.0;      // Animalクラス内からのみアクセス可
}

class Dog extends Animal {
    void showInfo() {
        System.out.println(name);    // OK（public）
        System.out.println(age);     // OK（protected）
        // System.out.println(weight); // コンパイルエラー（private）
    }
}

public class Accessibility {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name); // OK（public）
        // System.out.println(dog.age);  // コンパイルエラー（protected）
        // System.out.println(dog.weight); // コンパイルエラー（private）
    }
}

