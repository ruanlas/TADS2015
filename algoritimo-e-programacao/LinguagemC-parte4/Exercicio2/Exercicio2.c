#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    float nota_trabalho, nota_prova, media;

    printf("Calculo de media do aluno\n");
    printf("Digite a nota obtida em provas: \n");
    scanf("%f", &nota_prova);
    printf("Digite a nota obtida em trabalhos: \n");
    scanf("%f", &nota_trabalho);

    media = (nota_trabalho * 0.3) + (nota_prova * 0.7);

    printf("A media final do aluno foi de %.2f\n\n", media);

    if (media >= 6){
        printf("O aluno foi Aprovado!!\n");
    } else if (media >= 2){
        printf("O aluno esta de Recuperacao!!\n");
    } else {
            printf("O aluno foi Reprovado!!\n");
    }
    return 0;
}
