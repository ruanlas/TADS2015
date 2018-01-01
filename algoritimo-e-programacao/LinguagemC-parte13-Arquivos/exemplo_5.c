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
    arq=fopen("pessoas.txt", "rb");
    Pessoa p;
    while (fread(&p, sizeof(Pessoa), 1, arq)!=0){
        printf("Nome: %s - Idade: %d\n", p.nome, p.idade);
    }
    fclose(arq);
    system("PAUSE");
    return 0;
}
