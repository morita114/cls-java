class NumberBox<T extends Number> { // TをNumberかそのサブクラスに限定
    public T value;
    public NumberBox(T value) { this.value = value; }
    public double doubled() { return value.doubleValue() * 2; }
}

public class BoundedBox {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(42);
        System.out.println(intBox.doubled()); // 84.0

        NumberBox<Double> doubleBox = new NumberBox<>(3.14);
        System.out.println(doubleBox.doubled()); // 6.28

        // NumberBox<String> strBox = new NumberBox<>("hello"); // Compile error
    }
}

