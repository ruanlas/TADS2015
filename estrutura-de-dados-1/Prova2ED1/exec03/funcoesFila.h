#ifndef FUNCOESFILA_H_INCLUDED
#define FUNCOESFILA_H_INCLUDED
#include<stdio.h>
#include<stdlib.h>
#include"filaStruct.h"
//faz fila vazia
int fazFilaVazia(Fila *pFila){
    pFila->pInicio = NULL;
    pFila->pFinal = NULL;
}

int insereFinalFila(Fila *pFila, Item item){
    Elemento *novo = (Elemento*)malloc(sizeof(Elemento));
    if(novo == NULL){
        return 0;
    }else{
        novo->item = item;
        if(pFila->pInicio == NULL){
            novo->pProxElemento = NULL;
            pFila->pInicio = novo;
            pFila->pFinal = novo;
        }else{
            Elemento *temp = pFila->pInicio;
            while(temp->pProxElemento != NULL){
                temp = temp->pProxElemento;
            }
            temp->pProxElemento = novo;
            novo->pProxElemento = NULL;
            pFila->pFinal = novo;
        }
        return 1;
    }
}

int retiraInicioFila(Fila *pFila, Item *item){
    if(pFila->pInicio == NULL){
        return 0;
    }else{
        Elemento *excluido = pFila->pInicio;
        Elemento *novoInicio = excluido->pProxElemento;
        (*item) = excluido->item;
        pFila->pInicio = novoInicio;
        free(excluido);
        return 1;
    }
}

void imprimeFila(Fila *pFila){
    Elemento *elemento = pFila->pInicio;
    int i = 0;
    while(elemento != NULL){
        printf("Elemento [%d]: %d\n", i, elemento->item.valor);
        i++;
        elemento = elemento->pProxElemento;
    }
}

int tamanhoFila(Fila *pFila){
	int i = 0;
	Elemento *elemento = pFila->pInicio;
	while (elemento != NULL){
		i++;
		elemento = elemento->pProxElemento;
	}
	return i;
}


#endif // FUNCOESFILA_H_INCLUDED
