#ifndef METODOSPILHA_H_INCLUDED
#define METODOSPILHA_H_INCLUDED
#include "structPilha.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <limits.h>
/*
Precisa tratar as alocações de memória caso o malloc() retorne um ponteiro NULL
*/
/**Foi retirado o cabeçalho desta pilha**/
void fazPilhaVazia(TPilha *pilhaX){
    //O endereço do primeiro elemento da pilha recebe NULL (pilha vazia)
    (*pilhaX).pTopo = NULL;
    //O ultimo elemento da pilha também recebe NULL
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
        if((*pilhaX).pUltimo==NULL){//verifica se o apontador para o ultimo elemento da pilha é NULL (pilha vazia)
        //O conteúdo apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = NULL;
        //novo->pProxElemento
        //O cabeçaljo parra a apontar para o novo elemento, que passará a ser o primeiro
        (*pilhaX).pTopo = novo;
        (*pilhaX).pUltimo = novo;
        }else{
        TElemento *pTopo = (*pilhaX).pTopo;
        //O conteúdo apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = pTopo;
        //novo->pProxElemento
        //O cabeçaljo parra a apontar para o novo elemento, que passará a ser o primeiro
        (*pilhaX).pTopo = novo;
        }
        return 1;
    }
}

void retiraInicioPilha(TPilha *pilhaX){
    TElemento *pPrimeiro = (*pilhaX).pTopo;
    TElemento *pSegundo = (*pPrimeiro).pProxElemento;
    (*pilhaX).pTopo = pSegundo;
    //Libera a memória alocada para o primeiro
    free(pPrimeiro);
}

int buscaItemPilha(TPilha *pilhaX, TItem itemX){
    TElemento *elementoX = (*pilhaX).pTopo;
    int i = -1;
    int posicaoItem = -1;
    if((*pilhaX).pTopo == NULL){//verifica se a pilha é vazia
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

void ordenaPilha(TPilha *pilhaX){ //Funcionou!!!! (aperfeiçoado)
    TItem menor;//estrutura temporária que irá armazenar o menor item
    TElemento *elemento1 = pilhaX->pTopo; //elemento1 recebe o primeiro elemento da pilha
    TElemento *eleTemp;//elemento temporário
    while(elemento1 != NULL){ //enquanto houver conteúdo no elemento1 -> Percorre a pilha verificando os elementos

        eleTemp = elemento1->pProxElemento; //elemento temporário receberá o apontador do elemento1 para o proximo elemento da mesma pilha
        while(eleTemp != NULL){ //enquanto houver conteúdo no elemento temporário -> Percorre a pilha verificando os elementos à frente do elemento1

            if(elemento1->item.valor <= eleTemp->item.valor){
                //verifica se o item do elemento1 é menor do que o item do elemento temporário
                menor = elemento1->item;
            }else if(eleTemp->item.valor < elemento1->item.valor){
                //se o item do elemento temporário for menor do que o do elemento1, ele faz a troca, passando o item menor para o elemento1
                menor = eleTemp->item;
                eleTemp->item = elemento1->item;
                elemento1->item = menor;
            }
            eleTemp = eleTemp->pProxElemento;//avança para o proximo elemento temporário da pilha
        }
        elemento1 = elemento1->pProxElemento;//avança para o proximo elemento1 da pilha
    }
}

#endif // METODOSLISTA_H_INCLUDED
