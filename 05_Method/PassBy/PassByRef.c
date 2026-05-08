#include <stdio.h>

void replaceRef(int *arr) {
    // 引数変数が別の配列を指すようにする
    int temp[] = {9, 9, 9};
    arr = temp;
}

void replaceValue(int *arr) {
    // 引数変数が指す配列の内容を書き換える
    arr[0] = 5;
}

int main(void) {
    int data[] = {1, 2, 3};

    replaceRef(&data[0]);    // 先頭ポインタを渡す
    printf("%d\n", data[0]); // 1 ← 元のまま

    replaceValue(&data[0]);  // 先頭ポインタを渡す
    printf("%d\n", data[0]); // 5 ← 値が変更される

    return 0;
}

