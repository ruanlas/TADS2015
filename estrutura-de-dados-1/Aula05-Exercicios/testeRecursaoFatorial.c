#include<stdio.h>
#include<stdlib.h>

double fatorial(int n){
    double resultado = 1;
    if(n==0 || n==1){
        resultado = 1;
    }else{
        if (n>0){
            resultado = n*fatorial(n-1);
        }else{
            resultado = -n*fatorial(n+1);
        }
    }
    return resultado;
}

int main(){

    printf("%.0f", fatorial(5));
    return 0;
}
