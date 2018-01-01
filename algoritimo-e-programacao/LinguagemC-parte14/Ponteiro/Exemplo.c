#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int main()
{
    int x;
    x=3;
    int *px; // *px irá apontar para um valor do tipo int
    px=&x; // px irá receber o endereço de memória em que será armazenado o valor de X
    printf("PX = %d, *PX = %d, X = %d, &X = %d", px, *px, x, &x);
    return 0;
}
