#include <stdio.h>

typedef struct {
    char name[50];
    int credits;  // 取得単位数
} Student;

void addCredits(Student *s, int amount) {   // 単位の加算
    s->credits += amount;
}

void resetCredits(Student *s) {     // 単位をリセット
    s->credits = 0;
}

int main (void) {
    Student alice = {"Alice", 30};

    addCredits(&alice, 10); // OK
    alice.credits = -5;     // 不正な値の直接代入
    alice.credits = 999;    // 不正な値の直接代入
    resetCredits(&alice);   // 2単位引くのではなく、一旦リセット
    alice.credits = 8;      // 　してから合計単位を直接代入

    return 0;
}

