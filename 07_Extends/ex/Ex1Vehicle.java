class Vehicle {
    protected final String name;
    protected final int speed;

    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(this.name + "が移動する");
    }

    void info() {
        System.out.print("名前: " + this.name);
        System.out.println("最高速度: " + this.speed + "km/h");
    }
}

class Car extends Vehicle {
    final String fuel;

    Car(String name, int speed, String fuel) {
        super(name, speed);
        this.fuel = fuel;
    }

    @Override
    void move() {
        System.out.println(this.name + "がエンジンをかけて走る");
    }

    @Override
    void info() {
        super.info();
        System.out.println("燃料: " + this.fuel);
    }
}

class Bicycle extends Vehicle {
    Bicycle(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(this.name + "を漕いで進む");
    }
}

public class Ex1Vehicle {
    public static void main(String[] args) {
        Car car = new Car("プリウス", 180, "ガソリン");
        Bicycle bicycle = new Bicycle("ロードバイク", 30);

        car.move();
        car.info();

        System.out.println("---");

        bicycle.move();
        bicycle.info();  // 親クラスの info() がそのまま呼ばれる
    }
}