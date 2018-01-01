#include<stdio.h>

int main()
{
    FILE*arq;
    char c;
    arq=fopen("teste1.txt","r");
    c=getc(arq);
    while (c!=EOF){
        printf("%c", c);
        c=getc(arq);
    }
    fclose(arq);
    system("PAUSE");
    return 0;
    }
