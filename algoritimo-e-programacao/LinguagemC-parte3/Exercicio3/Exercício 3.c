#include<stdio.h>
#include<stdlib.h>
#include<math.h>

    int x,y,m,d ;
    float a,b;

int main()
{
    printf("Digite o Dividendo: ");
    scanf("%f",&a);
    printf("Digite o Divisor: ");
    scanf ("%f", &b);
    printf("\n");
    x = a;
    y = b;
    d=a/b;
    m=x%y;
    printf("Resultado= %d Resto= %d\n", d,m);
    return 0;
}
