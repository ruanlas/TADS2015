#include <string.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int Dec_Hex(int valor)
{
int quociente, resto;
	if(valor){
		quociente=valor / 16;

		resto=valor-quociente * 16;
		//quociente = valor % 16;
		Dec_Hex(quociente);

		switch (resto){					   // O resto é um número hexadecimal
			case 10: putchar('A'); break;	 // por isso é preciso */
			case 11: putchar('B'); break;	 // escrever os */
			case 12: putchar('C'); break;	 // símbolos correctos. */
			case 13: putchar('D'); break;
			case 14: putchar('E'); break;
			case 15: putchar('F'); break;
			default: printf("%d", resto);	 // ou putchar('0'+resto);

		}
// O switch acima poderia ser substituído pelas seguintes instruções:
// resto += ((resto <= 9) ? '0' : 'A'-10);
// putchar(resto);
	}
}

int main()
{
    int x;
    printf("Digite um numero inteiro: \n");
    scanf("%d", &x);
    printf("%d", Dec_Hex(x));
    return 0;
}
