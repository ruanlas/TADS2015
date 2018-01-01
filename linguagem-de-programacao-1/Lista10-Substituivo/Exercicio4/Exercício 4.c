#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    float vet[4];
    int i;
    float *pvet[4];
    pvet[0]=&vet[0];
    pvet[1]=&vet[1];
    pvet[2]=&vet[2];
    pvet[3]=&vet[3];
    for (i=0;i<4;i++){
        system("cls");
        printf("Digite um numero para ser armazenado na posicao %d do vetor: ", i+1);
        scanf("%f", &vet[i]);
    }
    system("cls");
    for (i=0;i<4;i++){
        printf("vet[%d]= %f / pvet= %d\n", i+1, vet[i], pvet[i]);
    }
    return 0;
}
