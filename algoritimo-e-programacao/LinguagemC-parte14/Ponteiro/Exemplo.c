#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int main()
{
    int x;
    x=3;
    int *px; // *px ir� apontar para um valor do tipo int
    px=&x; // px ir� receber o endere�o de mem�ria em que ser� armazenado o valor de X
    printf("PX = %d, *PX = %d, X = %d, &X = %d", px, *px, x, &x);
    return 0;
}
