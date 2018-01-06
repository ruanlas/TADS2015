#include<stdio.h>
#include<stdlib.h>
typedef struct Arv{
    int x;
    struct Arv* dir;
    struct Arv* esq;
}Arv;

void removeArv(int x, Arv* a){
    if(a->x == x){
        if(a->dir != NULL){
            a->x = a->dir->esq->x;
        }else if(a->esq != NULL){
            a->x = a->esq->dir->x;
        }
    }else if(x < a->x){
        removeArv(x, a->esq);
    }else if(x > a->x){
        removeArv(x, a->dir);
    }
}

int main(){

    return 0;
}
