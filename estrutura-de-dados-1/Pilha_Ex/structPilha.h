#ifndef STRUCTPILHA_H_INCLUDED
#define STRUCTPILHA_H_INCLUDED
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
    TElemento *pTopo, *pUltimo;
}TPilha;

#endif // STRUCTLISTA_H_INCLUDED
