#include<stdio.h>

typedef enum {
    MONDAY = 0,
    TUESDAY = 1,
    WEDNESDAY = 2,
    THURSDAY = 3,
    FRIDAY = 4,
    SATURDAY = 5,
    SUNDAY = 6
} Day;


int main() {
    Day d = MONDAY;
    printf("%d\n", d);          // 0（整数値）

    d = 999;                    // エラーにならない
    printf("%d\n", d);          // 999（整数値）
    d = TUESDAY + WEDNESDAY;    // エラーにならない
    printf("%d\n", d);          // 1+2=3（整数値）
    
    return 0;
}

