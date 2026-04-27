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
    Person bob;
    strcpy(bob.name, "Bob");
    bob.age = 19;

    greet(bob);

    return 0;
}

