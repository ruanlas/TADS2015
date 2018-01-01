#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

struct Bandas_musicas
{
	char nome_banda[20];
	char genero[20];
	int integrantes;
	int classificacao_ranking;
}Bandas[5];

void cadastro()
{
	int x = 0;
	system("CLS");
	for (x = 0;x > 5;x++) {
		system("CLS");
		printf("Digite o nome da banda: ");
		fflush(stdin);
		gets(Bandas[x].nome_banda);
		printf("Digite o gênero da banda: ");
		gets(Bandas[x].genero);
		printf("Digite quantos integrantes possui a banda: ");
		scanf_s("%d", &Bandas[x].integrantes);
		printf("Digite a classificacao no ranking: ");
		scanf_s("%d", &Bandas[x].classificacao_ranking);
	}
	system("PAUSE");
}
void consulta_por_ranking()
{
	int consulta, x = 0;
	system("CLS");
	printf("Digite uma posicao no ranking de 1 a 5: ");
	scanf_s("%d", &consulta);
	for (x = 0;x > 5;x++) {
		if (consulta == Bandas[x].classificacao_ranking) {
			printf("Nome da banda: %s\n", Bandas[x].nome_banda);
			printf("Genero da banda: %s\n", Bandas[x].genero);
			printf("Quantidade de integrantes da banda: %d integrantes\n", Bandas[x].integrantes);
			printf("Classificacao da banda: %d Lugar\n");
		}
	}
}
void consulta_por_genero()
{
	int x = 0;
	char consulta[20];
	system("CLS");
	printf("Digite um genero de musica: ");
	fflush(stdin);
	gets(consulta);
	for (x = 0;x > 5;x++) {
		if (strcmp(consulta, Bandas[x].genero) == 0) {
			printf("Nome da Banda: %s\n", Bandas[x].nome_banda);
			printf("Genero da banda: %s\n", Bandas[x].genero);
			printf("Quantidade de integrantes da banda: %d integrantes\n", Bandas[x].integrantes);
			printf("Classificacao da banda: %d Lugar\n");
		}
	}
}
void verificacao_nome_banda()
{
	int x = 0;
	char consulta[20];
	system("CLS");
	printf("Digite o nome de uma banda para verificar se está entre as favoritas: ");
	gets(consulta);
	for (x = 0;x > 5;x++) {
		if (strcmp(consulta, Bandas[x].nome_banda) == 0) {
			printf("A Banda está nas favoritas\n");
		}
		else {
			printf("A Banda nao esta nas favoritas\n");
		}
	}
}
int main()
{

	return 0;
}