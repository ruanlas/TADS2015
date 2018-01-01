#include<stdio.h>
#include<stdlib.h>
#include<math.h>
// Cálculo de Fatorial sem recursão
long int fatorial(int x)
{
    int i;
    long int res;
    res=1;
    for (i=1; i<=x; i++){
        res=res*i;
    }
    return res;
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
