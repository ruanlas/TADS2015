#include<stdio.h>
#include<stdlib.h>

int main(){
    int* vetor;//ponteiro
    int n = 0;
    printf("Digite um numero para definir o tamanho do vetor: ");
    scanf("%d", &n);
    //Função Malloc = Memory Allocation
    //o casting (int *) converte o endereço retornado do malloc para o tipo int
    //pois a função malloc retorna um endereço void
    vetor = (int*) malloc(sizeof(int)*n);
    //ou
    //vetor = (int*) calloc(n, sizeof(int));
    int i = 0;
    for(i=0; i <n; i++){
        //acessando as posições do espaço alocado:
        //Para acessar as posições podemos trabalhar semelhante ao que trabalhamos com vetores
        //ou adicionar um valor ao ponteiro e pedir para exibir o conteúdo
        printf("%i\n", vetor[i]);//ou
        printf("%d\n\n", *(vetor + i));
    }
    printf("\nVetor criado com sucesso!!\n");
    return 0;
}
