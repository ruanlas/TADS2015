#include<stdio.h>
#include<stdlib.h>
#include "funList.h"
#include "lista.h"

int main(){
    TLista lista;
    TItem item;

    TLista_FazVazia(&lista);
    printf("Vazia? = %d\n", TLista_EhVazia(&lista));
    item.valor = 1;
    TLista_Insere(&lista, 3, item);
    item.valor = 2;
    TLista_Insere(&lista, 3, item);
    item.valor = 3;
    TLista_Insere(&lista, 3, item);
    item.valor = 4;
    TLista_Insere(&lista, 3, item);
    item.valor = 5;
    TLista_Insere(&lista, 3, item);
    item.valor = 6;
    TLista_Insere(&lista, 3, item);
    item.valor = 7;
    TLista_Insere(&lista, 3, item);
    item.valor = 8;
    TLista_Insere(&lista, 3, item);
    TLista_Imprime(&lista);
    printf("Tamanho da lista %d\n", TLista_Tamanho(&lista));
    printf("\nObjeto de Indice %d = %d\n\n", 5, TLista_Get(&lista, 5));
    TLista_Retira(&lista, 4);
    TLista_Retira(&lista, 4);
    TLista_Retira(&lista, 4);
    printf("Vazia? %d\n", TLista_EhVazia(&lista));
    TLista_Imprime(&lista);
    printf("Tamanho da lista %d\n", TLista_Tamanho(&lista));
    system("PAUSE");
}
