#ifndef ARVORE_H_INCLUDED
#define ARVORE_H_INCLUDED

#include<stdio.h>
#include<stdlib.h>

typedef struct Arvore{
    int info;
    Arvore* avDr;
    Arvore* avEs;
}Arvore;

#endif // ARVORE_H_INCLUDED
