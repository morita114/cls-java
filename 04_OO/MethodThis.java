class Rectangle {
    int width, height;

    void setSize(int width, int height) {
        this.width = width;   // this.width はフィールド、width は引数
        this.height = height;
    }

    int area() { return this.width * this.height; }
    void print() {
        System.out.println("幅 " + this.width + "x 高さ " + this.height + " で、面積は" + this.area() + " です。");
    }
}

public class MethodThis {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setSize(4, 5);
        System.out.println("面積は " + rect.area() + " です。");
    }
}

