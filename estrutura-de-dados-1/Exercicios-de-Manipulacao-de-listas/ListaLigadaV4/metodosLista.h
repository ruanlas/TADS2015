#ifndef METODOSLISTA_H_INCLUDED
#define METODOSLISTA_H_INCLUDED
#include "structLista.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
Precisa tratar as alocações de memória caso o malloc() retorne um ponteiro NULL
*/
/**Foi retirado o cabeçalho desta lista**/
void fazListaVazia(TLista *listaX){
    //O endereço do primeiro elemento da lista recebe NULL (lista vazia)
    (*listaX).pPrimeiro = NULL;
    //O ultimo elemento da lista também recebe NULL
    (*listaX).pUltimo = NULL;
}

int listaEhVazia(TLista *listaX){
    //verifica se o primeiro elemento da lista aponta para NULL
    if((*listaX).pPrimeiro==NULL){
        return 1;
    }else{
        return 0;
    }
}

void insereInicioLista(TLista *listaX, TElemento elementoX){
    if((*listaX).pUltimo==NULL){//verifica se o apontador para o ultimo elemento da lista é NULL
        TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
        TElemento *pPrimeiro = (*listaX).pPrimeiro;
        //O conteúdo apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = pPrimeiro;
        //novo->pProxElemento
        //O cabeçaljo parra a apontar para o novo elemento, que passará a ser o primeiro
        (*listaX).pPrimeiro = novo;
        (*listaX).pUltimo = pPrimeiro;
    }else{
        TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
        TElemento *pPrimeiro = (*listaX).pPrimeiro;
        //O conteúdo apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = pPrimeiro;
        //novo->pProxElemento
        //O cabeçaljo parra a apontar para o novo elemento, que passará a ser o primeiro
        (*listaX).pPrimeiro = novo;
    }

}

void insereFinalLista(TLista *listaX, TElemento elementoX){
    TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
    (*novo) = elementoX;
    //Ponteiro que permite percorrer todos os elementos da lista
    TElemento *elementoLista = (*listaX).pPrimeiro;
    //loop que percorre todos os elementos da lista até achar o final da lista
    while((*elementoLista).pProxElemento != NULL){
        elementoLista = (*elementoLista).pProxElemento;
    }
    (*novo).pProxElemento = NULL;
    (*elementoLista).pProxElemento = novo;
    (*listaX).pUltimo = novo;
}

void retiraInicioLista(TLista *listaX){
    TElemento *pPrimeiro = (*listaX).pPrimeiro;
    TElemento *pSegundo = (*pPrimeiro).pProxElemento;
    (*listaX).pPrimeiro = pSegundo;
    //Libera a memória alocada para o primeiro
    free(pPrimeiro);
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
    (*listaX).pUltimo = pPenultimo;
    //libera a memória alocada para o ultimo
    free(pUltimo);
}

int tamanhoLista(TLista *listaX){
    TElemento *elementoX = (*listaX).pPrimeiro;
    int i = 0;
    if((*listaX).pPrimeiro == NULL){//verifica se a lista é vazia
        i = 0;
    }else{
        while(elementoX != NULL){
            i++;
            elementoX = (*elementoX).pProxElemento;
        }
    }
    return i;
}

void imprimeLista(TLista *listaX){
    TElemento *elementoX = (*listaX).pPrimeiro;
    int i = 0;
    while(elementoX != NULL){
        printf("Elemento [%d]\n", i);
        printf("String= %s\n", (*elementoX).item.String);
        printf("Valor= %d\n\n", (*elementoX).item.valor);
        elementoX = (*elementoX).pProxElemento;
        i++;
    }
}

//Exercício 1

void ordenaLista(TLista *listaX){ //Não funcionou!! /*Um dos problemas foi o cabeçalho, mas o outro está dificil*/
    TElemento *menor;
    TElemento *proximo;
    int controle = 0;
    TElemento *elemento1 = (*listaX).pPrimeiro;//coloca o primeiro elemento no elemento1
    TElemento *elemento2 = (*elemento1).pProxElemento; //coloca o segundo elemento no elemento2
    while((*elemento1).pProxElemento != NULL){
        if(elemento1->item.valor <= elemento2->item.valor){

                if(controle==0){
                    (*listaX).pPrimeiro = elemento1;
                }
                /*Avança os elementos*/
                elemento1 = elemento1->pProxElemento;
                elemento2 = elemento1->pProxElemento;
        }else{
            menor = elemento2;
            //irá apontar para o próximo elemento de 2, a fim de manter o nó mesmo depois de atribuir o elemento1 ao elemento2 mais abaixo
            proximo = elemento2->pProxElemento;
            //O elemento2 recebe o elemento1 se caso o elemento1 for maior
            elemento2 = elemento1;
            //O elemento2 passa a apontar para o mesmo elemento que apontava antes de ser atribuido o elemento 1 ao 2
            elemento2->pProxElemento = proximo;
            //o elemento1 recebe o menor, que era o elemento2
            elemento1 = menor;
            //o apontador para o proximo elemento do elemento1 passa a apontar para o elemento2
            elemento1->pProxElemento = elemento2;
            if(controle==0){
                    (*listaX).pPrimeiro = elemento1;
            }
            /*Avança os elementos*/
            elemento1 = elemento1->pProxElemento;
            elemento2 = elemento1->pProxElemento;

        }
        controle++;
    }
}
#endif // METODOSLISTA_H_INCLUDED
