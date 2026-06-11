interface Printable { void print(); }
interface Drawable { void draw(); }

class Circle implements Printable, Drawable {
    public double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override public void print() { System.out.println("Circle(r=" + radius + ")"); }
    @Override public void draw() { System.out.println("Drawing Circle"); }
}
class Rectangle implements Drawable {
    @Override public void draw() { System.out.println("Drawing Rectangle"); }
}

public class MultiBound {
    public static <T extends Printable & Drawable> void process(T item) {
        System.out.println("Processing: " + item); item.print(); item.draw();
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        process(circle); // Processing: Circle(r=5.0), Circle(r=5.0), Drawing Circle

        Rectangle rect = new Rectangle();
        // process(rect);   // Printableを実装していないためコンパイルエラー
    }
}

