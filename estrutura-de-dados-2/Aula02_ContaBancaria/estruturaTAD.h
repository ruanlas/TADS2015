#ifndef ESTRUTURATAD_H_INCLUDED
#define ESTRUTURATAD_H_INCLUDED
#include<stdio.h>
#include<stdlib.h>

typedef struct contaBancaria{
    int numeroConta;
    float saldo;
}contaBancaria;

void iniciarConta(contaBancaria *conta, int numeroConta, float saldoInicial){
    conta->numeroConta = numeroConta;
    conta->saldo = saldoInicial;
}
void depositar(contaBancaria *conta, float deposito){
    conta->saldo += deposito;
}
void sacar(contaBancaria *conta, float saque){
    conta->saldo -= saque;
}
void imprimirSaldo(contaBancaria *conta){
    printf("\nO saldo da conta: [ %d ] eh R$ %.2f\n\n", conta->numeroConta, conta->saldo);
}

#endif // ESTRUTURATAD_H_INCLUDED
