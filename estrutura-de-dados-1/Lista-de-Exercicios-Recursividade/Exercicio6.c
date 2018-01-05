#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>

float Serie(float n){
    if(n==1){
        return 2;
    }else{
        return (((1+(n*n))/n) + Serie(n-1));
    }
}

float Serie2(float n){
    if(n==1){
        return 2;
    }else{
        return (((1+pow(n,2))/n) + Serie(n-1));
    }
}

int main(){

    printf("%f\n", Serie(3));
    printf("%f\n", Serie2(3));

    return 0;
}
