#include<stdlib.h>
#include<stdio.h>

int main(){
    int vetor[6] = {9, 3, 8, 2, 7, 1};
    int i,j;
    int temp = 0;
    for(i = 0; i<6; i++){
        for(j = i+1; j<6; j++){
            if(vetor[i]>vetor[j]){
                temp = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = temp;
            }
        }
    }
    printf("Imprimindo ordenado\n");

    for(i = 0; i < 6; i++){
        printf("[%d] ", vetor[i]);
    }
    return 0;
}
