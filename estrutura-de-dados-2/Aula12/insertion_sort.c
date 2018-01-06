#include<stdio.h>
#include<stdlib.h>

int main(){
    int vetor[15] = {30, 29, 25, 19, 38, 40, 6, 9, 1, 64, 55, 45, 42, 47, 52};
    int i, j;

    for( i = 0; i < 15; i++){
        printf("[%d] ", vetor[i]);
    }
    printf("\n\n");

    for( i = 0; i < 15; i++){
        j = i;
        while(vetor[j] < vetor[j-1] && j > 0){
            int aux = vetor[j];
            vetor[j] = vetor[j-1];
            vetor[j-1] = aux;

            if(j > 1){
                j = j - 1;
            }
        }
    }

    for( i = 0; i < 15; i++){
        printf("[%d] ", vetor[i]);
    }

    return 0;
}
