/******* Exercício 4)
*/
#include<stdio.h>
#include<stdlib.h>
struct list{
    int valor;
    struct list *prox;
};
typedef struct list Lista;

Lista *lista; //Declaração da lista propriamente dita
Lista *K; //ponteiro para o novo elemento

void deleta(Lista *lista, int y){
    Lista *busca;
    Lista *anterior;
    anterior = NULL;
    busca = lista;
    while(busca != NULL){
        if(busca->valor == y){
            printf("Vamos Apagar!\n");
            if(anterior != NULL){
                anterior->prox = busca->prox;
            }else{
                lista = busca->prox;
            }
            free(busca);
            break;
        }
        anterior = busca;
        busca = busca->prox;
    }
}
/***** Alterado *****/
void insere(Lista *lista, int y, Lista *k){
    Lista *busca;
    Lista *anterior;
    anterior = NULL;
    busca = lista;
    while(busca != NULL){
        if(busca->valor == y){
            printf("Vamos Inserir!\n");
            if(anterior != NULL){
                anterior->prox = k;
                k->prox = busca;
            }else{
                k->prox = busca;
            }
            break;
        }
        anterior = busca;
        busca = busca->prox;
    }
}
