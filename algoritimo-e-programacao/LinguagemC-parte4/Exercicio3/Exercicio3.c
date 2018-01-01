#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    int lado1, lado2, lado3;
    printf("Classificacao de triangulos\n");
    printf("Digite os tres lados do triangulo: \n");
    scanf("%d %d %d", &lado1, &lado2, &lado3);

    if (lado1==lado2 && lado2==lado3){
        printf(" Lado 1 = %d \n Lado 2 = %d \n Lado 3 = %d \n Triangulo Equilatero!!\n", lado1, lado2, lado3);
    } else if (lado1==lado2 || lado2==lado3 || lado3==lado1){
        printf(" Lado 1 = %d \n Lado 2 = %d \n Lado 3 = %d \n Triangulo Isosceles!!\n", lado1, lado2, lado3);
    } else {
        printf(" Lado 1 = %d \n Lado 2 = %d \n Lado 3 = %d \n Triangulo Escaleno!!\n", lado1, lado2, lado3);
    }
    return 0;
}
