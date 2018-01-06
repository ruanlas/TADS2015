#include<stdlib.h>
#include<stdio.h>

int main(){
    int vetor[7] = {8, 2, 4, 1, 6, 3, 9};
    int i,j;
    int temp = 0;
    int qtdTroca = 0;
    for(i = 0; i<7; i++){
        for(j = i+1; j<7; j++){
            if(vetor[i]>vetor[j]){
                temp = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = temp;
                ++qtdTroca;
            }
        }
    }
    printf("Imprimindo ordenado\n");

    for(i = 0; i < 7; i++){
        printf("[%d] ", vetor[i]);
    }
    printf("\nEste vetor foi trocado %d vezes", qtdTroca);
    return 0;
}
