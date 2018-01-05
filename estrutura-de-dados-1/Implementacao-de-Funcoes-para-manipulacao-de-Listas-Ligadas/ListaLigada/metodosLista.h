#ifndef METODOSLISTA_H_INCLUDED
#define METODOSLISTA_H_INCLUDED
#include "structLista.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void fazListaVazia(TLista *listaX){
    TElemento *primeiroElemento = (TElemento *) malloc(sizeof(TElemento));
    (*listaX).pPrimeiro = primeiroElemento;
    (*primeiroElemento).pProxElemento = NULL;
    //strcpy((*primeiroElemento).item.String, NULL);
    //(*primeiroElemento).item.String = (char[])NULL;
    //(*primeiroElemento).item.valor = (int)NULL;
}

int listaEhVazia(TLista *listaX){
    TElemento *pElemento = (*listaX).pPrimeiro;
    if((*pElemento).pProxElemento==NULL){
        return 1;
    }else{
        return 0;
    }
}

void insereInicioLista(TLista *listaX, TElemento elementoX){
    TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
    TElemento *pPrimeiro = (*listaX).pPrimeiro;
    (*novo) = elementoX;
    (*novo).pProxElemento = pPrimeiro;
    (*listaX).pPrimeiro = novo;
}

void insereFinalLista(TLista *listaX, TElemento elementoX){
    TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
    (*novo) = elementoX;
    TElemento *elementoLista = (*listaX).pPrimeiro;
    while((*elementoLista).pProxElemento != NULL){
        elementoLista = (*elementoLista).pProxElemento;
    }
    (*novo).pProxElemento = NULL;
    (*elementoLista).pProxElemento = novo;
}

void retiraInicioLista(TLista *listaX){
    TElemento *pPrimeiro = (*listaX).pPrimeiro;
    TElemento *pSegundo = (*pPrimeiro).pProxElemento;
    //strcpy((*pSegundo).item.String, NULL);
    //(*pSegundo).item.String = NULL;
    //(*pSegundo).item.valor = (int)NULL;
    (*listaX).pPrimeiro = pSegundo;
}

void retiraFinalLista(TLista *listaX){
    TElemento *pPenultimo;
    TElemento *pUltimo;
    pUltimo = (*listaX).pPrimeiro;
    while((*pUltimo).pProxElemento!=NULL){
        pPenultimo = pUltimo;
        pUltimo = (*pUltimo).pProxElemento;
    }
    (*pPenultimo).pProxElemento = NULL;
}

int tamanhoLista(TLista *listaX){
    TElemento *elementoX = (*listaX).pPrimeiro;
    int i = 0;
    while((*elementoX).pProxElemento != NULL){
        i++;
        elementoX = (*elementoX).pProxElemento;
    }
    return i;
}

void imprimeLista(TLista *listaX){
    TElemento *elementoX = (*listaX).pPrimeiro;
    int i = 0;
    while((*elementoX).pProxElemento != NULL){
        elementoX = (*elementoX).pProxElemento;
        printf("Elemento [%d]\n", i);
        printf("String= %s\n", (*elementoX).item.String);
        printf("Valor= %d\n\n", (*elementoX).item.valor);
        i++;
    }
}

#endif // METODOSLISTA_H_INCLUDED
