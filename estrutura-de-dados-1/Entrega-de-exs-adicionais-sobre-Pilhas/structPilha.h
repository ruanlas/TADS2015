#ifndef STRUCTPILHA_H_INCLUDED
#define STRUCTPILHA_H_INCLUDED

typedef struct{
    int valor;
}Item;

typedef struct Elemento{
    Item item;
    struct Elemento *pProxElemento;
}Elemento;

typedef struct{
    Elemento *pTopo, *pFinal;
}Pilha;

#endif // STRUCTPILHA_H_INCLUDED
