#include<stdio.h>
#include<stdlib.h>
#include "estruturaTAD.h"


int main(){
    contaBancaria conta;
    int numeroConta;
    float valor;
    printf("Digite o numero da conta: ");
    scanf("%d", &numeroConta);
    printf("Digite um valor para iniciar a conta: ");
    scanf("%f", &valor);
    iniciarConta(&conta, numeroConta, valor);
    printf("\n\nDigite um valor para deposito: ");
    scanf("%f", &valor);
    depositar(&conta, valor);
    printf("\n\nDigite um valor para saque: ");
    scanf("%f", &valor);
    sacar(&conta, valor);
    printf("\n\n---- Impressao de saldo ----\n\n");
    imprimirSaldo(&conta);


    return 0;
}

