#ifndef METODOSFILA_H_INCLUDED
#define METODOSFILA_H_INCLUDED
#include "structFila.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <limits.h>
/*
Precisa tratar as alocações de memória caso o malloc() retorne um ponteiro NULL
*/
/**Foi retirado o cabeçalho desta fila**/
void fazFilaVazia(TFila *filaX){
    //O endereço do primeiro elemento da fila recebe NULL (fila vazia)
    (*filaX).pPrimeiro = NULL;
    //O ultimo elemento da fila também recebe NULL
    (*filaX).pUltimo = NULL;
}

int filaEhVazia(TFila *filaX){
    //verifica se o primeiro elemento da fila aponta para NULL
    if((*filaX).pPrimeiro==NULL){
        return 1;
    }else{
        return 0;
    }
}

void insereInicioFila(TFila *filaX, TElemento elementoX){
    if((*filaX).pUltimo==NULL){//verifica se o apontador para o ultimo elemento da fila é NULL (fila vazia)
        TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
        //O conteúdo apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = NULL;
        //novo->pProxElemento
        //O cabeçaljo parra a apontar para o novo elemento, que passará a ser o primeiro
        (*filaX).pPrimeiro = novo;
        (*filaX).pUltimo = novo;
    }else{
        TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
        TElemento *pPrimeiro = (*filaX).pPrimeiro;
        //O conteúdo apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = pPrimeiro;
        //novo->pProxElemento
        //O cabeçaljo parra a apontar para o novo elemento, que passará a ser o primeiro
        (*filaX).pPrimeiro = novo;
    }

}

void retiraFinalFila(TFila *filaX){
    TElemento *pPenultimo;
    TElemento *pUltimo;
    pUltimo = (*filaX).pPrimeiro;
    while((*pUltimo).pProxElemento!=NULL){
        pPenultimo = pUltimo;
        pUltimo = (*pUltimo).pProxElemento;
    }
    (*pPenultimo).pProxElemento = NULL;
    (*filaX).pUltimo = pPenultimo;
    //libera a memória alocada para o ultimo
    free(pUltimo);
}

int tamanhoFila(TFila *filaX){
    TElemento *elementoX = (*filaX).pPrimeiro;
    int i = 0;
    if((*filaX).pPrimeiro == NULL){//verifica se a fila é vazia
        i = 0;
    }else{
        while(elementoX != NULL){
            i++;
            elementoX = (*elementoX).pProxElemento;
        }
    }
    return i;
}

void imprimeFila(TFila *filaX){
    TElemento *elementoX = (*filaX).pPrimeiro;
    int i = 0;
    while(elementoX != NULL){
        printf("Elemento [%d]\n", i);
        printf("String= %s\n", (*elementoX).item.String);
        printf("Valor= %d\n", (*elementoX).item.valor);
        printf("Prox Elemento: %p\n\n", (*elementoX).pProxElemento);
        elementoX = (*elementoX).pProxElemento;
        i++;
    }
}

#endif // METODOSLISTA_H_INCLUDED
