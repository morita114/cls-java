class Box<T> {
    public T value;
    public Box(T value) { this.value = value; }
}

public class WildPrintBox {
    // ワイルドカード
    public static     void printBoxW(Box<?> box) { System.out.println("Box contains: " + box.value); }
    // 型パラメータ
    public static <T> void printBoxT(Box<T> box) { System.out.println("Box contains: " + box.value); }

    public static void main(String[] args) {
        Box<String> strBox = new Box<>("hello");
        printBoxW(strBox); // Box contains: hello
        printBoxT(strBox); // Box contains: hello

        Box<Integer> intBox = new Box<>(42);
        printBoxW(intBox); // Box contains: 42
        printBoxT(intBox); // Box contains: 42
    }
}

