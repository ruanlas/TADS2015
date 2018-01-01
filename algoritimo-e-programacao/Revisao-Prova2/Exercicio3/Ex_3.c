#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    int i=0;
    int cat1=0,cat2=0,cat3=0;
    int vetor[10];
    for (i=0;i<10;i++){
    printf("Digite um numero entre 0 e 100 para ser armazenado na posicao %d do vetor: ", i+1);
    scanf("%d", &vetor[i]);
        if (vetor[i]<0 || vetor[i]>100){
            printf("Numero invalido\nDigite um numero entre 0 e 100 ");
            while (vetor[i]<0 || vetor[i]>100){
                scanf("%d", &vetor[i]);
            }
        }
    }
    for (i=0; i<10;i++){
        if(vetor[i]<25){
            cat1=cat1+1;
        }else if(vetor[i]>=25 && vetor[i]<75){
            cat2=cat2+1;
        }else if(vetor[i]>=75){
            cat3=cat3+1;
        }
    }
    printf("\nQuantidade de numeros digitados da categoria 1 = %d\n", cat1);
    printf("Quantidade de numeros digitados da categoria 2 = %d\n", cat2);
    printf("Quantidade de numeros digitados da categoria 2 = %d\n", cat3);
    return 0;
}
