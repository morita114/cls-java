class Box<T> {
    public T value;
    public Box(T value) { this.value = value; }
}

public class GenericBox {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>("hello");
        System.out.println(strBox.value); // hello

        Box<Integer> intBox = new Box<>(42);
        System.out.println(intBox.value); // 42
    }
}

