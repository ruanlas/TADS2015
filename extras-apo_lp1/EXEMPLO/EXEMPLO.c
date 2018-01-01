#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    struct dados{
        char nome[11];
        char nacionalidade[25];
        char escolaridade[25];
        char sexo[25];
    } Cads;
    printf("Digite seu nome: ");
    fflush(stdin);
    scanf("%s", &Cads.nome);
    printf("Digite sua nacionalidade: ");
    fflush(stdin);
    gets(Cads.nacionalidade);
    printf("Diiste sua escolaridade: ");
    gets(Cads.escolaridade);
    printf("Digite seu sexo: ");
    gets(Cads.sexo);
    printf("Cadastro realizado com sucesso!!!!\n");
    return 0;
}
