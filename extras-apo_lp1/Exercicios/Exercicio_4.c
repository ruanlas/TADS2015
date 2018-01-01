#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<string.h>

int main()
{
    int vetor[10];
    int i;
    int soma=0;
    int x=10;
    for (i=0; i<10;i++){
            x=x+1;
            vetor[i]=x;
        }

    for (i=0;i<10;i++){
        printf("Vetor %d = %d\n",i+1 ,vetor[i]);
    }
    for (i=0;i<10;i++){
        soma=vetor[i]+soma;
    }
    printf("A soma dos vetores e: %d", soma);
    return 0;
}
