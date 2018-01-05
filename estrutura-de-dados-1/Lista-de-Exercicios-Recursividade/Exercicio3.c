#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>

int menorValorDoVetor(int vet[], int n){
    if(n==0){
        return vet[0];
    }else{
        if(vet[n-1] < menorValorDoVetor(vet, n-1)){
            return vet[n-1];
        }
    }
}

int main(){
    int n = 6;
    int x[6] = {1, 0, 4, 3, 2, 7};
    //scanf("%d", &x);
    printf("O menor numero do vetor e %d", menorValorDoVetor(x, n));
    printf("\n%d", x[0]);

    return 0;
}
