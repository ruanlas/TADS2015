#include<stdio.h>
#include<stdlib.h>
#include "filaStruct.h"
#include"funcoesFila.h"


int main(){
    Fila testeFila;
    Item item;
    fazFilaVazia(&testeFila);
    item.valor = 1;
    insereFinalFila(&testeFila, item);
    item.valor = 2;
    insereFinalFila(&testeFila, item);
    item.valor = 3;
    insereFinalFila(&testeFila, item);
    item.valor = 4;
    insereFinalFila(&testeFila, item);
    item.valor = 5;
    insereFinalFila(&testeFila, item);
    item.valor = 6;
    insereFinalFila(&testeFila, item);
    item.valor = 7;
    insereFinalFila(&testeFila, item);
    printf("\n\nImprimindo Fila\n\n");
    imprimeFila(&testeFila);
    retiraInicioFila(&testeFila, &item);
    printf("\n\nItem retirado: %d\n", item.valor);
    printf("\Imprimindo Fila\n\n");
    imprimeFila(&testeFila);
    retiraInicioFila(&testeFila, &item);
    printf("\n\nItem retirado: %d\n", item.valor);
    printf("Imprimindo Fila\n\n");
    imprimeFila(&testeFila);
    item.valor = 8;
    insereFinalFila(&testeFila, item);
    item.valor = 9;
    insereFinalFila(&testeFila, item);
    printf("\n\nInserindo elementos no final\n");
    printf("Imprimindo Fila\n\n");
    imprimeFila(&testeFila);
    return 0;
}
