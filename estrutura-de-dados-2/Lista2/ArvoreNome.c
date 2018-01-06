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
        printf("%c | ", a->c); //Mostra a raiz
        arv_imprime_PreOrdem(a->esq); //Mostra a sae
        arv_imprime_PreOrdem(a->dir); //Mostra a sad
    }
}

void arv_imprime_InOrdem(Arv* a){
    //in-ordem
    if(arv_vazia(a)!=1){
        arv_imprime_InOrdem(a->esq);
        printf("%c | ", a->c);
        arv_imprime_InOrdem(a->dir);
    }
}

void arv_imprime_PosOrdem(Arv* a){
    //pos-ordem
    if(arv_vazia(a)!=1){
        arv_imprime_PosOrdem(a->esq);
        arv_imprime_PosOrdem(a->dir);
        printf("%c | ", a->c);
    }
}

void imprime_nivelDoNo(Arv *pos, int nivel){ //Exemplo prof.
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

void imprimePorNivelComFila (Arv* h) { //Exemplo Prof.
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
/*
void arv_imprime_nivel(Arv* h) {
    int x = arv_total_elementos(h);
    struct Arv* fila[x];
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
}*/

//Ex 02
void arv_imprime_nivel(Arv* a){
    typedef struct Fila{
        Arv* h;
        struct Fila* pProx;
    }Fila; //Estrutura de Fila para armazenar as raízes por nível

    Fila* fila = (Fila*)malloc(sizeof(Fila)); //alocação de memória para o primeiro elemento da lista
    fila->h = a;
    fila->pProx = NULL;

    while (a != NULL && fila != NULL){
        a = fila->h;
        printf("%c | ", a->c);
        Fila* busca;

        if(a->esq != NULL){
            busca = fila;

            while(busca->pProx != NULL){ //busca pelo ultimo elemento da fila para inserção
                busca = busca->pProx;
            }
            busca->pProx = (Fila*) malloc(sizeof(Fila)); //Realiza a alocação de memoria e inserção
            (busca->pProx)->h = a->esq;
            (busca->pProx)->pProx = NULL;
        }
        if(a->dir != NULL){
            busca = fila;

            while(busca->pProx != NULL){
                busca = busca->pProx;
            }
            busca->pProx = (Fila*)malloc(sizeof(Fila));
            (busca->pProx)->h = a->dir;
            (busca->pProx)->pProx = NULL;
        }
        fila = fila->pProx;
    }
    free(fila); //está liberando somente o final
}


//Ex 03a)
void arv_imprime_crescente(Arv* a){
    //in-ordem
    if(arv_vazia(a)!=1){
        arv_imprime_InOrdem(a->esq);
        printf("%c | ", a->c);
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
int arv_altura(Arv * a){
    if(arv_vazia(a)==1){
        return -1;
    }else{
        int he = arv_altura(a->esq);
        int hd = arv_altura(a->dir);
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
    printf("Exercicio 1)\n");
    printf("Pre-Ordem\n");
    arv_imprime_PreOrdem(arvore);
    printf("\n\nIn-Ordem\n");
    arv_imprime_InOrdem(arvore);
    printf("\n\nPos-Ordem\n");
    arv_imprime_PosOrdem(arvore);
    printf("\n\nExercicio 2)\n");
    printf("Imprimindo por nivel\n");
    arv_imprime_nivel(arvore);
    printf("\n\nExercicio 3)\n");
    printf("A) o metodo utilizado para percorrer a arvore apresentando os valores\n");
    printf("de forma crescente eh o In-Ordem \n");
    arv_imprime_crescente(arvore);
    printf("\n\nB)\nA arvore possui %d nos (elementos)\n\n", arv_total_elementos(arvore));
    printf("\nExercicio 4)\n");
    printf("Invertendo a ordem da arvore e imprimindo em In-Ordem\n");
    arv_inverte(arvore);
    arv_imprime_InOrdem(arvore);
    printf("\n\nExercicio 5)\n");
    printf("Esta arvore tem altura de numero: %d\n", arv_altura(arvore));


    return 0;
}
