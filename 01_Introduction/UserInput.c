#include <stdio.h>

int main (void) {
    int age;
    char name[50];

    printf("名前を入力: "); scanf("%s", name);
    printf("年齢を入力: "); scanf("%d", &age);
    printf("%s は %d 歳\n", name, age);

    return 0;
}

