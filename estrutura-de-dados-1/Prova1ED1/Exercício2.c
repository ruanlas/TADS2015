#include<stdio.h>
#include<stdlib.h>
#include<math.h>

typedef struct{
	int numeroCompetidor;
	float alturaSalto1;
	float alturaSalto2;
}Competidor;

int maiorSalto(Competidor c[], int tam){
	float maior = 0;
	float maiorSalto = 0;
	int numeroJogadorComMaiorSalto = 0;
	int i = 0;
	for(i = 0; i < tam; i++){
		if(c[i].alturaSalto1>=c[i].alturaSalto2){
			maiorSalto = c[i].alturaSalto1;
		}else{
			maiorSalto = c[i].alturaSalto2;
		}
		if(maior >= maiorSalto){
			maior = maior;
		}else{
			maior = maiorSalto;
		}
	}
	
	for(i = 0; i < tam; i++){
		if(c[i].alturaSalto1==maior || c[i].alturaSalto2==maior){
			numeroJogadorComMaiorSalto = c[i].numeroCompetidor;
		}
	}
	return numeroJogadorComMaiorSalto;
}

int main(){
	Competidor competidor[3];
	int i = 0;
	for(i = 0; i < 3; i++){
		printf("Digite o numero do competidor: ");
		scanf("%d", &competidor[i].numeroCompetidor);
		printf("Digite a altura do primeiro salto do competidor: ");
		scanf("%f", &competidor[i].alturaSalto1);
		printf("Digite a altura do segundo salto do competidor: ");
		scanf("%f", &competidor[i].alturaSalto2);
	}
	printf("\n\nO vencedor da prova e o competidor de numero %d", maiorSalto(competidor, 3));
	
	return 0;
}
