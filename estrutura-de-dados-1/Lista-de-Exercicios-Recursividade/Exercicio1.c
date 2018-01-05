#include<stdio.h>
#include<stdlib.h>

int calculoDaQuantidadeDeDigitosBinariosDeUmNumero(int n){
    if(n==1||n==0){
        return 1;
    }else{
        //A fun��o vai realizando a divis�o dentro dela mesma at� a divis�o n/2 = 1, onde neste caso ir� retornar 1
        //Desta forma,  todas as divis�es que foram feitas para se calcular o resultado ser� adicionado 1 a ela
        //e vai retornando o n�mero de divis�es por 2 que foram feitas at� chegar no resultado que ser� o numero de
        //d�gitos bin�rios que foram utilizados para efetuar este c�lculo
        return calculoDaQuantidadeDeDigitosBinariosDeUmNumero(n/2) + 1;
    }
}

int main(){
    int x = 0;
    printf("Digite um numero decimal: ");
    scanf("%d", &x);
    printf("O numero %d possui %d digitos binarios", x, calculoDaQuantidadeDeDigitosBinariosDeUmNumero(x));

    return 0;
}
