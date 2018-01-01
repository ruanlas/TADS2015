#include<stdio.h>
#include<stdlib.h>
#include<math.h>
// Cálculo de Fatorial com Função recursiva
long int fatorial(int x)
{
    if (x<= 1){
        return 1;
    } else {
       return(x*fatorial(x-1));

    }
}
int main()
{
    int x;
    x=0;
    printf("Digite um numero: ");
    scanf("%d", &x);
    printf("O fatorial de %d e %d", x, fatorial(x));
    return 0;
}
