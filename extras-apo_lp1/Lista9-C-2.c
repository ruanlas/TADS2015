#include <string.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>


int Dec_Hex(int valor)
{
int quociente, resto;
	if(valor){ // =>  if(valor != 0) {
		quociente=valor / 16;
		resto=valor-quociente * 16;
		Dec_Hex(quociente);

		switch (resto){					     // O resto é um número hexadecimal
			case 10: putchar('A'); break;	 // por isso é preciso */
			case 11: putchar('B'); break;	 // escrever os */
			case 12: putchar('C'); break;	 // símbolos correctos. */
			case 13: putchar('D'); break;
			case 14: putchar('E'); break;
			case 15: putchar('F'); break;
			default: printf("%d", resto);	 // ou putchar('0'+resto);

		}
	}
}

int main(){
    int numero=0, op=0;

    do {
        system("cls");
        printf("\n******* Conversao de numero inteiro decimal em hexadecimal\n\n");
        printf("\n\n Entre com o numero..: ");
        scanf("%d", &numero);
        printf("\n\n O HEXADECIMAL resultante e..: ");
        Dec_Hex(numero);
        printf("\n\n");

        printf("\n*******************(1)Continuar, (2)Sair ..:  ");
        scanf("%d", &op);
    } while (op != 2);

    return 1;
}
