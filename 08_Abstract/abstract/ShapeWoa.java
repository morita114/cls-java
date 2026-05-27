abstract class Shape {  // 抽象メソッドなしの抽象クラス
    // 通常のメソッド
    void printInfo() { System.out.println("Shape class."); }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
}

public class ShapeWoa {
    public static void main(String[] args) {
        // Shape c = new Shape();   // コンパイルエラー: インスタンス化不可
        Shape c = new Circle(5.0);
        c.printInfo();
    }
}

