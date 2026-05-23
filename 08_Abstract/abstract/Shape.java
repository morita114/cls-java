abstract class Shape {
    abstract double area();      // 抽象メソッド：サブクラスで必ず実装
    abstract double perimeter(); // 抽象メソッド：サブクラスで必ず実装

    // 通常のメソッド
    void printInfo() {
        System.out.println("面積: " + area());
        System.out.println("周囲: " + perimeter());
    }
}

