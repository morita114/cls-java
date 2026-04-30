#include <stdio.h>

int main(void) {
    FILE *fp;
    char *text = "Hello, world.\n  from WriteText.c";
    int i;

    fp = fopen("output.txt", "w");
    if (fp == NULL) {
        printf("ファイルを開けません。\n");
        return 1;
    }

    fputs(text, fp);
    fprintf(fp, "%s\n", text);

    fclose(fp);

    return 0;
}

