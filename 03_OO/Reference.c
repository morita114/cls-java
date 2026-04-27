#include <stdio.h>
#include <string.h>

typedef struct {
    char name[50];
    int age;
} Person;

void greet(Person p) {
    printf("私は%sです。%d歳です。\n", p.name, p.age);
}

int main (void) {
    Person bob = {"Bob", 19};
    Person alice = {"Alice", 20};

    Person tom1 = bob;
    strcpy(tom1.name, "Tom");
    tom1.age = 21;

    greet(bob);     // 私はBobです。19歳です。
    greet(alice);   // 私はAliceです。20歳です。
    greet(tom1);     // 私はTomです。21歳です。

    Person *tom2 = &bob;
    strcpy(tom2->name, "Tom");
    tom2->age = 21;

    greet(bob);     // 私はTomです。21歳です。
    greet(alice);   // 私はAliceです。20歳です。
    greet(*tom2);   // 私はTomです。21歳です。

    return 0;
}

