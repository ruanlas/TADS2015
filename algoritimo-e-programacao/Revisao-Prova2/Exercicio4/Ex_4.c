#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

struct Horoscopo{
    char nome[50];
    char signo[15];
    int idade;
}usuario;

int main()
{
    printf("Digite o seu nome: ");
    gets(usuario.nome);
    printf("Digite o seu signo: ");
    gets(usuario.signo);
    printf("Digite a sua idade: ");
    scanf("%d", &usuario.idade);
    return 0;
}
