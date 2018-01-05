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

int main(){
    Lista a, b, c, d, e, f, g;

    a.valor = 1;
    a.prox = &b;
    b.valor = 2;
    b.prox = &c;
    c.valor = 3;
    c.prox = &d;
    d.valor = 4;
    d.prox = &e;
    e.valor = 5;
    e.prox = &f;
    f.valor = 6;
    f.prox = &g;
    g.valor = 7;
    g.prox = NULL;

    Lista *teste = &a;
    while(teste != NULL){
        printf("Elemento %d\n",teste->valor );
        teste = teste->prox;
    }
    deleta(teste, 3);
    Lista x;
    x.valor = 12;
    insere(teste, 3, &x);
    teste = &a;
    printf("\n\n");
    while(teste != NULL){
        printf("Elemento %d\n",teste->valor );
        teste = teste->prox;
    }


    return 0;
}
