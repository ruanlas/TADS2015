#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<limits.h>
//total de n pessoas formando
//grupos com k pessoas por grupo

int Comb(int n, int k){
    if(n>=k){
        if(k==1){
            return n;
        }else if(k==n){
            return 1;
        } else{
            return Comb(n-1, k-1)+Comb(n-1, k);
        }
    }else{
        //considerando que a quantidade total de pessoas tem que ser maior ou igual
        //a quantidade de pessoas no grupo
        return 0;
    }

}
int main(){

    printf("%d\n", Comb(4,2));
    return 0;
}
