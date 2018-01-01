#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

    int vetor[8];
int VerificacaoVetor(int x)
{
    int i;
    int cont=0;
    for (i=0;i<8;i++){
        if (vetor[i]==x){
            cont=1;
        }
    }
    if (cont==1){
        return 1;
    }else{
        return 0;
    }
}

int main()
{
    int i, verificador;
    for (i=0;i<8;i++){
        system("cls");
        printf("Digite um numero para a posicao %d do vetor: ", i+1);
        scanf("%d", &vetor[i]);
    }
    system("cls");
    printf("Digite um numero para ser procurado no vetor: ");
    scanf("%d", &verificador);
    if (VerificacaoVetor(verificador)==1){
        printf("Numero encontrado no vetor\n");
    }else{
        printf("Numero nao encontrado no vetor\n");
    }
    return 0;
}
