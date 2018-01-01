#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<math.h>

struct carros {
    char marca[15];
    int ano;
    char cor[10];
    float preco;
} vetcarros[20];

void menuPrincipal()
{
    system("cls");
    printf("Revendedora de Veiculos\n-----------------------\n");
    printf("Digite as opcoes:\n");
    printf("1 = Cadastrar carros\n");
    printf("2 = Pesquisa de Carros por preco\n");
    printf("3 = Pesquisa de Carros por marca\n");
    printf("4 = Pesquisa de Carros por marca, ano e cor\n");
    printf("0 = Sair\n");
    fflush(stdin);
}
//int K=1;
int K=0;
void CadastroCarros()
{
    system("cls");
    int controle, i;
    //i=1;
    controle=1;
    printf("Revendedora de Veiculos\n-----------------------\n");
    printf("Cadastrar carros\n----------------\n");
    if ( K==0/*K==1*/){
            K++;
    while (controle != 0){
        fflush(stdin);
        printf("Digite a marca do carro %d: \n", K);
        gets(vetcarros[K].marca);
        fflush(stdin);
        printf("Digite o ano do carro %d: \n", K);
        scanf("%d", &vetcarros[K].ano);
        fflush(stdin);
        printf("Digite a cor do carro %d: \n", K);
        gets(vetcarros[K].cor);
        fflush(stdin);
        printf("Digite o preco do carro %d: \n", K);
        scanf("%f", &vetcarros[K].preco);
        fflush(stdin);
        printf("\n\nDigite alguma tecla para continuar ou 0 para sair\n\n");
        scanf("%d", &controle);
        fflush(stdin);
        if (controle!=0){
            K++;
            if (K>20){
                break;
            }
        }

    }
}else{
    K++;
    while (K<=20){
        fflush(stdin);
        printf("Digite a marca do carro %d: \n", K);
        gets(vetcarros[K].marca);
        fflush(stdin);
        printf("Digite o ano do carro %d: \n", K);
        scanf("%d", &vetcarros[K].ano);
        fflush(stdin);
        printf("Digite a cor do carro %d: \n", K);
        gets(vetcarros[K].cor);
        fflush(stdin);
        printf("Digite o preco do carro %d: \n", K);
        scanf("%f", &vetcarros[K].preco);
        fflush(stdin);
        printf("\n\nDigite alguma tecla para continuar ou 0 para sair\n\n");
        scanf("%d", &controle);
        fflush(stdin);
        if (controle==0){
            break;
        }else{
            K++;
        }
    }
}
    fflush(stdin);
}
void ConsultaPreco ()
{
    system("cls");
    int limpar;
    int i;
    float valor;
    limpar=0;
    valor=0;
    printf("Revendedora de Veiculos\n-----------------------\n");
    printf("Consulta de carros por preco\n----------------------------\n\n");
    printf("Digite um preco a ser pesquisado\n");
    scanf("%f", &valor);
    for (i=1; i<=20; i++){
        if (vetcarros[i].preco<=valor){
            printf("Marca: %s\n", vetcarros[i].marca);
            printf("Ano: %d\n", vetcarros[i].ano);
            printf("Cor: %s\n", vetcarros[i].cor);
            printf("Preco: R$%.2f\n\n", vetcarros[i].preco);
        }
    }
    printf("Precione 1 para limpar a tela: ");
    scanf("%d", &limpar);
    while (limpar!= 1){
    if(limpar==1){
       break;
    }else{
    printf("Precione 1 para limpar a tela: ");
    scanf("%d", &limpar);
    }
}
    fflush(stdin);
    system("cls");
}

void ConsutaMarca ()
{
    system("cls");
    int limpar;
    int i;
    char marca[15];
    limpar=0;
    printf("Revendedora de Veiculos\n-----------------------\n");
    printf("Consulta de carros por marca\n----------------------------\n\n");
    fflush(stdin);
    printf("Digite uma marca para ser pesquisada\n");
    gets(marca);
    fflush(stdin);
    for (i=1; i<=20; i++){
        if (strcmp(vetcarros[i].marca, marca)==0){
            printf("Marca: %s\n", vetcarros[i].marca);
            printf("Ano: %d\n", vetcarros[i].ano);
            printf("Cor: %s\n", vetcarros[i].cor);
            printf("Preco: R$%.2f\n\n", vetcarros[i].preco);
        }
    }
    printf("Precione 1 para limpar a tela: ");
    scanf("%d", &limpar);
    while (limpar!= 1){
    if(limpar==1){
       break;
    }else{
    printf("Precione 1 para limpar a tela: ");
    scanf("%d", &limpar);
    }
}
    fflush(stdin);
    system("cls");
}
void ConsutaTodosElementos()
{
    system("cls");
    struct car{
        char marca[15];
        int ano;
        char cor[10];
    } automovel;
    int i;
    int limpar;
    limpar=0;
    //fflush(stdin);
    printf("Revendedora de Veiculos\n-----------------------\n");
    printf("Consulta de carros por marca, ano e cor\n---------------------------------------\n");
    fflush(stdin);
    printf("Digite a marca do carro\n");
    gets(automovel.marca);
    fflush(stdin);
    printf("Digite o ano do carro\n");
    scanf("%d", &automovel.ano);
    fflush(stdin);
    printf("Digite a cor do carro\n");
    gets(automovel.cor);
    fflush(stdin);
    for (i=1; i<=20; i++){
        if (automovel.ano==vetcarros[i].ano && strcmp(automovel.marca, vetcarros[i].marca)==0 && strcmp(automovel.cor, vetcarros[i].cor)==0){
        printf("Preco: R$%.2f\n\n", vetcarros[i].preco);
        }
    }
    printf("Precione 1 para limpar a tela: ");
    scanf("%d", &limpar);
    while (limpar!= 1){
    if(limpar==1){
       break;
    }else{
    printf("Precione 1 para limpar a tela: ");
    scanf("%d", &limpar);
    }
}
    fflush(stdin);
    system("cls");
}
int main()
{
    int op;
    op = 9;

       while (op!=0){
            menuPrincipal();
            scanf("%d", &op);
         switch (op){
            case 1:
            CadastroCarros(); break;
            case 2:
            ConsultaPreco(); break;
            case 3:
            ConsutaMarca(); break;
            case 4:
            ConsutaTodosElementos(); break;
            case 0:
            break;
            default:
            printf ("Opcao invalida\nPressione <enter> e digite novamente sua opcao\n");
            system("PAUSE>>NULL");
            //scanf("%d", &op);
            break;
         }
    }
    system("PAUSE");
    return 0;
}
