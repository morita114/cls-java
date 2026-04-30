typedef struct {
    char name[100];
    int stock;
} Product;

int isCorrectQuantity(int quantity) {
    return quantity >= 0;
}
void decreaseStock(Product *p, int quantity) {
    isCorrectQuantity(quantity) && p->stock -= quantity;
}

void increaseStock(Product *p, int quantity) {
    isCorrectQuantity(quantity) && p->stock += quantity;
}

void setStock(Product *p, int newStock) {
    isCorrectQuantity(newStock) && p->stock = newStock;
}

// ログ記録関数
void logInventoryChange(const Product *p, int change) {
    printf("[LOG] %s: %d\n", p->name, change);
}

int main (void) {
    Product laptop = {"Laptop", 50};

    // 注文が入ったのでこう書く
    decreaseStock(&laptop, 3);
    logInventoryChange(&laptop, -3);

    // ……別の箇所では
    decreaseStock(&laptop, 2);
    // ログ記録を忘れた！

    // さらに別の箇所では
    laptop.stock = 48;  // 直接操作してしまった
    // ログもバリデーションも無い

    // Logのchangeにてきとうな値を入れてしまった
    logInventoryChange(&laptop, -999);  // こんなに減るわけない
}