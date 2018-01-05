#include<stdio.h>
#include<stdlib.h>

void Troca(int *px, int *py){
    /*Troca os valores das vari�veis apontadas por px e py*/
    int n; //vari�vel tempor�ria
    n = *py;
    *py = *px;
    *px = n;
}


int main(){
    int x = 9;
    int y = 4;

    printf("Antes de trocar\n");
    printf("X = %d, Y = %d\n", x, y);
    Troca(&x, &y);
    printf("Depois de trocado\n");
    printf("X = %d, Y = %d\n", x, y);
    Troca(&x, &y);
    printf("Depois de trocado novamente\n");
    printf("X = %d, Y = %d\n", x, y);

    return 0;
}
