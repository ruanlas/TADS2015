//Conjunto de Bibliotecas utilizadas pelo sistema

#include <string.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#define SAIR		 0
#define BINARIO	  2
#define OCTAL		8
#define HEXADECIMAL 16
#define DECIMAL	 10

// Vari�veis globais
float r,a,b;
char tecla;

// Principais fun��es do sistema
int rotadicao(void);
int rotsubtracao(void);
int rotmultiplicacao(void);
int rotdivisao(void);
void entrada(void);
void saida(void);
int ler();
void Dec_Bin(int valor);
int Dec_Oct(int valor);
int Dec_Hex(int valor);
void converter_bases(void);
void bin_dec(void);




// Fun��o principal ou de execu��o
int main()
{
  int opcao = 0;

  while (opcao != 6)
  {
	puts("\n\nMenu Principal\n");
	puts("----------------\n\n");
	puts("1 - Adicao\n");
	puts("2 - Subtracao\n");
	puts("3 - Multiplicacao\n");
	puts("4 - Divisao\n");
	puts("5 - Cientifica\n");
	puts("6 - Fim de Programa\n\n");
	printf("Escolha uma opcao: ");
	fflush(stdin);
	scanf("%d",&opcao);

	if (opcao !=6)
	{
	  switch (opcao)
	  {
		case 1:
		  rotadicao();
		  break;

		case 2:
		  rotsubtracao();
		  break;

		case 3:
		  rotmultiplicacao();
		  break;

		case 4:
		  rotdivisao();
		  break;
		case 5:
  //Limpando a tela e chamando o Menu Cientifica
		  system("cls");
		  converter_bases();
		  break;
		default:
		  printf("Opcao invalida - Tecle <Enter>: ");

		  fflush(stdin);
		  while ((tecla = getchar()) != '\r')
			break;

	  }
	}
  }
  return(0); // retorna 0 para o S.O
}

void entrada(void)
{
  printf("Informe o valor de A: ");
  fflush(stdin);
  scanf("%f",&a);
  printf("Informe o valor de B: ");
  fflush(stdin);
  scanf("%f",&b);
  return; // Retorna valor indefinido para fun��o chamadora - main()
}

void saida(void)
{
  printf("\nO resultado entre A e B = %6.2f \n",r);
  printf("\nTecle <Enter> para acessar o menu: ");
  fflush(stdin);
  while ((tecla = getchar()) != '\r')
  return;



}

float calculo(float x, float y, char operador)
{
  float resultado;

  switch (operador)
  {
	case '+' :
	  resultado = x + y;
	  break;

	case '-' :
	  resultado = x - y;
	  break;

	case '*' :
	  resultado = x * y;
	  break;

	case '/' :
	  resultado = x / y;
	  break;
  }
  return (resultado);
}

int rotadicao(void)
{
  printf("\n\nRotina de Adicao\n");
  printf("------------------\n\n");
  entrada();
  r = calculo(a,b,'+');
  saida();
  return(0);
}

int rotsubtracao(void)
{
  printf("\n\nRotina de Subtracao\n");
  printf("---------------------\n\n");
  entrada();
  r = calculo(a,b,'-');
  saida();
  return(0);
}

int rotmultiplicacao(void)
{
  printf("\n\nRotina de Multiplicacao\n");
  printf("-------------------------\n\n");
  entrada();
  r = calculo(a,b,'*');
  saida();
  return(0);
}

int rotdivisao(void)
{
  printf("\n\nRotina de Divisao\n");
  printf("-------------------\n\n");
  entrada();

  if (b == 0)
  {
	printf("\nErro de divisao\n");
	printf("\nTecle <Enter> para acessar o menu: ");
	fflush(stdin);
	while ((tecla = getchar()) != '\r')
	return(0);
  }
  else
  {
	r = a / b;
	saida();
  }
  return(0);
}

/*
 * ler
 *
 *  Esta funcao mostra um menu de comandos e le a escolha  do utilizador.
 *  Enquanto o utilizador nao der um comando certo a funcao insiste com o menu.
*/
int ler()
//void ler(void)
{
int resultado;
char valor;
	resultado=-1;
	while (resultado == -1 ) {
		putchar('\n');
		puts("\nMenu Cientifica\n");
		puts("----------------\n\n");
		puts("S- Sair\n");
		puts("B- Escrever valor em Binario\n");
		puts("H- Escrever valor em Hexadecimal\n");
		puts("O- Escrever valor em Octal\n");
		puts("D- Escrever Binarios/Decimal\n");
		puts("X- Escrever Hexadecimal/Decimal\n");
		puts("L- Ler numero em decimal para converter\n\n");
		scanf(" %c", &valor);
		switch (valor){
			case 'S':
			case 's':	resultado=SAIR;

	//Limpando a tela e voltando ao Menu Principal
			system("cls");
				break;
			case 'B':
			case 'b':	resultado=BINARIO;
				break;
			case 'H':
			case 'h':	resultado=HEXADECIMAL;
				break;
			case 'O': case 'o': resultado=OCTAL;
				break;
			case 'D': case 'd': resultado=DECIMAL;
				break;
				saida();
		}
	}
	//Devolvendo o  valor da fun��o

	return(resultado);

}

/*
 * Dec_Bin
 *
 *  Esta fun��o tem como entrada um valor em Decimal e
 *  converte esse n�mero para Bin�rio.
 *  A convers�o � feita atrav�s das divis�es sucessivas.
 *  A fun��o � recursiva (chama-se a si mesma), porque �
 *  necess�rio dividir primeiro e s� depois � que se podem
 *  escrever os valores na ordem inversa;
 *  A recursividade termina quando o valor a dividir for 0.
 *  Nessa altura a fun��o retorna ao local de onde foi chamada
 *  e escreve o valor do resto;
*/
void Dec_Bin(int valor)
{
int quociente, resto;
	if(valor != 0){
		quociente=valor / 2;
		resto=valor-quociente * 2;
		Dec_Bin(quociente);
		printf("%d", resto);
	}
}
/*
 * Dec_Oct
 *
 * Esta fun��o tem como entrada um valor em Decimal e converte esse
 * n�mero para Octal.
 * A convers�o � feita atrav�s das divis�es sucessivas.
 * A fun��o � recursiva (chama-se a si mesma), porque � necess�rio
 * dividir primeiro e s� depois � que se podem escrever os valores na ordem inversa;
 * A recursividade termina quando o valor a dividir for 0. Nessa
 * altura a fun��o retorna ao local de onde foi chamada e escreve o valor do resto;
 * O uso do atributo register faz com que a vari�vel quociente
 * fique associada a um registo e como consequ�ncia uma rapidez no c�lculo.
 * Ao utilizar o shift << e >> de 3, faz com que as opera��es de
 * divis�o e de muiltiplica��o se tornem muito mais r�pidas.
 * Isto acontece porque 8 = 2^3
*/
int Dec_Oct(int valor)
{
register int quociente;
/* if ( (quociente = ( valor / 8)) != 0 ) */
/*  a fun��o devolve um inteiro  */
/* return( valor - (quociente * 8) ) */
if(quociente=(valor >> 3))
printf("%d", Dec_Oct(quociente));
  return(valor-(quociente << 3));
}

/*
 * Dec_Hex
 *
 * Esta fun��o tem como entrada um valor em Decimal e  converte esse n�mero
 * para Hexadecimal. A convers�o � feita atrav�s das divis�es sucessivas.
 * A fun��o � recursiva (chama-se a si mesma), porque � necess�rio dividir
 * primeiro e s� depois � que se podem escrever os valores na ordem inversa;
 * A recursividade termina quando o valor a dividir for 0.
 * Nessa altura a fun��o retorna ao local de onde foi chamada  e escreve
 * o valor do resto;
*/
int Dec_Hex(int valor)
{
int quociente, resto;
	if(valor){
		quociente=valor / 16;
		resto=valor-quociente * 16;
		Dec_Hex(quociente);

		switch (resto){					   // O resto � um n�mero hexadecimal
			case 10: putchar('A'); break;	 // por isso � preciso */
			case 11: putchar('B'); break;	 // escrever os */
			case 12: putchar('C'); break;	 // s�mbolos correctos. */
			case 13: putchar('D'); break;
			case 14: putchar('E'); break;
			case 15: putchar('F'); break;
			default: printf("%d", resto);	 // ou putchar('0'+resto);

		}
// O switch acima poderia ser substitu�do pelas seguintes instru��es:
// resto += ((resto <= 9) ? '0' : 'A'-10);
// putchar(resto);
	}
}

//Convers�o de BInarios para Decimal

void bin_dec(void)

{
		//Declara��o das vari�veis do Sistema

			 int pos, decimal=0;
			 char numb[17];
			 int cont=0;
		//Recebendo dados do Usu�rio

			 printf("Digite um numero Binario qualquer");
			 scanf("%s",numb);
		//Processamento da informa��o
			 for (pos=strlen(numb) -1; pos >=0; pos--)
			 decimal=decimal + (numb[cont++] - '0')*pow(2,pos);
		//Exibindo a informa��o
			 printf("Seu numero Binario em Decimal eh: %d\n\n", decimal);

}
void converter_bases(void)
{
int oper=DECIMAL, numero;
	printf("Digite o Numero desejado e selecione uma Opcao no Menu abaixo: \n\n");
	while (oper != SAIR){
		switch (oper){
			//printf("O Numero digitado na Base solicitada eh: ");
			case 2: Dec_Bin(numero); break;
			case 8: printf("%d", Dec_Oct(numero)); break;
			case 16: Dec_Hex(numero); break;
			case 10: scanf("%d", &numero); break;


		}

		oper=ler();
		printf("\n\n O Numero digitado na Base solicitada eh: ");
	}

}
