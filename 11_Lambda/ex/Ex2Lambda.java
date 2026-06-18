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
            new Product("りんご", 150, "食品"),
            new Product("ノート", 200, "文具"),
            new Product("バナナ", 120, "食品"),
            new Product("ペン",   100, "文具"),
            new Product("みかん",  80, "食品")
        );

        // 価格昇順
        products.sort((a, b) -> a.price - b.price);
        System.out.println("--- 価格昇順 ---");
        products.forEach(System.out::println);

        // 価格降順
        products.sort((a, b) -> b.price - a.price);
        System.out.println("\n--- 価格降順 ---");
        products.forEach(System.out::println);

        // カテゴリ昇順・同一カテゴリ内は価格昇順
        products.sort((a, b) -> {
            if (!a.category.equals(b.category)) {
                return a.category.compareTo(b.category);
            }
            return a.price - b.price;
        });
        System.out.println("\n--- カテゴリ昇順・同一カテゴリ内は価格昇順 ---");
        products.forEach(System.out::println);
    }
}

