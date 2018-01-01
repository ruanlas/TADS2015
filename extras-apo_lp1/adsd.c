#include<stdio.h>
#include<stdlib.h>

int main()
{
    int rua[4][6];
    int i, j;
    for(i = 1; i <= 4; i++ )
        for (j = 1; j <= 6; j++ ){
    printf("Digite um numero na posição L%d C%d: \n", i, j);
    scanf("%d", &rua[i][j]);
}

    for(i = 1; i <= 4; i++ )
        for (j = 1; j <= 6; j++ )
                printf("L%d,C%d = %d", i, j, rua[i][j]);


    return 0;
}
