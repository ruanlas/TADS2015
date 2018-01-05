#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>
//Tem como passar um vetor dinâmico??
int menorValorDoVetor(int vet[], int n){
    int i = 0;
    int menor = INT_MAX;
    for(i=0; i<n; i++){
        if(vet[i] < menor){
            menor = vet[i];
        }else{
            menor = menor;
        }
    }
    return menor;
}

int main(){
    int n = 6;
    int x[6] = {8, 2, 1, 9, 4, 6};
    //scanf("%d", &x);
    printf("O menor numero do vetor e %d", menorValorDoVetor(x, n));

    return 0;
}
