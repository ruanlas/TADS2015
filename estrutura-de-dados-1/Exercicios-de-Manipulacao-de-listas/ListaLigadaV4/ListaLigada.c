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
    printf("\nTamanho da lista: %d\n", tamanhoLista(&listaX));
    printf("\nInserindo no final\n\n");
    elementoX.item.valor = 22;
    insereFinalLista(&listaX, elementoX);
    elementoX.item.valor = 27;
    insereFinalLista(&listaX, elementoX);
    elementoX.item.valor = 29;
    insereFinalLista(&listaX, elementoX);
    elementoX.item.valor = 23;
    insereFinalLista(&listaX, elementoX);
    imprimeLista(&listaX);
    printf("\nTamanho da lista: %d\n", tamanhoLista(&listaX));
    printf("Retirando itens da lista\n\n");
    retiraFinalLista(&listaX);
    retiraFinalLista(&listaX);
    retiraInicioLista(&listaX);
    imprimeLista(&listaX);
    printf("\nTamanho da lista: %d\n", tamanhoLista(&listaX));
    printf("Vazia? %d\n", listaEhVazia(&listaX));
    printf("\n\nOrganizando a Lista\n\n");
    ordenaLista(&listaX);
    imprimeLista(&listaX);
    system("PAUSE");
    return 0;
}
