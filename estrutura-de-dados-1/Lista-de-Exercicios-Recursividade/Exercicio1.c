#include<stdio.h>
#include<stdlib.h>

int calculoDaQuantidadeDeDigitosBinariosDeUmNumero(int n){
    if(n==1||n==0){
        return 1;
    }else{
        //A função vai realizando a divisão dentro dela mesma até a divisão n/2 = 1, onde neste caso irá retornar 1
        //Desta forma,  todas as divisões que foram feitas para se calcular o resultado será adicionado 1 a ela
        //e vai retornando o número de divisões por 2 que foram feitas até chegar no resultado que será o numero de
        //dígitos binários que foram utilizados para efetuar este cálculo
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
