#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

char primeiro[50], segundo[50];

int main()
{
    float somaidade, mediaidade;
    int idade1, idade2;
    //char primeiro[20], segundo[20];
    printf("Digite o nome da primeira pessoa: \n");
    gets(primeiro);
    fflush(stdin);
    printf("Digite a idade da primeira pessoa: \n");
    scanf("%d", &idade1);
    fflush(stdin);
    printf("\n\n");
    printf("Digite o nome da segunda pessoa: \n");
    gets(segundo);
    fflush(stdin);
    printf("Digite a idade da segunda pessoa: \n");
    scanf("%d", &idade2);
    fflush(stdin);
    printf("\n\n");
    somaidade=idade1+idade2;
    mediaidade=somaidade/2;
    printf("A media das idades e de %.2f anos\n\n", mediaidade);
    printf("%s : %d anos\n",primeiro,idade1);
    printf("%s : %d anos\n",segundo,idade2);
    return 0;
}
