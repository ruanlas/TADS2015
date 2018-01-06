#include<stdio.h>
#include<stdlib.h>

int buscaVetor(int vetor[], int busca){
    int i = 0;
    int achou = 0;
    for(i = 0; i < 10; i++){
        if(vetor[i]==busca){
            achou = 1;
        }
    }
    return achou;
}
void bubbleSort(int vetor[]){
    int i,j;
    for (i = 0; i < 10; i++){
        for(j = i+1; j < 10; j++){
            int menor;
            if(vetor[i] < vetor[j]){
            }else{
                menor = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = menor;
            }
        }
    }

}

int main(){
    int vetor[10] = {9, 3, 2, 0, 7, 6, 4, 8, 1, 5};
    printf("Busca de elemento no vetor\n\n");
    int busca = 2;
    if(buscaVetor(vetor, busca)==1){
        printf("O elemento %d se encontra no vetor\n", busca);
    }else{
        printf("O elemento %d nao se encontra no vetor\n", busca);
    }
    printf("Antes do bubbleShort\n");
    int i;
    for(i = 0; i<10;i++){
        printf("Elemento [%d]: %d\n", i, vetor[i]);
    }
    bubbleSort(vetor);
    printf("\n\nDepois do bubbleShort\n");
    for(i = 0; i<10;i++){
        printf("Elemento [%d]: %d\n", i, vetor[i]);
    }
    return 0;
}
