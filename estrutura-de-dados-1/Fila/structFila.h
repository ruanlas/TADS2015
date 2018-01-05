#ifndef STRUCTFILA_H_INCLUDED
#define STRUCTFILA_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    char String[30];
    int valor;
}TItem;

typedef struct elemento{
    struct elemento *pProxElemento;
    TItem item;
}TElemento;

typedef struct{
    TElemento *pPrimeiro, *pUltimo;
}TFila;

#endif // STRUCTLISTA_H_INCLUDED
