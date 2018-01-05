#include<stdio.h>
#include<stdlib.h>
#include "pilhaStruct.h"
#include"funcoesPilha.h"


int main(){
    Pilha P1;
    Pilha P2;
    Pilha PR;
    Item item;
    fazPilhaVazia(&P1);
    fazPilhaVazia(&P2);
    fazPilhaVazia(&PR);
    item.valor = 1;
    insereInicioPilha(&P1, item);
    item.valor = 3;
    insereInicioPilha(&P1, item);
    item.valor = 5;
    insereInicioPilha(&P1, item);
    printf("\n\nImprimindo P1\n\n");
    imprimePilha(&P1);
    item.valor = 2;
    insereInicioPilha(&P2, item);
    item.valor = 4;
    insereInicioPilha(&P2, item);
    item.valor = 6;
    insereInicioPilha(&P2, item);
    printf("\n\nImprimindo P2\n\n");
    imprimePilha(&P2);
    printf("\n\nImprimindo PR\n\n");
    //Intercalando a pilha
    intercalaPilha(&P1, &P2, &PR);
    imprimePilha(&PR);
    return 0;
}
