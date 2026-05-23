interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

// 1つのクラスが複数のインタフェースを実装できる（多重実装）
class Circle implements Drawable, Resizable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("円を描く（半径: " + radius + "）");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("円をリサイズ（新半径: " + radius + "）");
    }
}



public class Implement {
    public static void main(String[] args) {
        Drawable d = new Circle(3.0);   // インタフェース型で受け取れる
        d.draw();
        // d.resize(2.0);  // コンパイルエラー：Drawable 型には resize() がない

        Resizable r = new Circle(3.0);
        r.resize(2.0);
    }
}

