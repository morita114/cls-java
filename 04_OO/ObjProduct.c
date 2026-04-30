#include <stdio.h>

typedef struct {
    char name[100];
    int stock;
} Product;

int isCorrectQuantity(int quantity) {
    return quantity >= 0;
}
void decreaseStock(Product *p, int quantity) {
    if (isCorrectQuantity(quantity) == 1) { p->stock -= quantity; }
}

void setStock(Product *p, int newStock) {
    if (isCorrectQuantity(newStock) == 1) { p->stock = newStock; }
}

// ログ記録関数
void logInventoryChange(const Product *p, int change) {
    printf("[LOG] %s: %d\n", p->name, change);
}

int main (void) {
    Product laptop = {"Laptop", 50};

    decreaseStock(&laptop, 3);          // 期待通りの動き
    logInventoryChange(&laptop, -3);    // ログも記録

    decreaseStock(&laptop, 2);  // ログ忘れ

    laptop.stock = 48;  // 直接操作：ログ・値の検査なし

    logInventoryChange(&laptop, -999);  // ログだけ変な値が入る
}

