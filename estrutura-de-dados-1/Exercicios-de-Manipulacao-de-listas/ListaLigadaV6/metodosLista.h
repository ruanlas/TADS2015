#ifndef METODOSLISTA_H_INCLUDED
#define METODOSLISTA_H_INCLUDED
#include "structLista.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <limits.h>
/*
Precisa tratar as aloca��es de mem�ria caso o malloc() retorne um ponteiro NULL
*/
/**Foi retirado o cabe�alho desta lista**/
void fazListaVazia(TLista *listaX){
    //O endere�o do primeiro elemento da lista recebe NULL (lista vazia)
    (*listaX).pPrimeiro = NULL;
    //O ultimo elemento da lista tamb�m recebe NULL
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
    if((*listaX).pUltimo==NULL){//verifica se o apontador para o ultimo elemento da lista � NULL (lista vazia)
        TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
        //O conte�do apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = NULL;
        //novo->pProxElemento
        //O cabe�aljo parra a apontar para o novo elemento, que passar� a ser o primeiro
        (*listaX).pPrimeiro = novo;
        (*listaX).pUltimo = novo;
    }else{
        TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
        TElemento *pPrimeiro = (*listaX).pPrimeiro;
        //O conte�do apontado para novo recebe o valor do elementoX
        (*novo) = elementoX;
        //O ponteiro que aponta para o proximo elemento recebe o que era o primeiro elemento
        (*novo).pProxElemento = pPrimeiro;
        //novo->pProxElemento
        //O cabe�aljo parra a apontar para o novo elemento, que passar� a ser o primeiro
        (*listaX).pPrimeiro = novo;
    }

}

void insereFinalLista(TLista *listaX, TElemento elementoX){
    TElemento *novo = (TElemento*) malloc(sizeof(TElemento));
    (*novo) = elementoX;

    if(listaX->pPrimeiro == NULL){//verifica se a lista est� vazia
        (*novo).pProxElemento = NULL;
        listaX->pPrimeiro = novo;
        listaX->pUltimo = novo;
    }else{
        //Ponteiro que permite percorrer todos os elementos da lista
        TElemento *elementoLista = (*listaX).pPrimeiro;
        //loop que percorre todos os elementos da lista at� achar o final da lista
        while((*elementoLista).pProxElemento != NULL){
            elementoLista = (*elementoLista).pProxElemento;
        }
        (*novo).pProxElemento = NULL;
        (*elementoLista).pProxElemento = novo;
        (*listaX).pUltimo = novo;
    }

}

void retiraInicioLista(TLista *listaX){
    TElemento *pPrimeiro = (*listaX).pPrimeiro;
    TElemento *pSegundo = (*pPrimeiro).pProxElemento;
    (*listaX).pPrimeiro = pSegundo;
    //Libera a mem�ria alocada para o primeiro
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
    //libera a mem�ria alocada para o ultimo
    free(pUltimo);
}

int tamanhoLista(TLista *listaX){
    TElemento *elementoX = (*listaX).pPrimeiro;
    int i = 0;
    if((*listaX).pPrimeiro == NULL){//verifica se a lista � vazia
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
        printf("Valor= %d\n", (*elementoX).item.valor);
        printf("Prox Elemento: %p\n\n", (*elementoX).pProxElemento);
        elementoX = (*elementoX).pProxElemento;
        i++;
    }
}

//Exerc�cio 1

void ordenaLista(TLista *listaX){ //N�o funcionou!! /*Um dos problemas foi o cabe�alho, mas o outro est� dificil*/
    TElemento menor;
    TElemento *proximo;
    int controle = 0;
    TElemento *elemento1 = (*listaX).pPrimeiro;//coloca o primeiro elemento no elemento1
    TElemento *elemento2 = (*elemento1).pProxElemento; //coloca o segundo elemento no elemento2
    while(elemento2!= NULL){
        if(elemento1->item.valor <= elemento2->item.valor){

                if(controle==0){
                    (*listaX).pPrimeiro = elemento1;
                }
                /*Avan�a os elementos*/
                elemento1 = elemento1->pProxElemento;
                elemento2 = elemento1->pProxElemento;
        }else{
            menor = (*elemento2);
            //ir� apontar para o pr�ximo elemento de 2, a fim de manter o n� mesmo depois de atribuir o elemento1 ao elemento2 mais abaixo
            proximo = elemento2->pProxElemento;
            //O elemento2 recebe o elemento1 se caso o elemento1 for maior
            elemento2 = elemento1;
            //O elemento2 passa a apontar para o mesmo elemento que apontava antes de ser atribuido o elemento 1 ao 2
            elemento2->pProxElemento = proximo;
            //o elemento1 recebe o menor, que era o elemento2
            (*elemento1) = menor;
            //o apontador para o proximo elemento do elemento1 passa a apontar para o elemento2
            elemento1->pProxElemento = elemento2;
            if(controle==0){
                    (*listaX).pPrimeiro = elemento1;
            }
            /*Avan�a os elementos*/
            //elemento1 = elemento1->pProxElemento;
            //elemento2 = elemento1->pProxElemento;

        }
        controle++;
    }
}

void ordenaLista2(TLista *listaX){ //Funcionou com alguns erros
    TItem menor;
    TElemento *elemento1 = (*listaX).pPrimeiro;//coloca o primeiro elemento no elemento1
    TElemento *elemento2 = (*elemento1).pProxElemento; //coloca o segundo elemento no elemento2
    while(elemento2!= NULL){
        if(elemento1->item.valor <= elemento2->item.valor){
                /*Avan�a os elementos*/
                elemento1 = elemento1->pProxElemento;
                elemento2 = elemento1->pProxElemento;
        }else{
            menor = elemento2->item;
            elemento2->item = elemento1->item;
            elemento1->item = menor;

        }
    }
}

void ordenaLista3(TLista *listaX){ //Funcionou!!!!
    TItem menor;
    menor.valor = INT_MAX;
    TElemento *elemento1 = (*listaX).pPrimeiro;//coloca o primeiro elemento no elemento1

    while(elemento1!= NULL){
        if(menor.valor <= elemento1->item.valor){
            menor = menor;
        }else{
            menor = elemento1->item;
        }
        elemento1 = elemento1->pProxElemento;//avan�a os elementos da lista
    }
    printf("Menor:\n\n");
    printf("Valor: %d\n", menor.valor);
    printf("String: %s\n\n", menor.String);

    elemento1 = listaX->pPrimeiro;
    TItem itemTemp;
    TElemento *eleTemp;
    while(elemento1 != NULL){
        eleTemp = elemento1->pProxElemento;
        while(eleTemp != NULL){
            if(elemento1->item.valor <= eleTemp->item.valor){
                menor = elemento1->item;
            }else if(eleTemp->item.valor < elemento1->item.valor){
                menor = eleTemp->item;
                itemTemp = elemento1->item;
                elemento1->item = menor;
                eleTemp->item = itemTemp;
            }
            eleTemp = eleTemp->pProxElemento;
        }
        elemento1 = elemento1->pProxElemento;
    }
}

void ordenaLista4(TLista *listaX){ //Funcionou!!!! (aperfei�oado)
    TItem menor;//estrutura tempor�ria que ir� armazenar o menor item
    TElemento *elemento1 = listaX->pPrimeiro; //elemento1 recebe o primeiro elemento da lista
    TElemento *eleTemp;//elemento tempor�rio
    while(elemento1 != NULL){ //enquanto houver conte�do no elemento1 -> Percorre a lista verificando os elementos

        eleTemp = elemento1->pProxElemento; //elemento tempor�rio receber� o apontador do elemento1 para o proximo elemento da mesma lista
        while(eleTemp != NULL){ //enquanto houver conte�do no elemento tempor�rio -> Percorre a lista verificando os elementos � frente do elemento1

            if(elemento1->item.valor <= eleTemp->item.valor){
                //verifica se o item do elemento1 � menor do que o item do elemento tempor�rio
                menor = elemento1->item;
            }else if(eleTemp->item.valor < elemento1->item.valor){
                //se o item do elemento tempor�rio for menor do que o do elemento1, ele faz a troca, passando o item menor para o elemento1
                menor = eleTemp->item;
                eleTemp->item = elemento1->item;
                elemento1->item = menor;
            }
            eleTemp = eleTemp->pProxElemento;//avan�a para o proximo elemento tempor�rio da lista
        }
        elemento1 = elemento1->pProxElemento;//avan�a para o proximo elemento1 da lista
    }
}
//Exerc�cio 2
void insereOrdenado(TLista *listaX, TElemento elementoX){
    insereFinalLista(listaX, elementoX);
    ordenaLista4(listaX);
}
//Exerc�cio 3

TLista listaUniao;
TLista listaInterseccao;
TLista listaDiferenca;

void uniao(TLista *listaA, TLista *listaB){
    TElemento *elementoA = listaA->pPrimeiro;
    TElemento *elementoB = listaB->pPrimeiro;
    TElemento temp;
    int controle = 0; //Vari�vel de controle que verificar� se vai inserir n�mero repetido (n�meros que fazem intersec��o com A e B)
    while(elementoA != NULL){
            //enquanto houver elementos na listaA, ele vai adicionando todos os elementos na listaUni�o
        temp = (*elementoA);
        insereOrdenado(&listaUniao, temp);
        elementoA = elementoA->pProxElemento;
    }
    while(elementoB != NULL){
        //Sempre quando inicia o loop, o presuposto � que o controle � igual a 0
        //ou seja, parte-se do presuposto que o elemento B n�o faz interse��o com A
            controle = 0;
            elementoA = listaA->pPrimeiro;
            while(elementoA != NULL){
                if(elementoB->item.valor != elementoA->item.valor){
                    //caso o elemento B seja diferente de todos os elementos de A, ele � armazenado em temp
                    temp = (*elementoB);
                }else{
                    //caso o elemento B contenha um elemento semelhante a algum elemento de A, ele altera
                    //o valor da vari�vel de controle para -1, informando que o elemento de B faz intersec��o com A
                    controle = -1;
                }
                elementoA = elementoA->pProxElemento;
            }

        if(controle == 0){
            //Se caso o controle for igual a 0, significa que o elemento de B pode ser inserido, pois
            //n�o teve nenhum elemento semelhante em A, caso seja diferente de 0, significa que
            //O elemento de B j� encontrou um elemento semelhante em A, e por isso, ele ignora
            //este trecho, n�o inserindo na uni�o
            insereOrdenado(&listaUniao, temp);
        }
        elementoB = elementoB->pProxElemento;
    }
    imprimeLista(&listaUniao);
}

void interseccao(TLista *listaA, TLista *listaB){
    TElemento *elementoA = listaA->pPrimeiro;
    TElemento *elementoB;
    TElemento temp;
    int controle;

    while(elementoA != NULL){
        controle = 0;
        elementoB = listaB->pPrimeiro;
        while(elementoB != NULL){
            if(elementoA->item.valor != elementoB->item.valor){
                temp = (*elementoA);
            }else{
                controle = -1;
            }
            elementoB = elementoB->pProxElemento;
        }

        if(controle == -1){
            insereOrdenado(&listaInterseccao, temp);
        }
        elementoA = elementoA->pProxElemento;
    }
    imprimeLista(&listaInterseccao);
}

void diferenca(TLista *listaA, TLista *listaB){
    TElemento *elementoA = listaA->pPrimeiro;
    TElemento *elementoB;
    TElemento temp;
    int controle;

    while(elementoA != NULL){
        controle = 0;
        elementoB = listaB->pPrimeiro;
        while(elementoB != NULL){
            if(elementoA->item.valor != elementoB->item.valor){
                temp = (*elementoA);
            }else{
                controle = -1;
            }
            elementoB = elementoB->pProxElemento;
        }

        if(controle == 0){
            insereOrdenado(&listaDiferenca, temp);
        }
        elementoA = elementoA->pProxElemento;
    }
    imprimeLista(&listaDiferenca);
}
#endif // METODOSLISTA_H_INCLUDED
