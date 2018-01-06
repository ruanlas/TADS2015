#include<stdio.h>
#include<stdlib.h>

typedef struct Arv{
    int i;
    struct Arv* dir;
    struct Arv* esq;
}Arv;

Arv* insereArvore(Arv* a, int i){
    if(a == NULL){
        a = (Arv*)malloc(sizeof(Arv));
        printf("Elemento inserido\n");
        a->i = i;
        a->dir = NULL;
        a->esq = NULL;
    }else if(i < a->i){
        a->esq = insereArvore(a->esq, i);
    }else if(i > a->i){
        a->dir = insereArvore(a->dir, i);
    }
    return a;
}

int main(){

    Arv* v = NULL;
    v = insereArvore(v, 9);
    insereArvore(v,2);
    insereArvore(v,3);
    insereArvore(v,7);
    insereArvore(v,99);

    return 0;
}
