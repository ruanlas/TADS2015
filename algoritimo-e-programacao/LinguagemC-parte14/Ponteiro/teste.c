#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    int x;
    x=0;
    int *px;
    px=&x;
    printf("Digite um numero para ser armazenado em X: ");
    scanf("%d", px);
    printf("%d", x);

    return 0;
}
