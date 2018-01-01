#include <stdio.h>
#include <stdlib.h>
struct ponto { //definição do tipo ponto contendo 2 campos x e y
int x; // ou int x, y;
int y;
};
int main(int argc, char *argv[])
{
struct ponto P, M;
printf("Digite o ponto P: ");
scanf ("%d %d", &P.x, &P.y);
printf (" P = ( %d , %d ) \n", P.x, P.y);
printf(" \nDigite o ponto M: ");
scanf ("%d %d", &M.x, &M.y);
printf (" M = ( %d , %d ) \n", M.x, M.y);
system("PAUSE");
return 0;
}
