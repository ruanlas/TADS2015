#include<stdio.h>
#include<string.h>

struct pessoa{
    char nome[50];
    int idade;
};

typedef struct pessoa Pessoa;

int main()
{
    FILE*arq;
    arq=fopen("pessoas.txt", "ab");
    Pessoa p;
    printf("Digite um nome: ");
    gets(p.nome);
    printf("Digite a idade: ");
    scanf("%d", &p.idade);
    fwrite(&p, sizeof(Pessoa), 1, arq);
    fclose(arq);//fecha e salva o arquivo
    return 0;
}
