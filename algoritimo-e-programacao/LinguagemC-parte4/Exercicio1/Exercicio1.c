#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>


int main()
{
    int x,y, soma;

    printf("Digite dois numeros inteiros: \n");
    scanf("%d %d", &x, &y);

    soma = (x+y)%3;
    if ( soma == 0){
        printf("A soma desses numeros ( %d + %d ) e multiplo de 3\n", x,y);
    } else {
        printf("A soma desses numeros( %d + %d ) nao e multiplo de 3\n", x,y);
    }
    return 0;
}
