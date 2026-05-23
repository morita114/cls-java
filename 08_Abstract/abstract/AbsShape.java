abstract class Shape {
    abstract double area();      // 抽象メソッド
    abstract double perimeter(); // 抽象メソッド

    // 通常のメソッド
    void printInfo() {
        System.out.println("面積: " + area());
        System.out.println("周囲: " + perimeter());
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    @Override double area() { return Math.PI * radius * radius; }
    @Override double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override double area() { return width * height; }
    @Override double perimeter() { return 2 * (width + height); }
}

public class AbsShape {
    public static void main(String[] args) {
        // Shape s = new Shape();  // コンパイルエラー
        Shape c = new Circle(5.0);
        Shape r = new Rectangle(3.0, 4.0);

        c.printInfo();
        r.printInfo();
    }
}

