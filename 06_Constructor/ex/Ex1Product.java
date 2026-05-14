class Product {
    private final String name;
    private int price;
    private int stock;

    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    void printInfo() {
        System.out.println(this.name + " 価格:" + this.price + "円 在庫:" + this.stock + "個");
    }
}

public class Ex1Product {
    public static void main(String[] args) {
        Product apple = new Product("りんご", 98, 50);
        Product banana = new Product("バナナ", 200, 100);
        apple.printInfo();
        banana.printInfo();
    }
}

