#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "metodosPilha.h"
#include "structPilha.h"

int main(){
    TElemento elementoX;
    TPilha pilhaX;
    TItem busca;

    fazPilhaVazia(&pilhaX);
    printf("Vazia? %d\n", pilhaEhVazia(&pilhaX));
    imprimePilha(&pilhaX);
    elementoX.item.valor = 1;
    insereInicioPilha(&pilhaX, elementoX);
    elementoX.item.valor = 9;
    insereInicioPilha(&pilhaX, elementoX);
    elementoX.item.valor = 4;
    insereInicioPilha(&pilhaX, elementoX);
    elementoX.item.valor = 5;
    insereInicioPilha(&pilhaX, elementoX);
    elementoX.item.valor = 7;
    insereInicioPilha(&pilhaX, elementoX);
    elementoX.item.valor = 3;
    insereInicioPilha(&pilhaX, elementoX);
    elementoX.item.valor = 2;
    insereInicioPilha(&pilhaX, elementoX);
    printf("\n\n\n");
    imprimePilha(&pilhaX);
    retiraInicioPilha(&pilhaX);
    retiraInicioPilha(&pilhaX);
    retiraInicioPilha(&pilhaX);
    printf("\n\n\n");
    imprimePilha(&pilhaX);
    ordenaPilha(&pilhaX);
    printf("\n\n\n");
    imprimePilha(&pilhaX);
    busca.valor = 9;
    printf("Busca de item de valor 7: [%d]", buscaItemPilha(&pilhaX, busca));

    system("PAUSE");
    return 0;
}
