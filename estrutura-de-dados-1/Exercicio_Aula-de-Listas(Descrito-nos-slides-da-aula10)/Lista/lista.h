#ifndef LISTA_H_INCLUDED
#define LISTA_H_INCLUDED

#include<stdio.h>
#include<stdlib.h>

#define INICIO 0
#define MAXTAM 1000

typedef struct{
    int valor;
}TItem;

typedef struct{
    TItem item[MAXTAM];
    int primeiro, ultimo;
}TLista;

#endif // LISTA_H_INCLUDED
