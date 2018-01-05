#ifndef FUNCOESPILHA_H_INCLUDED
#define FUNCOESPILHA_H_INCLUDED

#include"structPilha.h"

void pilhaFazVazia(Pilha *pPilha){
    pPilha->pTopo = NULL;
    pPilha->pFinal = NULL;
}
int pilhaEhVazia(Pilha *pPilha){
    return (pPilha->pTopo==NULL);
}
int insereInicioPilha(Pilha *pPilha, Item item){
    Elemento *novo = (Elemento*)malloc(sizeof(Elemento));
    if(novo == NULL){
        return -1;
    }else{
        novo->item = item;
        if(pPilha->pTopo == NULL){
            novo->pProxElemento = NULL;
            pPilha->pFinal = novo;
            pPilha->pTopo = novo;
        }else{
            Elemento *pPrimeiro = pPilha->pTopo;
            novo->pProxElemento = pPrimeiro;
            pPilha->pTopo = novo;
        }
        return 1;
    }
}

int retiraInicioPilha(Pilha *pPilha, Item *item){
    if(pPilha->pTopo == NULL){
        return -1;
    }else{
        Elemento *pPrimeiro = pPilha->pTopo;
        Elemento *pSegundo = pPrimeiro->pProxElemento;
        pPilha->pTopo = pSegundo;
        (*item) = pPrimeiro->item;
        free(pPrimeiro);
        return 1;
    }
}

int buscaItemPilha(Pilha *pPilha, Item item){
    if(pPilha->pTopo == NULL){
        return -1;
    }else{
        int i = 0;
        Elemento *pElemento = pPilha->pTopo;
        while(pElemento != NULL){

            if(pElemento->item.valor == item.valor){
                return i;
            }
            i++;
            pElemento = pElemento->pProxElemento;
        }
        return -1;
    }
}

void imprimePilha(Pilha *pPilha){
    int i = 0;
    Elemento *pElemento = pPilha->pTopo;
    while(pElemento != NULL){
        printf("Elemento [%d] : %d\n", i, pElemento->item.valor);
        i++;
        pElemento = pElemento->pProxElemento;
    }
}

int ordenaPilha(Pilha *pPilha){
    if(pPilha->pTopo == NULL){
        return -1;
    }else{
        Elemento *pElemento = pPilha->pTopo;
        Item menor;
        while(pElemento != NULL){
            Elemento *pElementoProx = pElemento->pProxElemento;
            while(pElementoProx != NULL){
                if(pElemento->item.valor <= pElementoProx->item.valor){

                }else{
                    menor = pElementoProx->item;
                    pElementoProx->item = pElemento->item;
                    pElemento->item = menor;
                }
                pElementoProx = pElementoProx->pProxElemento;
            }

            pElemento = pElemento->pProxElemento;
        }
        return 1;
    }
}

int tamanhoPilha(Pilha *pPilha){
    if(pPilha->pTopo == NULL){
        return 0;
    }else{
        int i = 0;
        Elemento *pElemento = pPilha->pTopo;
        while(pElemento != NULL){
            i++;
            pElemento = pElemento->pProxElemento;
        }
        return i;
    }
}

//Exercício 1)
int pertencePilha(Pilha *pPilha, Item Titem){
    if(pPilha->pTopo == NULL){
        return 0;
    }else{
        int i = 1;
        Elemento *pElemento = pPilha->pTopo;
        while(pElemento != NULL){

            if(pElemento->item.valor == Titem.valor){
                return i;
            }
            i++;
            pElemento = pElemento->pProxElemento;
        }
        return 0;
    }
}

//Exercício 2)

int intercalaPilhas(Pilha *P1, Pilha *P2, Pilha *PR){
    if(P1->pTopo == NULL && P2->pTopo == NULL){
        return -1;
    }else{
            Item item;
            int i = 0;
            int TamanhoP1 = tamanhoPilha(P1);
            int TamanhoP2 = tamanhoPilha(P2);
            //Se caso o tamanho da P1 for do mesmo tamanho da P2
            if(TamanhoP1 == TamanhoP2){
                for(i = 0; i<TamanhoP1; i++){
                    retiraInicioPilha(P1, &item);
                    insereInicioPilha(PR, item);
                    retiraInicioPilha(P2, &item);
                    insereInicioPilha(PR, item);
                }
            }
            //Caso o tamanho da P1 seja menor que a P2
            if(TamanhoP1 < TamanhoP2){
                TamanhoP2 = TamanhoP2 - TamanhoP1;
                for(i = 0; i<TamanhoP1; i++){
                    retiraInicioPilha(P1, &item);
                    insereInicioPilha(PR, item);
                    retiraInicioPilha(P2, &item);
                    insereInicioPilha(PR, item);
                }
                //percorre a diferença da P2
                for(i = 0; i < TamanhoP2; i++){
                    retiraInicioPilha(P2, &item);
                    insereInicioPilha(PR, item);
                }
                //Caso o tamanho da P2 seja menor que a P1
            }else if(TamanhoP2 < TamanhoP1){
                    TamanhoP1 = TamanhoP1 - TamanhoP2;
                    for(i = 0; i<TamanhoP2; i++){
                        retiraInicioPilha(P1, &item);
                        insereInicioPilha(PR, item);
                        retiraInicioPilha(P2, &item);
                        insereInicioPilha(PR, item);
                    }
                    //percorre a diferenca da P1
                    for(i = 0; i < TamanhoP1; i++){
                        retiraInicioPilha(P1, &item);
                        insereInicioPilha(PR, item);
                    }
            }

        return 1;
    }
}
/***** Exercício 3)
Podemos apenas obter a sequencia 325641, realizando a operação:
(a) inserir o 1 na pilha
(b) inserir o 2 na pilha
(c) inserir o 3 na pilha
(d) retirar o 3 da pilha
(e) retirar o 2 da pilha
(f) inserir o 4 na pilha
(g) inserir o 5 na pilha
(h) retirar o 5 da pilha
(j) inserir o 6 na pilha
(k) retirar o 6 da pilha
(l) retirar o 4 da pilha
(m) retirar o 1 da pilha

entretanto, a sequencia 154623 não será possível pois quando for retirado o número 6,
o número que ficará no topo da pilha será o número 3, entretando, a saída pede que
seja o número 2.
(a) inserir o 1 na pilha
(b) retirar o 1 da pilha
(c) inserir o 2 na pilha
(d) inserir o 3 na pilha
(e) inserir o 4 na pilha
(f) inserir o 5 na pilha
(g) retirar o 5 da pilha
(h) retirar o 4 da pilha
(j) inserir o 6 na pilha
(k) retirar o 6 da pilha

*/

#endif // FUNCOESPILHA_H_INCLUDED
