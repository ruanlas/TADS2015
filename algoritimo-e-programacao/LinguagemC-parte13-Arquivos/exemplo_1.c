#include<stdio.h>

int main()
{
    FILE *arq;
    arq=fopen("teste1.txt","w");
    fprintf(arq, "Ola,mundo!!!!\n");
    fclose(arq);
    return 0;
}
