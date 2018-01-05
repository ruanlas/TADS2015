#include<stdio.h>
#include<stdlib.h>

int main(){
    int* vetor;//ponteiro
    int n = 0;
    printf("Digite um numero para definir o tamanho do vetor: ");
    scanf("%d", &n);
    //Fun��o Malloc = Memory Allocation
    //o casting (int *) converte o endere�o retornado do malloc para o tipo int
    //pois a fun��o malloc retorna um endere�o void
    vetor = (int*) malloc(sizeof(int)*n);
    //ou
    //vetor = (int*) calloc(n, sizeof(int));
    int i = 0;
    for(i=0; i <n; i++){
        //acessando as posi��es do espa�o alocado:
        //Para acessar as posi��es podemos trabalhar semelhante ao que trabalhamos com vetores
        //ou adicionar um valor ao ponteiro e pedir para exibir o conte�do
        printf("%i\n", vetor[i]);//ou
        printf("%d\n\n", *(vetor + i));
    }
    printf("\nVetor criado com sucesso!!\n");
    return 0;
}
