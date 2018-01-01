#include<stdio.h>
#include<stdlib.h>
#include<math.h>

struct numero_complexo{
    float x;//parte real
    float y;//parte imaginária
}z[5];
void soma_numeros_complexos()
{
    system("cls");
    printf("Digite a parte real do primeiro numero complexo: ");
    scanf("%f", &z[0].x);
    printf("Digite a parte imaginária do primeiro numero complexo: ");
    scanf("%f", &z[0].y);
    printf("Digite a parte real do segundo numero complexo: ");
    scanf("%f", &z[1].x);
    printf("Digite a parte imaginária do segundo numero complexo: ");
    scanf("%f", &z[1].y);
    z[2].x=z[0].x+z[1].x;//soma parte real
    z[2].y=z[0].y+z[1].y;//soma parte imaginario
    printf("Z = %.3f + %.3fi\n", z[2].x, z[2].y);
    system("PAUSE");
}
void modulo_numero_complexos()
{
    system("cls");
    printf("Digite a parte real do primeiro numero complexo: ");
    scanf("%f", &z[3].x);
    printf("Digite a parte imaginária do primeiro numero complexo: ");
    scanf("%f", &z[3].y);
    printf("|Z|= %.4f\n", sqrt(pow(z[3].x, 2)+pow(z[3].y, 2)));
    system("PAUSE");
}
void angulo_numero_complexo()
{
    system("cls");
    float tg, graus=0;
    printf("Digite a parte real do primeiro numero complexo: ");
    scanf("%f", &z[4].x);
    printf("Digite a parte imaginária do primeiro numero complexo: ");
    scanf("%f", &z[4].y);
    tg=z[4].y/z[4].x;
    graus=(360*atan(tg))/(2*3.14);
    printf("Angulo = %.1f graus\n", graus);
    system("PAUSE");
}
int main()
{
    int op=9;
    while (op!=0){
        system("cls");
            printf(" NUMEROS COMPLEXOS \n-------------------\n");
            printf("1 - Soma dos numeros complexos\n");
            printf("2 - Modulo do numero complexo\n");
            printf("3 - Angulo do numero complexo\n");
            printf("0 - Sair\n");
            fflush(stdin);
            scanf("%d", &op);
        switch(op){
        case 1:
            soma_numeros_complexos();break;
        case 2:
            modulo_numero_complexos();break;
        case 3:
            angulo_numero_complexo();break;
        case 0:break;
        default:
            printf("Opcao invalida\nDigite novamente sua opcao\n");
            system("PAUSE>>NULL");

        }
    }
    return 0;
}
