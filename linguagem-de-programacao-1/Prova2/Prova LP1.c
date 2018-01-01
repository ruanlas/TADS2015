#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

void Ex_1()
{
    float imc, massa, altura=0;
    system("cls");
    printf("Digite seu peso em Kg: ");
    scanf("%f", &massa);
    printf("Digite sua altura em metros: ");
    scanf("%f", &altura);
    imc=massa/pow(altura,2);
    if (imc<18.5){
        printf("Voce esta abaixo do peso\n");
    }else if (imc>=18.5 && imc<=25){
        printf("Voce esta normal\n");
    }else if(imc>25 && imc<=30){
        printf("Voce esta com sobrepeso\n");
    }else if(imc>30){
        printf("Voce esta obeso\n");
    }
    system("Pause");
}
void Ex_2()
{
    struct corredores{
        char nome[15];
        float tempo_1;
        float tempo_2;
        float tempo_3;
        float media;
        char status[10];
    }Corredor[3];
    int i=0;
    system("cls");
    for (i=0; i<3;i++){
        system("cls;");
        printf("Digite o nome do corredor %d: ", i+1);
        fflush(stdin);
        gets(Corredor[i].nome);
        printf("Digite o Tempo 1 do corredor %d: ", i+1);
        scanf("%f", &Corredor[i].tempo_1);
        printf("Digite o Tempo 2 do corredor %d: ", i+1);
        scanf("%f", &Corredor[i].tempo_2);
        printf("Digite o Tempo 3 do corredor %d: ", i+1);
        scanf("%f", &Corredor[i].tempo_3);
    }
    for (i=0;i<3;i++){
        Corredor[i].media=(Corredor[i].tempo_1+Corredor[i].tempo_2+Corredor[i].tempo_3)/3;
    }
    for (i=0;i<3;i++){
        if (Corredor[i].media<10.1){
            strcpy(Corredor[i].status, "APTO");
        }else {
            strcpy(Corredor[i].status, "NAO-APTO");
        }
    }
    system("cls");
    for (i=0;i<3;i++){
        printf("Corredor: %s\n", Corredor[i].nome);
        printf("Tempo 1: %.3f\n", Corredor[i].tempo_1);
        printf("Tempo 2: %.3f\n", Corredor[i].tempo_2);
        printf("Tempo 3: %.3f\n", Corredor[i].tempo_3);
        printf("Media: %.3f\n", Corredor[i].media);
        printf("Status: %s\n", Corredor[i].status);
    }
    system("Pause");
}
void Ex_3()
{
    float matriz[3][4];
    int i,j=0;
    system("cls");
    for (i=0;i<3;i++){
        printf("Digite o valor %d do produto A: ", i+1);
        scanf("%f", &matriz[0][i]);
    }
    for (i=0;i<3;i++){
        printf("Digite o valor %d do produto B: ", i+1);
        scanf("%f", &matriz[1][i]);
    }
    for (i=0;i<3;i++){
        printf("Digite o valor %d do produto C: ", i+1);
        scanf("%f", &matriz[2][i]);
    }
    for (i=0;i<3;i++){
        matriz[i][3]=(matriz[i][0]+matriz[i][1]+matriz[i][2])/3;
    }
    system("cls");
    for (i=0;i<3;i++){
        for (j=0;j<4;j++){
            printf("%.2f| ", matriz[i][j]);
        }
        printf("\n");
    }
    system("Pause");
}
int main()
{
    int op=9;
        while (op!=0){
            system("cls");
            printf("PROVA LP1\n");
            printf("Digite as opcoes desejadas\n");
            printf("1 - Exercicio 1\n");
            printf("2 - Exercicio 2\n");
            printf("3 - Exercicio 3\n");
            printf("0 - Sair\n");
            scanf("%d", &op);
            switch (op){
                case 1:
                    Ex_1();
                    break;
                case 2:
                    Ex_2();
                    break;
                case 3:
                    Ex_3();
                    break;
                case 0:
                    break;
                default:
                    printf("Opcao invalida\n");
                    system("Pause");
            }
        }
    return 0;
}
