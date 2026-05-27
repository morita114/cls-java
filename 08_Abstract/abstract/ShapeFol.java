abstract class Shape {
    abstract double area();      // 抽象メソッド
    abstract double perimeter() { return 1.0; }; // 抽象メソッド

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
    // @Override double perimeter() { return 2 * Math.PI * radius; }
}

public class ShapeFol {
    public static void main(String[] args) {
        Shape c = new Circle(5.0);

        c.printInfo();
    }
}

