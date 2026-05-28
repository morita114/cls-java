abstract class Shape {
    String color;
    Shape(String color) { this.color = color; }

    abstract double area();
    abstract void draw();
}

class Circle extends Shape {
    double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override double area() { return Math.PI * radius * radius; }
    @Override void   draw() { System.out.println("円を描画（半径: " + radius + "）"); }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override double area() { return width * height; }
    @Override void   draw() { System.out.println("長方形を描画（" + width + "×" + height + "）"); }
}

public class ExtendPoly {
    public static void main(String[] args) {
        // Shape型の配列に異なるサブクラスを格納
        Shape[] shapes = {
            new Circle("赤", 5.0),
            new Rectangle("青", 4.0, 6.0),
            new Circle("緑", 3.0)
        };

        for (Shape s : shapes) {
            s.draw();
            System.out.println("  面積: " + s.area());
        }
    }
}

