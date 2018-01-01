#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

#define vet 4
struct Horoscopo{
    char nome[50];
    char signo[15];
    int idade;
}usuario[vet];

int main()
{
    int i=0;
    char signo[15];
    for (i=0; i<vet; i++){
    fflush(stdin);
    printf("\nDigite o seu nome: ");
    gets(usuario[i].nome);
    printf("Digite o seu signo: ");
    gets(usuario[i].signo);
    printf("Digite a sua idade: ");
    scanf("%d", &usuario[i].idade);
    }
    fflush(stdin);
    printf("\nDigite um signo a ser pesquisado: ");
    gets(signo);
    for(i=0; i<vet;i++){
        if (strcmp (usuario[i].signo,signo) == 0){
            printf("\nNome: %s\n", usuario[i].nome);
            printf("Signo: %s\n", usuario[i].signo);
            printf("Idade: %d\n", usuario[i].idade);
        }
    }
    return 0;
}
