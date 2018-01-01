#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int i,j;
    int soma= -01;
    int matriz[10][10];
    for (i=0; i<10; i++){
        for (j=0; j<10; j++){
            soma=soma+1;
            matriz[i][j]=soma;
        }
    }
    printf("Matriz Normal\n\n");
    for (i=0; i<10; i++){
        for (j=0; j<10; j++){
            printf("%.2d ", matriz[i][j]);
        }
        printf("\n");
    }
    printf("\n\n\nMatriz Invertida\n\n");
    for (i=0; i<10; i++){
        for (j=0; j<10; j++){
            printf("%.2d ", matriz[j][i]);
        }
        printf("\n");
    }
    return 0;
}
