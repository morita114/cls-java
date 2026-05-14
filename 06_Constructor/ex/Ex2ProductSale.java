class Product {
    private final String name;
    private int price;
    private int stock;
    private boolean isSale;

    Product(String name, int price, int stock, boolean isSale) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.isSale = isSale;
    }
    Product(String name, int price, int stock) {
        this(name, price, stock, false);
    }

    void printInfo() {
        final String sale = isSale ? "[特売] " : "[通常] ";
        System.out.println(sale + this.name + " 価格:" + this.price + "円 在庫:" + this.stock + "個");
    }
}

public class Ex2ProductSale {
    public static void main(String[] args) {
        Product apple = new Product("りんご", 68, 50, true);
        Product banana = new Product("バナナ", 200, 100);
        apple.printInfo();
        banana.printInfo();
    }
}

