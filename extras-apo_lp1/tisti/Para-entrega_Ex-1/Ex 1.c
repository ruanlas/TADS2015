#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int rua[4][6]; // int rua[linha][coluna]
    int i,j;

    for (i=0; i<4; i++){ //para cada linha
        for (j=0; j<6; j++){// ele irá percorrer as 6 colunas da matriz
        printf("Digite a quantidade de acidentes que ocorreram na esquina da rua %d com a rua %d: \n", i+1,j+1);
        scanf("%d", &rua[i][j]);
        }
    }
    printf("Relacao de acidentes por cruzamento:\n\nC = Cruzamento\nA = Acidentes\n\n");
    for (i=0; i<4; i++){ // Irá percorrer as 4 linhas da coluna
        for (j=0; j<6; j++){ // Irá percorrer as 6 colunas da linha
        printf("C:%d,%d = %dA |",i+1,j+1, rua[i][j]); // Irá imprimir a linha da matriz: a11; a12; a13; a14...
        }
        printf("\n"); //desloca para imprimir a próxima linha da matriz
    }
    return 0;

}
