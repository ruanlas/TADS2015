#include  <stdio.h>
#include <stdlib.h>


//definição da estrutura carro
typedef struct Carro{
    char marca[15];
    int ano;
    char cor[10];
    float preco;
}carro;
//declaração do vetor de carros
struct Carro vetcarro[2];

/*
esta função recebe como parametro um vetor de carros e imprime os dados armazenados
em cada cada posição do mesmo, buscando no vetor de struct
*/
void funcImprime(struct Carro vetcarro[]){
    int i = 0;
    for(i = 0; i < 2; i++){
        printf("marca carro %d: %s\n", i+1, vetcarro[i].marca);
        printf("ano carro %d: %d\n", i+1, vetcarro[i].ano);
        printf("cor carro %d: %s\n", i+1, vetcarro[i].cor);
        printf("preco carro %d: R$%.2f\n\n\n", i+1, vetcarro[i].preco);
    }
}
/*
esta função recebe um vetor e atribui valores aos campos da estrutura

*/
void funcLeitura(struct Carro vetcarro[]){
    int i = 0;
     for(i = 0; i < 2; i++){
        fflush(stdin);
        printf("marca carro %d \n", i+1);
        fgets(vetcarro[i].marca, 15, stdin);
        fflush(stdin);
        printf("ano carro %d \n", i+1);
        scanf("%d", &vetcarro[i].ano);
        fflush(stdin);
        printf("cor carro %d \n", i+1);
        fgets(vetcarro[i].cor, 15, stdin);
        fflush(stdin);
        printf("preco carro %d \n", i+1);
        scanf("%f", &vetcarro[i].preco);
        fflush(stdin);
    }
}

void procuraPreco(struct Carro vetcarro[]){
    int i = 0;
    float preco = 0;

    printf("Digite o preco a ser buscado\n");
    scanf("%f", &preco);

    for(i = 0; i < 2 ;i++){

            if(vetcarro[i].preco <= preco){
                funcImprime(vetcarro[i].marca);
            }
    }
}


int main()
{
    int op;
    printf("Escolha Uma opcao\n");
        printf("1-Ler vetor\n");
        printf("2-Imprimir\n");


    while(op!= 0){

        scanf("%d", &op);
        switch (op){
        case 1:
            funcLeitura(vetcarro);
            break;
        case 2:
            funcImprime(vetcarro);
            break;
        case 0:
            exit(0);
        default:
            printf("default\n");
            break;
        }

    }

    return 0;
}
