class Product {
    private String name;
    private int stock;
    private List<String> transactionLog;

    public Product(String name, int initialStock) {
        this.name = name;
        this.stock = initialStock;
        this.transactionLog = new ArrayList<>();
    }

    // 在庫減少：ログ記録を自動実行
    public void decreaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("数量は1以上です");
        }
        if (stock < quantity) {
            throw new InsufficientStockException("在庫不足");
        }
        stock -= quantity;
        transactionLog.add("売却: -" + quantity + " (残: " + stock + ")");
    }

    // 在庫増加：ログ記録を自動実行
    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("数量は1以上です");
        }
        stock += quantity;
        transactionLog.add("入庫: +" + quantity + " (残: " + stock + ")");
    }

    public int getStock() {
        return stock;
    }

    public List<String> getTransactionLog() {
        return new ArrayList<>(transactionLog);  // コピーを返す
    }
}

public class ObjProduct {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 50);

        // 注文が入ったのでこう書く
        laptop.decreaseStock(3);
        // ログもバリデーションも自動で行われる

        // ……別の箇所では
        laptop.decreaseStock(2);

    }
}