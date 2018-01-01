int main( )
{
 int num, soma;
 soma = 0;
 num = 1;
 while (num < 10) {
 soma = soma + num; // equivalente a: soma += num;
 printf ("Numero = %d \n", num);
 num +=2 ; // equivalente a num = num + 2
 }
 printf ("Soma = %d \n", soma);
 system("PAUSE");
 return 0;
 }
