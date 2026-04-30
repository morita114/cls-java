class Product {
    private String name;
    private int stock;

    public Product(String name, int initialStock) {
        this.name = name;
        this.stock = initialStock;
    }

    private boolean isCorrectQuantity(int quantity) {
        return quantity > 0;
    }
    // 在庫減少：ログ記録を自動実行
    public void decreaseStock(int quantity) throws IllegalArgumentException {
        if (!isCorrectQuantity(quantity)) {
            throw new IllegalArgumentException("数量は1以上です");
        }

        stock -= quantity;
        logInventoryChange(-quantity);
    }

    private void logInventoryChange(int change) {
        System.out.println("[LOG] " + this.name + ": " + change);
    }
}

public class ObjProduct {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 50);

        laptop.decreaseStock(3);    // 自動で検査、ログ記録
        laptop.decreaseStock(2);    // 他に書き方がない
    }
}

