#include<stdio.h>
#include<stdlib.h>

int buscaVetor(int vetor[], int buscaX){
    int achou = 0;
    int inicio = 0;
    int fim = 9;
    int meio;
    while(inicio <= fim  && achou != 1){
        meio = (inicio+fim)/2;
        //printf("Posicao %d\n", meio);
        //printf("Vetor %d\n", vetor[meio]);
        if(vetor[meio]==buscaX){
            achou = 1;
            /*break;*///=>se não utilizar o (achou != 1) no while, é preciso dar o 'break' para parar o loop
            //printf("Inicio %d, Fim %d\n", inicio,fim);
        }else if(vetor[meio] < buscaX){
            inicio = meio + 1;
        }else{
            fim = meio - 1;
        }
    }
    return achou;
}

int main(){
    int vetor[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    printf("Busca de elemento no vetor\n\n");
    //printf("%d", (9/2));
    int busca = 4;


    //printf("Retorno = %d\n", buscaVetor(vetor,busca));

    if(buscaVetor(vetor, busca)==1){
        printf("O elemento %d se encontra no vetor\n", busca);
    }else{
        printf("O elemento %d nao se encontra no vetor\n", busca);
    }
    return 0;
}
