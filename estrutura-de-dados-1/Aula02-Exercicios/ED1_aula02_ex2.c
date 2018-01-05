#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#include<math.h>
#define TamVet 6
typedef struct{
    char nome[15];
    int anoProducao;
    char atorPrincipal[25];
}Filme;

void cadastraFilme(Filme vetFilme[]){
    int i = 0;
    for(i = 0; i < TamVet; i++){
        system("CLS");
        fflush(stdin);
        printf("Digite o nome do filme da posicao %d: ", i+1);
        gets(vetFilme[i].nome);
        printf("Digite o ano de producao do filme da posicao %d: ", i+1);
        scanf("%d", &vetFilme[i].anoProducao);
        fflush(stdin);
        printf("Digite o nome do ator principal do filme da posicao %d: ", i+1);
        gets(vetFilme[i].atorPrincipal);
        system("CLS");
    }
}
int informaMaisNovo(Filme vetFilme[]){
    int i = 0;
    int novo = 0;
    for(i = 0; i < TamVet; i++){
        if(novo < vetFilme[i].anoProducao){
            novo = vetFilme[i].anoProducao;
        }
    }
    return novo;
}
void imprimeFilmeMaisNovo(Filme vetFilme[], int anoProducao){
    int i = 0;
    system("CLS");
    for(i = 0; i < TamVet; i++){
        if(anoProducao == vetFilme[i].anoProducao){
            printf("----------------------\n");
            printf("Filme: %s\n", vetFilme[i].nome);
            printf("Ano de Producao: %d\n", vetFilme[i].anoProducao);
            printf("Ator Principal: %s\n", vetFilme[i].atorPrincipal);
            printf("----------------------\n");
        }
    }
    system("PAUSE");
}
void imprimeListaFilmes(Filme vetFilme[]){
    int i = 0;
    system("CLS");
    for(i = 0; i < TamVet; i++){
        printf("----------------------\n");
        printf("Filme: %s\n", vetFilme[i].nome);
        printf("Ano de Producao: %d\n", vetFilme[i].anoProducao);
        printf("Ator Principal: %s\n", vetFilme[i].atorPrincipal);
        printf("-----------------------\n");
    }
    system("PAUSE");
}
void menu(){
    system("CLS");
    printf("1 - Registrar filme\n");
    printf("2 - Consultar filme mais novo\n");
    printf("3 - Consultar todos os filmes\n");
    printf("0 - Sair\n");
}
int main(){
    Filme listaFilme[TamVet];
    int maisNovo = 0;

    char opcao = '9';
    while(opcao != '0'){
        menu();
        fflush(stdin);
        scanf("%c", &opcao);
        switch(opcao){
            case '1':
                cadastraFilme(listaFilme);
                break;
            case '2':
                maisNovo = informaMaisNovo(listaFilme);
                imprimeFilmeMaisNovo(listaFilme, maisNovo);
                break;
            case '3':
                imprimeListaFilmes(listaFilme);
                break;
            case '0':
                break;
            default:
                printf("Opcao invalida\n");
        }
    }
}
