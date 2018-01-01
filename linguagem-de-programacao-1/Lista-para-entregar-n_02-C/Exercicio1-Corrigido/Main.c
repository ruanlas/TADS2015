#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	float resultado, valor, subtotal, comparativo;
	int qtd;
	comparativo = 555.55;
	printf("Calculo da diferenca de um valor para um inteiro mais proximo\n\n");
	qtd = 0;
	valor = 1;
	subtotal = 0;
	while (valor != comparativo){ // Não rodou colocando valor != 555.55
		printf("Digite o Valor: R$ ");
		scanf("%f", &valor);


		if (valor == trunc(valor)) {
			resultado = 0;
		}
		else {
			resultado = 1 - (valor - trunc(valor));
			printf("A diferenca e de: %.2f\n", resultado); // %.(numero)f - o número diz quantas casas decimais vc quer exibir
		}
		subtotal = subtotal + resultado;
		qtd = qtd + 1;
		printf("Subtotais: R$ %.2f \n\n", subtotal);
	}
	printf("Quantidade de valores digitados: %d\n", qtd);
	printf("Valor total das diferecas: R$ %.2f\n", subtotal);


	system("PAUSE>>NULL");
	return 0;
}