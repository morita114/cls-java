#include <stdio.h>

#define MAX_LINE 1024  /* 1行の最大文字数 */

int main(void) {
    FILE *fp;
    char line[MAX_LINE];

    fp = fopen("ReadLine.c", "r");
    if (fp == NULL) {
        printf("File not found.\n");
        return 1;
    }

    /* fgets: 1行読み込む。EOFでNULLを返す */
    while (fgets(line, MAX_LINE, fp) != NULL) {
        printf("%s", line);  /* fgets は改行を含むので \n 不要 */
    }

    fclose(fp);
    return 0;
}

