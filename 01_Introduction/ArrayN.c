#include <stdio.h>

int main(int argc, char const *argv[])
{
    int matrix1[3][4] = {0}; // 宣言+ゼロ埋め
    int matrix2[3][4] = {    // 宣言+初期化
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9,10,11,12}
    };

    const int rows = 3;      // 行数は自分で管理
    const int cols = 4;      // 列数は自分で管理

    matrix2[1][2] = 99;
    
    return 0;
}

