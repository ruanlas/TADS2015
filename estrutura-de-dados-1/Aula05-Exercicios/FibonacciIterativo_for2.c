#include<stdio.h>
#include<stdlib.h>

double fibonacci(int n){
    double resultado = 0, ultimoNumero = 1, penultimoNumero = 0, soma = 0;
    int i = 0;
    for(i = 0; i<=n; i++){
        if(i==0){
            soma = 0;
        }else if(i==1){
            soma = 1;
        }else{
            soma = ultimoNumero + penultimoNumero;
            penultimoNumero = ultimoNumero;
            ultimoNumero = soma;
        }
        resultado = soma;
    }
    return resultado;
}

int main(){

    printf("%.0f\n", fibonacci(6));
    return 0;
}
