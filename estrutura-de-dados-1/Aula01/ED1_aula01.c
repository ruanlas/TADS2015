#include<stdio.h>
#include<stdlib.h>

void Troca(int *px, int *py){
    /*Troca os valores das variáveis apontadas por px e py*/
    int n; //variável temporária
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
