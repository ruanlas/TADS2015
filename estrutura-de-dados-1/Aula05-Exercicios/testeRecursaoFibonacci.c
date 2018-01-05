#include<stdio.h>
#include<stdlib.h>

double fibonacci(int n){
    double resultado = 0;
    if(n==1||n==2){
        resultado = 1;
    }else{
        resultado = fibonacci(n-1)+fibonacci(n-2);
    }
    return resultado;
}
double fibonacci2(int n){
    double resultado = 0;
    if(n==0){
        resultado = 0;
    }else if (n==1){
        resultado = 1;
    }else if (n==2){
        resultado = 1;
    }else{
        resultado = fibonacci(n-1)+fibonacci(n-2);
    }
    return resultado;
}

int main(){

    printf("%.0f\n", fibonacci(6));
    printf("%.0f", fibonacci2(6));
    return 0;
}
