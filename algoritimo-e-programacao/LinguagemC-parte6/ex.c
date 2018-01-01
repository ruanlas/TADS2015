#include <stdio.h>
int EPar (int a) {
 if (a%2)//==1 /* Verifica se a e divisível por dois */
 return 0; /* Retorna 0 se não for divisível, ou seja, se o resto for diferente de 0 */
 else
 return 1; /* Retorna 1 se for divisível , ou seja, se o resto for 0*/
}
int main ()
{
 int num;
 printf ("Entre com numero: ");
 scanf ("%d",&num);
 if (EPar(num))// == 1
 printf ("\n\nO numero e par.\n"); // se retorna 1

 else
 printf ("\n\nO numero e impar.\n"); // se retorna 0

 return 0;
}
