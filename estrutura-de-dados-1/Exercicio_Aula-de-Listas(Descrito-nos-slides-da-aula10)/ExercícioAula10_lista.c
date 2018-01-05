#include<stdio.h>
#include<stdlib.h>

#define INICIO 0
#define MAXTAM 1000

typedef struct{
    int valor;
}TItem;

typedef struct{
    TItem item[MAXTAM];
    int primeiro, ultimo;
}TLista;

void TLista_FazVazia(TLista *pLista);//
int TLista_EhVazia(TLista *pLista);//
int TLista_Insere(TLista *pLista, int indice, TItem x);//
int TLista_Retira(TLista *pLista, int indice);//
//int TLista_Retira(TLista *pLista, int indice, TItem *px);//irei retirar o TItem *px
void TLista_Imprime(TLista *pLista);//
//int TLista_Get(TLista *pLista, int indice, TItem *px);//irei retirar o TItem *px
int TLista_Get(TLista *pLista, int indice);//
int TLista_Tamanho(TLista *pLista);

void TLista_FazVazia(TLista *pLista){
    (*pLista).primeiro = INICIO;
    (*pLista).ultimo = (*pLista).primeiro;
}
int TLista_EhVazia(TLista *pLista){
    if((*pLista).primeiro==(*pLista).ultimo){
        return 1;
    }else{
        return 0;
    }
}
int TLista_Insere(TLista *pLista, int indice, TItem x){
    if((*pLista).ultimo == MAXTAM){
        return 0;
    }else{
        if(indice >= (*pLista).ultimo){
            int cont = (*pLista).ultimo;
            (*pLista).item[cont] = x;
            (*pLista).ultimo++;
        }else{
            int i;
            for(i = (*pLista).ultimo; i > indice; i--){
                (*pLista).item[i] = (*pLista).item[i-1];
            }
            (*pLista).item[indice] = x;
            (*pLista).ultimo++;
        }

        return 1;
    }
}
int TLista_Retira(TLista *pLista, int indice){
    if(indice >= (*pLista).ultimo || (*pLista).primeiro==(*pLista).ultimo){
        return 0;
    }else{
        int i;
        for(i = indice; i < (*pLista).ultimo; i++){
            (*pLista).item[i] = (*pLista).item[i+1];
        }
        (*pLista).ultimo--;
        return 1;
    }
}
void TLista_Imprime(TLista *pLista){
    int i = (*pLista).primeiro;
    for( i = (*pLista).primeiro; i < (*pLista).ultimo ; i++){
        printf("Indice[%d] = %d\n", i, (*pLista).item[i].valor);
    }
}
int TLista_Get(TLista *pLista, int indice){
    int valor = NULL;
    if(indice >= 0 && indice < (*pLista).ultimo){
        valor = (*pLista).item[indice].valor;
    }
    return valor;
}
int TLista_Tamanho(TLista *pLista){
    return (*pLista).ultimo - (*pLista).primeiro;
}
