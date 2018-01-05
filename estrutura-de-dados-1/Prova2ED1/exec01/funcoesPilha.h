#ifndef FUNCOESPILHA_H_INCLUDED
#define FUNCOESPILHA_H_INCLUDED
#include<stdio.h>
#include<stdlib.h>
#include"pilhaStruct.h"
//faz pilha vazia
int fazPilhaVazia(Pilha *pPilha){
    pPilha->pTopo = NULL;
    pPilha->pFinal = NULL;
}

int insereInicioPilha(Pilha *pPilha, Item item){
    Elemento *novo = (Elemento*)malloc(sizeof(Elemento));
    if(novo == NULL){
        return 0;
    }else{
        novo->item = item;
        if(pPilha->pTopo == NULL){
            novo->pProxElemento = NULL;
            pPilha->pTopo = novo;
            pPilha->pFinal = novo;
        }else{
            Elemento *temp = pPilha->pTopo;
            novo->pProxElemento = temp;
            pPilha->pTopo = novo;
        }
        return 1;
    }
}

int retiraInicioPilha(Pilha *pPilha, Item *item){
    if(pPilha->pTopo == NULL){
        return 0;
    }else{
        Elemento *excluido = pPilha->pTopo;
        Elemento *novoTopo = excluido->pProxElemento;
        (*item) = excluido->item;
        pPilha->pTopo = novoTopo;
        free(excluido);
        return 1;
    }
}

void imprimePilha(Pilha *pPilha){
    Elemento *elemento = pPilha->pTopo;
    int i = 0;
    while(elemento != NULL){
        printf("Elemento [%d]: %d\n", i, elemento->item.valor);
        i++;
        elemento = elemento->pProxElemento;
    }
}

int tamanhoPilha(Pilha *pPilha){
	int i = 0;
	Elemento *elemento = pPilha->pTopo;
	while (elemento != NULL){
		i++;
		elemento = elemento->pProxElemento;
	}
	return i;
}

void intercalaPilha(Pilha *P1, Pilha *P2, Pilha *PR){
	int TamaP1 = tamanhoPilha(P1);
	int TamaP2 = tamanhoPilha(P2);
	int i = 0;
	Item temp;
	if(TamaP1 == TamaP2){
		for(i = 0; i < TamaP1; i++){
			retiraInicioPilha(P1, &temp);
			insereInicioPilha(PR, temp);
			retiraInicioPilha(P2, &temp);
			insereInicioPilha(PR, temp);
		}
	}else{
		if(TamaP1 < TamaP2){
			int diferenca = TamaP2 - TamaP1;
			for(i = 0; i < TamaP1; i++){
				retiraInicioPilha(P1, &temp);
				insereInicioPilha(PR, temp);
				retiraInicioPilha(P2, &temp);
				insereInicioPilha(PR, temp);
			}
			for(i = 0; i < diferenca; i++){
				retiraInicioPilha(P2, &temp);
				insereInicioPilha(PR, temp);
			}
		}else{
			int diferenca2 = TamaP1 - TamaP2;
			for(i = 0; i < TamaP2; i++){
				retiraInicioPilha(P1, &temp);
				insereInicioPilha(PR, temp);
				retiraInicioPilha(P2, &temp);
				insereInicioPilha(PR, temp);
			}
			for(i = 0; i < diferenca2; i++){
				retiraInicioPilha(P1, &temp);
				insereInicioPilha(PR, temp);
			}
		}
	}
}

#endif // FUNCOESPILHA_H_INCLUDED
