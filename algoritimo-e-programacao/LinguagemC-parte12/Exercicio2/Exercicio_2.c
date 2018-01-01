#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<math.h>

int main()
{
    int matrizA[2][3];
    int matrizB[2][3];
    int matrizSoma[2][3];
    int i, j;
    printf("Digite os elementos da Matriz A:\n");
    for (i=0; i<2; i++){
        for (j=0; j<3; j++){
            printf("Digite a posicao A,%d,%d:\n", i+1,j+1 );
            scanf("%d", &matrizA[i][j]);
        }
    }
    printf("Digite os elementos da Matriz B:\n");
    for (i=0; i<2; i++){
        for (j=0; j<3; j++){
            printf("Digite a posicao B,%d,%d:\n", i+1,j+1 );
            scanf("%d", &matrizB[i][j]);
        }
    }
    for (i=0; i<2; i++){
        for (j=0; j<3; j++){
            matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];
        }
    }
    printf("A soma das duas matrizes e:\n");
    for (i=0; i<2; i++){
        for (j=0; j<3; j++){
            printf("%d\t", matrizSoma[i][j]);
        }
        printf("\n");
    }
    return 0;
}
