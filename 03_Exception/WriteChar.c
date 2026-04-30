#include <stdio.h>

int main(void) {
    FILE *fp;
    char *text = "Hello, world.\n  from WriteChar.c";
    int i;

    fp = fopen("output.txt", "w");
    if (fp == NULL) {
        printf("ファイルを開けません。\n");
        return 1;
    }

    for (i = 0; text[i] != '\0'; i++) {
        fputc(text[i], fp);
    }

    fclose(fp);

    return 0;
}

