// データ
typedef struct {
    char name[50];
    int studentID;
    int credits;  // 取得単位数
} Student;

// 操作1：単位を加算
void addCredits(Student *s, int amount) { 
    s->credits += amount;
}

// 操作2：単位を減算
void subtractCredits(Student *s, int amount) {
    s->credits -= amount;
}

// 操作3：単位をリセット
void resetCredits(Student *s) {
    s->credits = 0;
}


int main (void) {
    Student alice = {"Alice", 12345, 30};

    addCredits(&alice, 10); // OK
    alice.credits = -5;     // 不正な値の直接代入
    alice.credits = 999;    // 不正な値の直接代入
    resetCredits(&alice);   // 2単位引くのではなく、一旦リセット
    alice.credits = 8;      // 　してから合計単位を直接代入

    return 0;
}