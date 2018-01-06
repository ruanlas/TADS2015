#include<stdlib.h>
#include<stdio.h>

typedef struct Arv{
    int info;
    struct Arv* dir;
    struct Arv* esq;
}Arv;

void arv_criavazia(){
    return NULL;
}

Arv* arv_cria(int valor, Arv* sae, Arv* sad){
    Arv* a = (Arv*) malloc(sizeof(Arv));
    a->info = valor;
    a->esq = sae;
    a->dir = sad;
    return a;
}

int arv_vazia(Arv* arvore){
    return (arvore==NULL); //retorna 1 se for NULL
}

int arv_pertence(Arv* a, int x){
    if(arv_vazia(a)){
        return 0;
    }else if(a->info == x){
        return (a->info == x);
    }else{
        if(x < a->info){
            return (arv_pertence(a->esq, x));
        }else{
            return (arv_pertence(a->dir, x));
        }
    }
}

Arv* arv_libera(Arv* a){
    if(!arv_vazia(a)){
        arv_libera(a->esq); //Libera sae
        arv_libera(a->dir); //Libera sad
        free(a);
    }
    return NULL;
}

void arv_imprime(Arv* a){
    //pré-ordem
    if(!arv_vazia(a)){
        printf("%d ", a->info); //Mostra a raiz
        arv_imprime(a->esq); //Mostra a sae
        arv_imprime(a->dir); //Mostra a sad
    }
}



int main(){
    printf("Exercicio de Arvore\n\n");
    //Arv* arvore = arv_cria(200, NULL, NULL);
    Arv* arvore = arv_cria(200, arv_cria(100,NULL,NULL), arv_cria(300, NULL, NULL));
    //Arv* arvore = NULL;
    if(arv_vazia(arvore)==1){
        printf("A arvore esta vazia\n");
    }else{
        printf("A arvore nao esta vazia\n");
    }
    if(arv_pertence(arvore, 100)== 0){
        printf("O elemento nao pertence a arvore\n");
    }else{
        printf("O elemento pertence a arvore\n");
    }
    arv_imprime(arvore);

    return 0;
}
