#ifndef PILHASTRUCT_H_INCLUDED
#define PILHASTRUCT_H_INCLUDED
#include<stdio.h>
#include<stdlib.h>

typedef struct Item{
    int valor;
}Item;

typedef struct Elemento{
    Item item;
    struct Elemento *pProxElemento;
}Elemento;

typedef struct Pilha{
    Elemento *pTopo, *pFinal;
}Pilha;

#endif // PILHASTRUCT_H_INCLUDED
