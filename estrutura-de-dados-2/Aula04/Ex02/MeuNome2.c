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

Arv* arv_insere(Arv* a, char c){
    if(arv_vazia(a)==1){
        a = (Arv*) malloc(sizeof(Arv));
        a->c = c;
        a->dir = NULL;
        a->esq = NULL;
    }else{
        if(c < a->c){
            a->esq = arv_insere(a->esq, c);
        }else if (c > a->c){
            a->dir = arv_insere(a->dir, c);
        }
    }
    return a;
}

void arv_imprime_PreOrdem(Arv* a){
    //pré-ordem
    if(arv_vazia(a)!=1){
        printf("%c\n", a->c); //Mostra a raiz
        arv_imprime_PreOrdem(a->esq); //Mostra a sae
        arv_imprime_PreOrdem(a->dir); //Mostra a sad
    }
}

void arv_imprime_InOrdem(Arv* a){
    //in-ordem
    if(arv_vazia(a)!=1){
        arv_imprime_InOrdem(a->esq);
        printf("%c\n", a->c);
        arv_imprime_InOrdem(a->dir);
    }
}

void arv_imprime_PosOrdem(Arv* a){
    //pos-ordem
    if(arv_vazia(a)!=1){
        arv_imprime_PosOrdem(a->esq);
        arv_imprime_PosOrdem(a->dir);
        printf("%c\n", a->c);
    }
}
int main(){
    Arv* arvore = arv_criaVazia();
    arvore = arv_insere(arvore, 'R');
    arv_insere(arvore, 'u');
    arv_insere(arvore, 'a');
    arv_insere(arvore, 'n');
    arv_insere(arvore, 'L');
    arv_insere(arvore, 'u');
    arv_insere(arvore, 'i');
    arv_insere(arvore, 'z');
    printf("Pre-Ordem\n");
    arv_imprime_PreOrdem(arvore);
    printf("\nIn-Ordem\n");
    arv_imprime_InOrdem(arvore);
    printf("\nPos-Ordem\n");
    arv_imprime_PosOrdem(arvore);
    return 0;
}
