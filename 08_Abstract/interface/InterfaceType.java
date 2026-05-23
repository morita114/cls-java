interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

public class Main {
    public static void main(String[] args) {
        Drawable d = new Circle(3.0);   // インタフェース型で受け取れる
        d.draw();
        // d.resize(2.0);  // コンパイルエラー：Drawable 型には resize() がない

        Resizable r = new Circle(3.0);
        r.resize(2.0);
    }
}

