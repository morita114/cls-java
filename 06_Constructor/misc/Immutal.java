class Point {
    private final double x, y;

    Point(double x, double y) { this.x = x;  this.y = y; }

    Point move(double dx, double dy) { return new Point(this.x + dx, this.y + dy); }
    void print() { System.out.println("(" + this.x + ", " + this.y + ")"); }
}

public class Immutal {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = p1.move(3.0, 4.0);
        p1.print(); // (1.0, 2.0), p1は変更されない
        p2.print(); // (4.0, 6.0)
    }
}

