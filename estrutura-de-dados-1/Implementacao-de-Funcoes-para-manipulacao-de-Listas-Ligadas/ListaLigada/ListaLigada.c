#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "metodosLista.h"
#include "structLista.h"

int main(){
    TElemento elementoX;
    TLista listaX;
    fazListaVazia(&listaX);
    printf("Vazia? %d\n", listaEhVazia(&listaX));
    imprimeLista(&listaX);
    elementoX.item.valor = 9;
    insereInicioLista(&listaX, elementoX);
    elementoX.item.valor = 10;
    insereInicioLista(&listaX, elementoX);
    elementoX.item.valor = 30;
    insereInicioLista(&listaX, elementoX);
    elementoX.item.valor = 19;
    insereInicioLista(&listaX, elementoX);
    imprimeLista(&listaX);
    printf("Retirando itens da lista\n\n");
    retiraFinalLista(&listaX);
    retiraFinalLista(&listaX);
    imprimeLista(&listaX);
    printf("Vazia? %d\n", listaEhVazia(&listaX));

    return 0;
}
