#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

#define Lin_Col 6

int main()
{
    int matriz[Lin_Col][Lin_Col];
    int i,j=0;
    for (i=0; i<Lin_Col; i++){
        for (j=0; j<Lin_Col; j++){
            printf("Digite um numero para ser armazenado na posicao M%d,%d da matriz: ", i+1,j+1);
            scanf("%d", &matriz[i][j]);
        }
    }
    printf("\n\n");
    for (i=0; i<Lin_Col; i++){
        for (j=0; j<Lin_Col; j++){
            if (j==1|| j==3 || j==5){
                printf("|%d| ", matriz[i][j]);
            }else{
                printf("|x| ");
            }
        }
        printf("\n");
    }
    return 0;
}
