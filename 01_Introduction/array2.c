#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int n = 5;
    int *arr = malloc(n * sizeof(int));

    arr[0] = 100;   printf("%d\n", arr[0]);    // 色々やる

    free(arr);       // メモリの解放を忘れるとメモリリーク
}

