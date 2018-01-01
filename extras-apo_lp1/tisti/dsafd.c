#include <stdio.h>
#include <stdlib.h>
struct pessoa { // definição do tipo pessoa
int idade;
char trabalha;
char estuda;
};
int main(int argc, char *argv[])
{
struct pessoa A, B;
A.idade = 18;
A.trabalha = 's';
A.estuda = 'n';
B = A; //variavel B recebe todos os campos de A
printf ("Pessoa A: %d %c %c \n", A.idade, A.trabalha, A.estuda );
printf ("Pessoa B: %d %c %c \n", B.idade, B.trabalha, B.estuda );
system("PAUSE");
}
