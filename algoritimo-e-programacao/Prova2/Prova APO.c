#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

void Ex_1()
{
    system("cls");
    float a,b,z,tg,graus=0;
    printf("Digite o valor da parte real (a): ");
    scanf("%f", &a);
    printf("Digite o valor da parte imaginaria (b): ");
    scanf("%f", &b);
    z=sqrtf(pow(a,2)+pow(b,2));
    tg=b/a;
    graus=(360*atan(tg))/(2*3.14);
    printf("Z = %f\n", z);
    printf("Angulo alfa = %.1f graus\n", graus);
    system("Pause");
}
void Ex_2()
{
    system("cls");
    struct modelo_carro{
        char marca[15];
        char modelo[15];
        int ano;
        char combustivel[15];
        char motorizacao[15];
        float preco;
    }carro[3];
    int i=0;
    for (i=0;i<3;i++){
        system("cls");
        printf("Digite a Marca do carro %d: ", i+1);
        fflush(stdin);
        gets(carro[i].marca);
        printf("Digite o Modelo do carro %d: ", i+1);
        fflush(stdin);
        gets(carro[i].modelo);
        printf("Digite o ano do carro %d: ", i+1);
        scanf("%d", &carro[i].ano);
        printf("Digite o tipo de combustivel do carro %d: ", i+1);
        fflush(stdin);
        gets(carro[i].combustivel);
        printf("Digite o tipo de motorizacao do carro %d: ", i+1);
        fflush(stdin);
        gets(carro[i].motorizacao);
        printf("Digite o preco do carro %d: ", i+1);
        scanf("%f", &carro[i].preco);
    }
    system("cls");
    printf("Estoque\n");
    for (i=0;i<3;i++){
        printf("Marca: %s\n", carro[i].marca);
        printf("Modelo: %s\n", carro[i].modelo);
        printf("Ano: %d\n", carro[i].ano);
        printf("Combustivel: %s\n", carro[i].combustivel);
        printf("Motorizacao: %s\n", carro[i].motorizacao);
        printf("Preco: %.2f\n", carro[i].preco);
        printf("\n");
    }
    system("Pause");
}
void Ex_3()
{
    system("cls");
    float matriz[3][3];
    int i,j=0;
    for (i=0;i<2;i++){
            if (i==0){
                printf("Digite um valor para o produto A: ");
                scanf("%f", &matriz[0][i]);
            }else{
                printf("Digite a porcentagem de desconto para o produto A: ");
                scanf("%f", &matriz[0][i]);
            }
    }
    system("cls");
    for (i=0;i<2;i++){
            if (i==0){
                printf("Digite um valor para o produto B: ");
                scanf("%f", &matriz[1][i]);
            }else{
                printf("Digite a porcentagem de desconto para o produto B: ");
                scanf("%f", &matriz[1][i]);
            }
    }
    system("cls");
    for (i=0;i<2;i++){
            if (i==0){
                printf("Digite um valor para o produto C: ");
                scanf("%f", &matriz[2][i]);
            }else{
                printf("Digite a porcentagem de desconto para o produto C: ");
                scanf("%f", &matriz[2][i]);
            }
    }
    system("cls");
    for (i=0;i<3;i++){
        matriz[i][2]=matriz[i][0]-(matriz[i][0]*matriz[i][1]/100);
    }
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            printf("%.2f |", matriz[i][j]);
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
            printf("PROVA APO\n");
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
