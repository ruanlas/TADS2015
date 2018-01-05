#include<stdio.h>
#include<stdlib.h>
//intervalo de m até n, ou de n até m
int somar(int n, int m){
    int soma = 0;
    if(n==m){
        soma = m;
    }else{
        if(m<n){
                //caso n > m
            soma = n + somar((n-1),m);
        }else{
            //caso m > n
            soma = n + somar((n+1),m);
        }
    }
    return soma;
}

int main(){

    printf("%d\n", somar(5,1));
    printf("%d", somar(1,5));
    return 0;
}
