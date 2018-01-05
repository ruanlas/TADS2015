#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "metodosFila.h"
#include "structFila.h"

int main(){
    TElemento elementoX;
    TFila filaX;

    fazFilaVazia(&filaX);
    printf("Inserindo itens no início\n\n");
    elementoX.item.valor = 1;
    insereInicioFila(&filaX, elementoX);
    elementoX.item.valor = 2;
    insereInicioFila(&filaX, elementoX);
    elementoX.item.valor = 3;
    insereInicioFila(&filaX, elementoX);
    elementoX.item.valor = 4;
    insereInicioFila(&filaX, elementoX);
    elementoX.item.valor = 5;
    insereInicioFila(&filaX, elementoX);
    elementoX.item.valor = 6;
    insereInicioFila(&filaX, elementoX);
    elementoX.item.valor = 7;
    insereInicioFila(&filaX, elementoX);
    imprimeFila(&filaX);
    printf("Removendo 3 itens do final\n\n");
    retiraFinalFila(&filaX);
    retiraFinalFila(&filaX);
    retiraFinalFila(&filaX);
    imprimeFila(&filaX);
    system("PAUSE");
    return 0;
}
