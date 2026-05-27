interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

// 複数インタフェースの実装
class Circle implements Drawable, Resizable {
    double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("円を描画（半径: " + radius + "）");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("円をリサイズ → 半径: " + radius);
    }
}

class Square implements Drawable, Resizable {
    double side;

    Square(double side) { this.side = side; }

    @Override
    public void draw() {
        System.out.println("正方形を描画（辺: " + side + "）");
    }

    @Override
    public void resize(double factor) {
        side *= factor;
        System.out.println("正方形をリサイズ → 辺: " + side);
    }
}


public class InterfacePoly {
    public static void main(String[] args) {
        // Drawable 型として一括管理
        Drawable[] drawables = { new Circle(5.0), new Square(4.0) };
        for (Drawable d : drawables) {
            d.draw();
        }

        // Resizable 型として一括管理（同じオブジェクトでも別の側面で扱える）
        Resizable[] resizables = { new Circle(5.0), new Square(4.0) };
        for (Resizable r : resizables) {
            r.resize(2.0);
        }
    }
}


