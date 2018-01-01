#include<stdio.h>

int main()
{
    FILE*arq;
    int numero, soma=0;
    arq=fopen("numeros.txt", "r");
    while (fscanf(arq,"%d", &numero)!= EOF){
        soma=soma+numero;
    }
    printf("A soma e: %d\n", soma);
    fclose(arq);
    return 0;
}
