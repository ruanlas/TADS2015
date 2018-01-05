#include<stdio.h>
#include<stdlib.h>

int main(){
    int i = 0;
    int n = 6;
    int fibonacci = 0, ultimoNumero = 1, penultimoNumero = 0, soma = 0;
    for(i = 0; i <= n; i++){
            if(i==0){
                soma = 0;
            }else if(i==1){
                soma = 1;
            }else{
                soma = ultimoNumero + penultimoNumero;
                penultimoNumero = ultimoNumero;
                ultimoNumero = soma;
            }
        fibonacci = soma;
    }
    printf("%d", fibonacci);
    return 0;
}
