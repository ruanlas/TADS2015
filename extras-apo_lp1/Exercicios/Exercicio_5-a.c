#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<string.h>

int main()
{
    int vetor[100];
    int tamanho=100,i,j,x;
    for (i=0;i<100;i++){
        printf("Digite um numero para a posicao %d do vetor: ", i+1);
        scanf("%d", &vetor[i]);
    }
    for (i=tamanho-1;i>=1; i--){
        for (j=0; j<i;j++){
            if(vetor[j]>vetor[j+1]){
            x=vetor[j];
            vetor[j]=vetor[j+1];
            vetor[j+1]=x;
            }
        }
    }
    for (i=0;i<100;i++){
        printf("%d\n", vetor[i]);
    }
    return 0;
}
