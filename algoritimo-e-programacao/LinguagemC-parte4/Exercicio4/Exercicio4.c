#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int main()
{
    float peso, imc, altura;

    printf("Calculo do IMC\n");
    printf("Digite sua altura: ");
    scanf("%f", &altura);
    printf("Digite seu peso: ");
    scanf("%f", &peso);

    imc = peso /pow(altura, 2); // pow (x,Y) -> devolve X^Y
    printf(" O seu IMC e %.3f\n", imc);

    if (imc < 18.5){
        printf("Voce esta abaixo do peso\n");
    } else if (imc >= 18.5 && imc <= 24.9){
        printf("Voce esta com o peso normal\n");
    } else if (imc >=25 && imc <= 29.9 ){
        printf("Voce esta com excesso de peso\n");
    }
    return 0;
}
