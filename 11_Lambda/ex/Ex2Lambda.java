import java.util.*;

class Product {
    String name;
    int price;
    String category;

    Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + "（" + category + "）: " + price + "円";
    }
}

public class Ex2Lambda {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("apple",  150, "food"),
            new Product("note",   200, "stationery"),
            new Product("banana", 120, "food"),
            new Product("pen",    100, "stationery"),
            new Product("orange",  80, "food")
        );

        // 価格昇順
        products.sort((a, b) -> a.price - b.price);
        System.out.println("1. 価格昇順");
        products.forEach(System.out::println);

        // 価格降順
        products.sort((a, b) -> b.price - a.price);
        System.out.println("\n2. 価格降順");
        products.forEach(System.out::println);

        // カテゴリ昇順・同一カテゴリ内は価格昇順
        products.sort((a, b) -> {
            if (!a.category.equals(b.category)) {
                return a.category.compareTo(b.category);
            }
            return a.price - b.price;
        });
        System.out.println("\n3. カテゴリ辞書順");
        products.forEach(System.out::println);
    }
}

