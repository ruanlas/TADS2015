#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#define TamVet 12
typedef struct{
    char modelo[15];
    int ano;
    char cor[10];
    float preco;
}veiculo;

 veiculo catalogo[TamVet];

//Passagem de Vetor por referência?
 void lerVetorCatalogo(veiculo cat[]){
    int i = 0;
    for(i = 0; i < TamVet; i++ ){
        //eliminando o buffer de entrada
        system("CLS");
        fflush(stdin);
        printf("Digite o modelo do carro da posicao %d\n", i+1);
        gets(cat[i].modelo);
        printf("Digite o ano do carro da posicao %d\n", i+1);
        scanf("%d", &cat[i].ano);
        //eliminando o buffer de entrada
        fflush(stdin);
        printf("Digite a cor do carro da posicao %d\n", i+1);
        gets(cat[i].cor);
        printf("Digite o preco do carro da posicao %d\n", i+1);
        scanf("%f", &cat[i].preco);
        system("CLS");
    }
 }
 void imprimeVetorCatalogoPeloPreco(veiculo cat[], double preco){
    int i = 0;
    for(i=0; i < TamVet; i++){
        if(cat[i].preco <= preco){
            printf("--------------------\n");
            printf("Modelo: %s\n", cat[i].modelo);
            printf("Ano: %d\n", cat[i].ano);
            printf("Cor: %s\n", cat[i].cor);
            printf("Preco: %.2f\n", cat[i].preco);
            printf("---------------------\n");
        }
    }
    //system("PAUSE");
 }
 void imprimeVetorCatalogoPeloModelo(veiculo cat[], char modelo[15]){
    int i = 0;
    for(i=0; i < TamVet; i++){
        if(strcmp(cat[i].modelo, modelo) == 0){
            printf("--------------------\n");
            printf("Modelo: %s\n", cat[i].modelo);
            printf("Ano: %d\n", cat[i].ano);
            printf("Cor: %s\n", cat[i].cor);
            printf("Preco: %.2f\n", cat[i].preco);
            printf("---------------------\n");
        }
    }
    //system("PAUSE");
 }
 void imprimeVetorCatalogoPeloModelo_Ano_Cor(veiculo cat[], char modelo[15], int ano, char cor[10]){
    int i = 0;
    for(i=0; i < TamVet; i++){
        if(strcmp(cat[i].modelo, modelo) == 0 && strcmp(cat[i].cor, cor) == 0 && cat[i].ano==ano){
            printf("--------------------\n");
            printf("Modelo: %s\n", cat[i].modelo);
            printf("Ano: %d\n", cat[i].ano);
            printf("Cor: %s\n", cat[i].cor);
            printf("Preco: %.2f\n", cat[i].preco);
            printf("---------------------\n");
        }
    }
    //system("PAUSE");
 }
 void menu(){
     system("CLS");
    printf("Digite as opcoes desejadas:\n");
    printf("1 - Cadastro de veiculos\n");
    printf("2 - Consulta por preco\n");
    printf("3 - Consulta por modelo\n");
    printf("4 - Consulta por modelo, ano e cor\n");
    printf("0 - Sair\n");
 }
 int main(){
    char opcoes = '9';
    while (opcoes != '0'){
            system("CLS");
        menu();
        fflush(stdin);
        opcoes = getchar();
        //scanf("%c", &opcoes);
        switch (opcoes){
        case '1':
            //printf("Entrou");
            lerVetorCatalogo(catalogo);
            //system("PAUSE");
            break;
        case '2':
            printf("Informe o preco do carro\n");
            float tempPreco = 0;
            scanf("%f", &tempPreco);
            imprimeVetorCatalogoPeloPreco(catalogo, tempPreco);
            break;
        case '3':
            printf("Informe o modelo do carro\n");
            fflush(stdin);
            char tempModelo[15];
            gets(tempModelo);
            imprimeVetorCatalogoPeloModelo(catalogo, tempModelo);
            break;
        case '4':
            fflush(stdin);
            char modeloTemp[15];
            int anoTemp = 0;
            char corTemp[10];
            printf("Informe o modelo do carro:\n");
            fflush(stdin);
            gets(modeloTemp);
            printf("Informe a cor do carro:\n");
            fflush(stdin);
            gets(corTemp);
            printf("Informe o ano do carro:\n");
            fflush(stdin);
            scanf("d", &anoTemp);
            imprimeVetorCatalogoPeloModelo_Ano_Cor(catalogo, modeloTemp, anoTemp, corTemp);
            break;
        case '0':
            break;
        default:
            printf("Opcao invalida\n");
            break;
        }
        system("PAUSE");
    }
    return 0;
 }
