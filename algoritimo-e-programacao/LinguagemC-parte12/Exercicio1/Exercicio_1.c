#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<math.h>
#include<limits.h> //biblioteca de limites

int main()
{
    int vetor[10];
    int i;
    int maior = INT_MIN;
    int menor= INT_MAX;
    for (i=0;i<10; i++){
        printf("Digite um numero na posicao %d:\n", i+1);
        scanf("%d", &vetor[i]);
    }
    for (i=0; i<10; i++){
        if (vetor[i]>maior){
            maior=vetor[i];
        }else{
            maior=maior;
        }
    }
    for (i=0; i<10; i++){
        if (vetor[i]<menor){
            menor=vetor[i];
        }else{
            menor=menor;
        }
    }
    printf (" O Maior valor digitado e %d\n", maior);
    printf(" O Menor valor digitado e %d\n", menor);
    return 0;
}
