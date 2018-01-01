#include <string.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>



int Dec_Hex(int x)//função para conversão de decimal para hexadecimal
{
int quociente, resto;
if(x){
        resto=x%16; //X mod 16
		Dec_Hex(x/16); //chamada da função(função recursiva)-> ira chamar a função como parâmetro de entrada o resultado inteiro da divisão de X por 16
		switch (resto){
			case 10: putchar('A'); break;
			case 11: putchar('B'); break;
			case 12: putchar('C'); break;
			case 13: putchar('D'); break;
			case 14: putchar('E'); break;
			case 15: putchar('F'); break;
			default: putchar('0'+resto);
	}
}
}


int main()
{
    int x;
    printf("CONVERSAO - DECIMAL -> HEXADECIMAL\n----------------------------------\n");
    printf("Digite um valor em decimal: ");
    scanf("%d", &x);
    printf("\nO valor %d em Hexadecimal e ",x);
    Dec_Hex(x); // chamada da função para fazer a conversao
    printf("\n\n");
    system("PAUSE");
    return 0;
}
