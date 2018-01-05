#ifndef FILASTRUCT_H_INCLUDED
#define FILASTRUCT_H_INCLUDED
#include<stdio.h>
#include<stdlib.h>

typedef struct Item{
    int valor;
}Item;

typedef struct Elemento{
    Item item;
    struct Elemento *pProxElemento;
}Elemento;

typedef struct Fila{
    Elemento *pInicio, *pFinal;
}Fila;

#endif // FILASTRUCT_H_INCLUDED
