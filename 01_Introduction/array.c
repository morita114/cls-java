#include <stdio.h>

int main(void) {
    // C言語
    int arr1[5];                    // 宣言（初期化なし）
    int arr2[5] = {1, 2, 3, 4, 5};  // 宣言＋初期化

    printf("%d\n", arr1[0]);    // 0（初期値）
    printf("%d\n", arr2[0]);    // 1（初期化した値）

    // 配列の長さ
    printf("%ld\n", sizeof(arr1) / sizeof(arr1[0]));    // 5
    printf("%ld\n", sizeof(arr2) / sizeof(arr2[0]));    // 5

    // 配列の要素の変更
    arr1[0] = 10;    printf("%d\n", arr1[0]);    // 10
    arr2[0] = 20;    printf("%d\n", arr2[0]);    // 20
}

