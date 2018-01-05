#ifndef METODOSPILHA_H_INCLUDED
#define METODOSPILHA_H_INCLUDED
#include "structPilha.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <limits.h>
/*
Precisa tratar as aloca��es de mem�ria caso o malloc() retorne um ponteiro NULL
*/
/**Foi retirado o cabe�alho desta pilha**/
void fazPilhaVazia(TPilha *pilhaX){
    //O endere�o do primeiro elemento da pilha recebe NULL (pilha vazia)
    (*pilhaX).pTopo = NULL;
    //O ultimo elemento da pilha tamb�m recebe NULL
    (*pilhaX).pUltimo = NULL;
}

int pilhaEhVazia(TPilha *pilhaX){
    //verifica se o primeiro elemento da pilha aponta para NULL
    if((*pilhaX).pTopo==NULL){
        return 1;
    }else{
        return 0;
    }
}

int insereInicioPilha(TPilha *pilhaX, TElemento elementoX){
    TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
    if(novo==NULL){
        return -1;
    }else{
        if((*pilhaX).pUltimo==NULL){//verifica se o apontador para o ultimo elemento da pilha � NULL (pilha vazia)
        //O conte�do apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = NULL;
        //novo->pProxElemento
        //O cabe�aljo parra a apontar para o novo elemento, que passar� a ser o primeiro
        (*pilhaX).pTopo = novo;
        (*pilhaX).pUltimo = novo;
        }else{
        TElemento *pTopo = (*pilhaX).pTopo;
        //O conte�do apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = pTopo;
        //novo->pProxElemento
        //O cabe�aljo parra a apontar para o novo elemento, que passar� a ser o primeiro
        (*pilhaX).pTopo = novo;
        }
        return 1;
    }
}

void retiraInicioPilha(TPilha *pilhaX){
    TElemento *pPrimeiro = (*pilhaX).pTopo;
    TElemento *pSegundo = (*pPrimeiro).pProxElemento;
    (*pilhaX).pTopo = pSegundo;
    //Libera a mem�ria alocada para o primeiro
    free(pPrimeiro);
}

int buscaItemPilha(TPilha *pilhaX, TItem itemX){
    TElemento *elementoX = (*pilhaX).pTopo;
    int i = -1;
    int posicaoItem = -1;
    if((*pilhaX).pTopo == NULL){//verifica se a pilha � vazia
        i = -1;
    }else{
        while(elementoX != NULL){
            i++;
            elementoX = (*elementoX).pProxElemento;
            if(elementoX->item.valor==itemX.valor){
                posicaoItem=i;
            }
        }
    }
    return posicaoItem;
}

void imprimePilha(TPilha *pilhaX){
    TElemento *elementoX = (*pilhaX).pTopo;
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

void ordenaPilha(TPilha *pilhaX){ //Funcionou!!!! (aperfei�oado)
    TItem menor;//estrutura tempor�ria que ir� armazenar o menor item
    TElemento *elemento1 = pilhaX->pTopo; //elemento1 recebe o primeiro elemento da pilha
    TElemento *eleTemp;//elemento tempor�rio
    while(elemento1 != NULL){ //enquanto houver conte�do no elemento1 -> Percorre a pilha verificando os elementos

        eleTemp = elemento1->pProxElemento; //elemento tempor�rio receber� o apontador do elemento1 para o proximo elemento da mesma pilha
        while(eleTemp != NULL){ //enquanto houver conte�do no elemento tempor�rio -> Percorre a pilha verificando os elementos � frente do elemento1

            if(elemento1->item.valor <= eleTemp->item.valor){
                //verifica se o item do elemento1 � menor do que o item do elemento tempor�rio
                menor = elemento1->item;
            }else if(eleTemp->item.valor < elemento1->item.valor){
                //se o item do elemento tempor�rio for menor do que o do elemento1, ele faz a troca, passando o item menor para o elemento1
                menor = eleTemp->item;
                eleTemp->item = elemento1->item;
                elemento1->item = menor;
            }
            eleTemp = eleTemp->pProxElemento;//avan�a para o proximo elemento tempor�rio da pilha
        }
        elemento1 = elemento1->pProxElemento;//avan�a para o proximo elemento1 da pilha
    }
}

#endif // METODOSLISTA_H_INCLUDED
