#include <stdio.h>
#include <errno.h>

int main(void) {
    FILE *fp;
    char c, text[100000] = "";
    int i = 0;

    fp = fopen("ReadChar.java", "r");
    if (fp == NULL) {
        puts("An error occurred.");
        return 1;
    }

    while ((c = fgetc(fp)) != EOF) {
        text[i++] = c;
    }
    text[i] = '\0';     // 終端文字追加
    fclose(fp);

    puts(text);

    return 0;
}

