#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>

int Euclides(int m, int n){
    int r;
    do{
        r = m%n;
        m = n;
        n = r;
    }while (r!=0);
    return m;
}
int MDC(int m, int n){
    if(m%n == 0){
        return n;
    }else{
        return MDC(n, m%n);
    }
}

int main(){

    printf("%d\n", Euclides(15,20));
    printf("%d\n", MDC(15,20));
    printf("%d", 15%20);
    return 0;
}
