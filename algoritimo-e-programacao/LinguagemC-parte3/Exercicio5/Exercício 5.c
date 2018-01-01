
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>



int main()
{
    char leitura (char nome[50]);
    int leitidade(int idade);
    float mediaidades(int x,int y);
    //void mensa();
    void mensagem (char nome1[50], char nome2[50], int idadex, int idadey);
    // !-> Problema com a função void (não estava com o tamanho da string definido)

    int idade1, idade2, idade;
    char primeiro[50], segundo[50];

    printf("Digite o nome da primeira pessoa: \n");
    leitura(primeiro);
    printf("Digite a idade da primeira pessoa: \n");
    /*leitidade(idade1);*/
    idade1=leitidade(idade);
    /*scanf("%d", &idade1);
    fflush(stdin);*/

    printf("\n\n");

    printf("Digite o nome da segunda pessoa: \n");
    leitura(segundo);
    printf("Digite a idade da segunda pessoa: \n");
    /*leitidade(idade2);*/
    idade2=leitidade(idade);
    /*scanf("%d", &idade2);
    fflush(stdin);*/

    printf("\n\n");

    mensagem (primeiro,segundo,idade1,idade2);//; -> problema com a função void

    //void mensa(); -> função estava sem parâmetro das variáveis

    /*printf("A media das idades e de %.2f anos\n\n", mediaidades(idade1,idade2));
    printf("%s : %d anos\n",primeiro,idade1);
    printf("%s : %d anos\n",segundo,idade2);*/
    return 0;
}

char leitura (char nome[50])
{
    fgets(nome, 50, stdin);
    fflush(stdin);
    return (nome);
}

float mediaidades(int x, int y)
{
    float soma, media;
    soma=x+y;
    media=soma/2;
    return(media);
}

int leitidade(int idade)
{
    scanf("%d", &idade);
    fflush(stdin);
    return (idade);
}

void mensagem (char nome1[50], char nome2[50], int idadex, int idadey)
{
    printf("A media das idades e de %.2f anos\n\n", mediaidades(idadex,idadey));
    printf("%s : %d anos\n",nome1,idadex);
    printf("%s : %d anos\n",nome2,idadey);
}


/*void mensa() // está sem parâmetros
{
    float mediaidades(int x,int y);

    printf("A media das idades e de %.2f anos\n\n", mediaidades(idade1,idade2));
    printf("%s : %d anos\n",primeiro,idade1);
    printf("%s : %d anos\n",segundo,idade2);
}*/
