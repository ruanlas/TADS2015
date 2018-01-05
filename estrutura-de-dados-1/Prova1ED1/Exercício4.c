#include<stdio.h>
#include<stdlib.h>
#include<math.h>

float somaSequencia(int n){
	if(n==1){
		return 0.5;
	}else{
		return ((float)(pow(n, 2) +1) /(n+3)) + somaSequencia(n-1);
	}
}
int main(){
	int n = 0;
	printf("Digite um numero para ser calculado a soma de acordo com a sequencia\n");
	printf("(n^2)+1/n+3 \n");
	scanf("%d", &n);
	printf("A somatoria da sequencia e igual a : %f", somaSequencia(n));
	return 0;
}
