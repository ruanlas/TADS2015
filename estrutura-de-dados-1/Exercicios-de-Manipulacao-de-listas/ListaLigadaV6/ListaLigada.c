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
    //Exercícios 1 e 2
    printf("\n\nOrganizando a Lista\n\n");
    ordenaLista4(&listaX);
    imprimeLista(&listaX);
    elementoX.item.valor = 1;
    printf("Inserindo ordenado\n\n");
    insereOrdenado(&listaX, elementoX);
    imprimeLista(&listaX);
    //Exercícios 3
    TLista listaA;
    TLista listaB;
    //inserindo na listaA
    elementoX.item.valor = 1;
    insereInicioLista(&listaA, elementoX);
    elementoX.item.valor = 3;
    insereInicioLista(&listaA, elementoX);
    elementoX.item.valor = 4;
    insereInicioLista(&listaA, elementoX);
    elementoX.item.valor = 5;
    insereInicioLista(&listaA, elementoX);
    elementoX.item.valor = 9;
    insereInicioLista(&listaA, elementoX);
    elementoX.item.valor = 7;
    insereInicioLista(&listaA, elementoX);
    //Inserindo na listaB
    elementoX.item.valor = 6;
    insereInicioLista(&listaB, elementoX);
    elementoX.item.valor = 1;
    insereInicioLista(&listaB, elementoX);
    elementoX.item.valor = 7;
    insereInicioLista(&listaB, elementoX);
    elementoX.item.valor = 4;
    insereInicioLista(&listaB, elementoX);
    //União
    printf("\n\nExercício 3\n\n");
    printf("ListaA\n\n");
    imprimeLista(&listaA);
    printf("ListaB\n\n");
    imprimeLista(&listaB);
    printf("Uniao\n\n");
    uniao(&listaA, &listaB);
    printf("\n\nInterseccao\n\n");
    interseccao(&listaA, &listaB);
    printf("\n\nDiferenca\n\n");
    diferenca(&listaA, &listaB);
    system("PAUSE");
    return 0;
}
