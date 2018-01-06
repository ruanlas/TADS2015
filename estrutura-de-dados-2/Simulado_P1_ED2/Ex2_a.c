#include<stdio.h>
#include<stdlib.h>


int main(){
    int vetor[18] = {5,9,12,32,41,48,52,55,59,60,62,68,72,78,80,86,95,100};

    int fim = 17;
    int inicio = 0;
    int meio = 0;

    int pesquisa = 60;
    int achou = 0;

    while(fim >= inicio || achou == 1){
        meio = (fim+inicio)/2;
        printf("%i", vetor[meio]);
        if(vetor[meio] == pesquisa){
            achou = 1;
            break;
        }else if(vetor[meio] < pesquisa){
            inicio = meio + 1;
        }else if(vetor[meio] > pesquisa){
            fim = meio - 1;
        }
    }

    if(achou == 1){
        printf("Elemento Encontrado!!!");
    }else{
        printf("Elemento Nao Encontrado!!!");
    }

    return 0;
}
