#include <stdio.h>

int main(void) {
    int a = 10;
    int b = 0;

    // ゼロ除算によるエラーが発生
    printf("%d / %d = %d\n", a, b, a / b);

    // ゼロ除算を避けるために、bがゼロでないかを確認する
    if (b != 0) {
        printf("%d / %d = %d\n", a, b, a / b);
    } else {
        printf("Error: Division by zero is not allowed.\n");
    }

    return 0;
}

