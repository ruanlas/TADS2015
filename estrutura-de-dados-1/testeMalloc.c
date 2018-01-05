#include<stdio.h>
#include<stdlib.h>

int main(void)
{
    char *nome;
    nome = (char *) malloc(21);

    printf("Digite seu nome: ");
    gets(nome);

    printf("%sn", nome);

    return 0;
}
