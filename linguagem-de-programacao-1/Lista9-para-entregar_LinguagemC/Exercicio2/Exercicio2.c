#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<math.h>

void conversao(int x)
{
   int i,r;
   char hexa[10];
   i=x;
   while (i>0) {
    hexa=i%16;
    switch (hexa){
        case 10:
            strcat(hexa,"A");
            break;
        case 11:
            strcat(hexa,"B");
            break;
        case 12:
            strcat(hexa,"C");
            break;
        case 13:
            strcat(hexa,"D");
            break;
        case 14:
            strcat(hexa,"E");
            break;
        case 15:
            strcat(hexa,"F");
            break;
    }
    i=i/16;
   }
   printf("%s", hexa);
}


int main ()
{
    char hexa[10];
    int num;
    printf("Conversao de Bases\nDecimal para Hexadecimal\n");
    printf("Digite um numero decimal: ");
    scanf("%d", &num);
    conversao(num);
    return 0;
}
