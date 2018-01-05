#include<stdio.h>
#include<stdlib.h>
#include "funcoesPilha.h"
#include "structPilha.h"

int main(){
    Pilha TPilha;
    Item Titem;
    printf("Pilha vazia? %d\n", pilhaEhVazia(&TPilha));
    pilhaFazVazia(&TPilha);
    printf("Esvaziando o lixo de memoria da lista\n");
    printf("Pilha vazia? %d\n", pilhaEhVazia(&TPilha));
    Titem.valor = 1;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 8;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 9;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 6;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 5;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 6;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 15;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 19;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 25;
    insereInicioPilha(&TPilha, Titem);
    Titem.valor = 2;
    insereInicioPilha(&TPilha, Titem);


    printf("\n\nImprimindo Pilha\n\n");
    imprimePilha(&TPilha);

    Titem.valor = 5;
    printf("Buscando Item.valor = %d => posicao [%d]", Titem.valor, buscaItemPilha(&TPilha, Titem) );

    printf("\n\nOrdenando Pilha\n\n");
    ordenaPilha(&TPilha);
    imprimePilha(&TPilha);

    Titem.valor = 5;
    printf("Buscando Item.valor = %d => posicao [%d]\n", Titem.valor, buscaItemPilha(&TPilha, Titem) );
    printf("\n\n O valor %d pertence a [%d] posicao da lista\n", Titem.valor, pertencePilha(&TPilha, Titem));
    printf("\nRetirando do inicio da pilha\n");
    retiraInicioPilha(&TPilha, &Titem);
    printf("Elemento retirado: %d\n\n",Titem.valor );
    imprimePilha(&TPilha);
    printf("\nTamanho Pilha = %d\n", tamanhoPilha(&TPilha));

    printf("\n\n\nExercicio 2)\n\n");
    Pilha P1, P2, PR;
    pilhaFazVazia(&P1);
    pilhaFazVazia(&P2);
    pilhaFazVazia(&PR);
    Titem.valor = 1;
    insereInicioPilha(&P1, Titem);
    Titem.valor = 3;
    insereInicioPilha(&P1, Titem);
    Titem.valor = 5;
    insereInicioPilha(&P1, Titem);
    Titem.valor = 2;
    insereInicioPilha(&P2, Titem);
    Titem.valor = 4;
    insereInicioPilha(&P2, Titem);
    Titem.valor = 6;
    insereInicioPilha(&P2, Titem);
    Titem.valor = 8;
    insereInicioPilha(&P2, Titem);
    Titem.valor = 10;
    insereInicioPilha(&P2, Titem);
    ordenaPilha(&P1);
    ordenaPilha(&P2);
    printf("Imprimindo P1\n");
    imprimePilha(&P1);
    printf("\n\nImprimindo P2\n");
    imprimePilha(&P2);
    intercalaPilhas(&P1, &P2, &PR);
    ordenaPilha(&PR);
    printf("\n\nImprimindo PR\n");
    imprimePilha(&PR);
    return 0;
}
