#include<stdio.h>
#include<stdlib.h>
#include<math.h>

float somaSequencia(int n){
	int i = 1;
	float soma = 0;
	float sequencia = 0;
	for(i = 1; i <= n; i++){

		soma = soma + ((float)(pow(i, 2) +1) /(i+3));

	}
	return soma;
}
int main(){
	int n = 0;
	printf("Digite um numero para ser calculado a soma de acordo com a sequencia\n");
	printf("(n^2)+1/n+3 \n");
	scanf("%d", &n);
	printf("A somatoria da sequencia e igual a : %f", somaSequencia(n));
	return 0;
}
