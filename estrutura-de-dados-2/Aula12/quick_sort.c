#include<stdio.h>
#include<stdlib.h>

int main(){
    int vetor[15] = {30, 29, 25, 19, 38, 40, 6, 9, 1, 64, 55, 45, 42, 47, 52};
    int i, inicio, fim;

    for( i = 0; i < 15; i++){
        printf("[%d] ", vetor[i]);
    }
    printf("\n\n");
    int *pivo = &vetor[0];
    inicio = 0;
    fim = 14;

    while(inicio < fim){
        while(vetor[inicio] <= *pivo){
            inicio++;
        }
        while(vetor[fim] >= *pivo){
            fim--;
        }
        int aux = vetor[inicio];
        vetor[inicio] = vetor[fim];
        vetor[fim] = aux;
        if(fim < inicio){
            int temp = *pivo;
            *pivo = vetor[fim];
            vetor[fim] = temp;
        }
    }

    for( i = 0; i < 15; i++){
        printf("[%d] ", vetor[i]);
    }

    return 0;
}
