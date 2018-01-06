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
//Ex 02)
/* A função abaixo não está funcionando da forma que eu queria que funcionasse
quando eu mando imprimir a primeira raiz conforme mostrado abaixo, ele imprime
os outros níveis duas vezes, e quando eu retiro a primeira raiz, ele imprime
normal do segundo nível abaixo
*/
void arv_imprime_nivel(Arv* a){ //Solução parcial
    if(arv_vazia(a)!=1){
        //printf("%c | ", a->c);
        //arv_imprime_nivel(a->esq);
        //arv_imprime_nivel(a->dir);
        //printf("%c | ", a->c); // ->Trecho que imprime a raiz
        if(arv_vazia(a->dir) != 1){
            printf("%c | ", a->dir->c);
        }
        if(arv_vazia(a->esq) != 1){
            printf("%c | ", a->esq->c);
        }
        arv_imprime_nivel(a->dir);
        arv_imprime_nivel(a->esq);
    }
}

void imprime_nivelDoNo(Arv *pos, int nivel){
    if (pos ==NULL){
        printf("arvore vazia\n");
        return ;
    }
    printf("\nNo: %c ------- Nivel: %i ", pos->c, nivel);
    if (pos->esq !=NULL)
        imprime_nivelDoNo (pos->esq, nivel+1);
    if (pos->dir !=NULL)
        imprime_nivelDoNo (pos->dir, nivel+1);
}

void imprimePorNivelComFila (Arv* h) {
    struct Arv* fila[50];
    int i, f;
    fila[0] = h;
    i = 0; f = 1;
    while (f > i) {
        h = fila[i++];
        printf("%c | ", h->c);
        if (h->esq != NULL) fila[f++] = h->esq;
        if (h->dir != NULL) fila[f++] = h->dir;
    }
    free(fila);
}


//Ex 03a)
void arv_imprime_crescente(Arv* a){
    //in-ordem
    if(arv_vazia(a)!=1){
        arv_imprime_InOrdem(a->esq);
        printf("%c\n", a->c);
        arv_imprime_InOrdem(a->dir);
    }
}
//Ex 03b)
int arv_total_elementos(Arv* a){
    if(arv_vazia(a)==1){
        return 0;
    }else{
        return arv_total_elementos(a->esq) + arv_total_elementos(a->dir) + 1;
    }
}
//Ex 04
void arv_inverte(Arv* a){
    if(arv_vazia(a)!= 1){
        Arv* temp = a->dir;
        a->dir = a->esq;
        a->esq = temp;
        arv_inverte(a->dir);
        arv_inverte(a->esq);
    }
}
//Ex 05
int altura(Arv * a){
    if(arv_vazia(a)==1){
        return -1;
    }else{
        int he = altura(a->esq);
        int hd = altura(a->dir);
        if(hd > he){
            return (hd+1);
        }else{
            return (he+1);
        }
    }
}
int main(){
    Arv* arvore = arv_criaVazia();
    arvore = arv_insere(arvore, 'r');
    arv_insere(arvore, 'u');
    arv_insere(arvore, 'a');
    arv_insere(arvore, 'n');
    arv_insere(arvore, 'l');
    arv_insere(arvore, 'u');
    arv_insere(arvore, 'i');
    arv_insere(arvore, 'z');
    printf("Pre-Ordem\n");
    arv_imprime_PreOrdem(arvore);
    printf("\nIn-Ordem\n");
    arv_imprime_InOrdem(arvore);
    printf("\nPos-Ordem\n");
    arv_imprime_PosOrdem(arvore);
    printf("\n\nAltura da arvore: %d", altura(arvore));
    printf("\n\nImprimindo por nivel\n\n");
    arv_imprime_nivel(arvore);
    printf("\n\nImprimindo Crescente\n");
    arv_imprime_crescente(arvore);
    printf("\n\nImprimindo total de elementos: %d\n\n", arv_total_elementos(arvore));
    printf("Invertendo elementos\n\n");
    arv_inverte(arvore);
    printf("\n\nImprimindo Pre-Ordem invertido\n");
    arv_imprime_InOrdem(arvore);
    printf("\n\nImprimindo total de elementos: %d\n\n", arv_total_elementos(arvore));
    printf("\n\nImprimindo por nivel\n\n");
    arv_imprime_nivel(arvore);
    printf("\n\nImprimindo por nivel2\n\n");
    imprime_nivelDoNo(arvore, 0);
    printf("\n\nImprimindo por nivel3\n\n");
    imprimePorNivelComFila(arvore);
    return 0;
}
