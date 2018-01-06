#include<stdio.h>
#include<stdlib.h>

int main(){
    //Exercício a)
    int i,j = 0;
    int vetor[7] = {8, 2, 4, 1, 6, 3, 9};
    int cont = 0;
    for(i = 1; i <7; i++){
        for(j = 6; j > i-1; j--){
            if(vetor[j] < vetor[j-1]){
                int aux = vetor[j];
                vetor[j] = vetor[j-1];
                vetor[j-1] = aux;
                cont++;
            }
        }
    }
    int x = 0;
    for (x = 0; x<7; x++){
        printf("%d |",vetor[x]);
    }
    //Exercício b)
    printf("\nQuantidade de trocas: %d\n\n", cont);

    //Exercício c)

    int vetorX[7] = {9, 8, 6, 4, 3, 2, 1};//Configuração do vetorX (pior caso)
    cont = 0;
    for(i = 1; i <7; i++){
        for(j = 6; j > i-1; j--){
            if(vetorX[j] < vetorX[j-1]){
                int aux = vetorX[j];
                vetorX[j] = vetorX[j-1];
                vetorX[j-1] = aux;
                cont++;
            }
        }
    }

    for (x = 0; x<7; x++){
        printf("%d |",vetorX[x]);
    }
    printf("\nQuantidade de trocas: %d\n", cont);

    return 0;
}
