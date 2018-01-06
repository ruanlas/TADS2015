#include<stdio.h>
#include<stdlib.h>

typedef struct Arv{
    char c;
    struct Arv* dir;
    struct Arv* esq;
}Arv;

Arv* arv_criaVazia(){
    Arv* a = NULL;
    return a;
}
int arv_vazia(Arv* a){
    return (a==NULL); //retorna 1 se for NULL
}
/*Arv* arv_cria(char c, Arv* sae, Arv* sad){
    Arv* a = (Arv*) malloc(sizeof(Arv));
    a->c = c;
    a->esq = sae;
    a->dir = sad;
    return a;
}*/

void arv_insere(Arv* a, char c){
    if(arv_vazia(a)){
        a = (Arv*) malloc(sizeof(Arv));
        a->c = c;
        a->dir = NULL;
        a->esq = NULL;
        printf("Elemento inserido\n");
    }else{
        if(c < a->c){
            printf("ELE\n");
            arv_insere(a->esq, c);
        }else{
            printf("ELE\n");
            arv_insere(a->dir, c);
        }
    }
}

void arv_imprime(Arv* a){
    //pré-ordem
    if(a!=NULL){
        printf("%c\n ", a->c); //Mostra a raiz
        arv_imprime(a->esq); //Mostra a sae
        arv_imprime(a->dir); //Mostra a sad
    }
}
int main(){
    Arv* arvore = arv_criaVazia();
    //arvore = (Arv*) malloc(sizeof(Arv));
    //arvore->c = 'd';
    //arvore->dir = NULL;
    //arvore->esq = NULL;
    arv_insere(arvore, 'R');
    printf("%d\n", arv_vazia(arvore));
    arv_insere(arvore, 'u');
    printf("%d\n", arv_vazia(arvore));
    arv_insere(arvore, 'a');
    printf("%d\n", arv_vazia(arvore));
    arv_insere(arvore, 'n');
    printf("%d\n", arv_vazia(arvore));
    arv_imprime(arvore);
    printf("OLA");
    return 0;
}
