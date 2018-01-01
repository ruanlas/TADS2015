#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#include<math.h>

struct cadastros{
    char cod[9];
    int leite_prod_sem; //informação em litros
    int alim_inge_sem; // informação em quilos
    char abate;
    struct nascimento{
        int mes;
        int ano;
    } data;
} gado[2000];

void Menu_principal()
{
    system("cls");
    printf("MIMOSAS\n-------\n");
    printf("Selecione as Opcoes\n-------------------\n");
    printf(" 1 - Cadastros de cabeca de gado\n");
    printf(" 2 - Consulta gado\n");
    printf(" 3 - Consulta da quantidade de leite produzido por semana\n");
    printf(" 4 - Consulta da quantidade de alimento consumido por semana\n");
    printf(" 5 - Quantidade de leite produzido por semana apos o abate\n");
    printf(" 6 - Quantidade de alimento consumido por semana apos o abate\n");
    printf(" 7 - Quantidade de cabeças de gado que irao para abate\n");
    printf(" 0 - Sair\n");
}
int K=1;
void Cadastros()
{
    void Abate(int x);
    //int i=1;
    int controle = 8;
    system("cls");
    if (K==1){
    while (controle!=0){
        printf("Digite o codigo da cabeca de gado: ");
        fflush(stdin);
        gets(gado[K].cod);
        printf("Digite a quantidade de leite produzidos por semana, em litros: ");
        scanf("%d", &gado[K].leite_prod_sem);
        printf("Digite a quantidade de alimento consumidos por semana, em quilos: ");
        scanf("%d", &gado[K].alim_inge_sem);
        gado[K].data.mes=24;
        gado[K].data.ano=2020;
        while (gado[K].data.mes>12){
            printf("Digite o mes de nascimento: ");
            scanf("%d", &gado[K].data.mes);
    }
        while(gado[K].data.ano>2015){
            printf("Digite o ano de nascimento: ");
            scanf("%d", &gado[K].data.ano);
        }
        Abate(K);
        printf("Precione qualquer tecla para continuar ou 0 para sair\n");
        scanf("%d", &controle);
        if (controle!=0){
            K++;
        }
        if (K>=2000){
            break;
        }
    }
}else{
    K++;
    while(K<=2000){
        printf("Digite o codigo da cabeca de gado: ");
        fflush(stdin);
        gets(gado[K].cod);
        printf("Digite a quantidade de leite produzidos por semana, em litros: ");
        scanf("%d", &gado[K].leite_prod_sem);
        printf("Digite a quantidade de alimento consumidos por semana, em quilos: ");
        scanf("%d", &gado[K].alim_inge_sem);
        gado[K].data.mes=24;
        gado[K].data.ano=2020;
        while (gado[K].data.mes>12){
            printf("Digite o mes de nascimento: ");
            scanf("%d", &gado[K].data.mes);
    }
        while(gado[K].data.ano>2015){
            printf("Digite o ano de nascimento: ");
            scanf("%d", &gado[K].data.ano);
        }
        Abate(K);
        printf("Precione qualquer tecla para continuar ou 0 para sair\n");
        scanf("%d", &controle);
        if (controle==0){
            break;
        }else{
        K++;
        }
    }
}
}
void Abate(int x)
{
    if (gado[x].data.ano ==2010 && gado[x].data.mes<=5){
        gado[x].abate='S';
        //strcpy(gado[x].abate,'S');
    }else if(gado[x].data.ano<2010){
        gado[x].abate='S';
        //strcpy(gado[x].abate,'S');
    }else if(gado[x].leite_prod_sem<40){
        gado[x].abate='S';
        //strcpy(gado[x].abate,'S');
    }else if(gado[x].leite_prod_sem>=50 && gado[x].leite_prod_sem<=70 && gado[x].alim_inge_sem>50){
        gado[x].abate='S';
        //strcpy(gado[x].abate, 'S');
    }else{
        gado[x].abate='N';
        //strcpy(gado[x].abate, 'N');
    }
}
void Leite_Prod()
{
    int soma=0;
    int i;
    system("cls");
    for (i=1;i<=2000;i++){
        soma=soma+gado[i].leite_prod_sem;
    }
    printf("A quantidade de leite produzida por semana e de: %d litros\n\n", soma);
    printf("Precione qualquer tecla para voltar ao menu\n");
    system("PAUSE>>NULL");
}
void Alim_Cons()
{
    int soma=0;
    int i;
    system("cls");
    for (i=1; i<=2000; i++){
        soma=soma+gado[i].alim_inge_sem;
    }
    printf("A quantidade de alimentos consumidos por semana e de: %d quilos\n\n", soma);
    printf("Precione qualquer tecla para voltar ao menu\n");
    system("PAUSE>>NULL");
}
void Leite_Prod_posAbate()
{
    int soma=0;
    int i;
    system("cls");
    for (i=1;i<=2000;i++){
        if(gado[i].abate=='N'){
            soma=soma+gado[i].leite_prod_sem;
        }
    }
    printf("A quantidade de leite que sera produzido apos o abate sera de: %d litros\n\n", soma);
    printf("Precione qualquer tecla para voltar ao menu\n");
    system("PAUSE>>NULL");
}
void Alim_Cons_posAbate()
{
    int soma=0;
    int i;
    system("cls");
    for (i=1;i<=2000;i++){
        if (gado[i].abate=='N'){
            soma=soma+gado[i].alim_inge_sem;
        }
    }
    printf("A quantidade de alimento que sera consumido apos o abate sera de: %d quilos\n\n", soma);
    printf("Precione qualquer tecla para voltar ao menu\n");
    system("PAUSE>>NULL");
}
void Cabecas_abate()
{
    int soma=0;
    int i;
    system("cls");
    for (i=1;i<=2000;i++){
        if (gado[i].abate=='N'){
            soma=soma+1;
        }
    }
    printf("Quantidade de gados que irao para abate: %d cabecas\n\n", soma);
    printf("Precione qualquer tecla para voltar ao menu\n");
    system("PAUSE>>NULL");
}
void Verificar_dados()
{
    int i=1;
    int controle=9;
    system("cls");
    while (controle!=0){
            system("cls");
        printf("Cod: %s\n", gado[i].cod);
        printf("Leite: %d\n", gado[i].leite_prod_sem);
        printf("Alimento: %d\n", gado[i].alim_inge_sem);
        printf("Ano nascimento: %d\n", gado[i].data.ano);
        printf("Mes nascimento: %d\n", gado[i].data.mes);
        printf("Abate: %c\n", gado[i].abate);
        printf("\n");
        printf("Deseja consultar o proximo?\nPrecione qualquer tecla para sim ou digite 0 para sair\n");
        scanf("%d", &controle);
        if (controle!=0){
            i++;
        }
    }

}
int main()
{
    int i;
    int op=9;
    while(op!=0){
        Menu_principal();
        scanf("%d", &op);
        switch(op){
            case 1:
                Cadastros(); break;
            case 2:
                Verificar_dados();break;
            case 3:
                Leite_Prod();break;
            case 4:
                Alim_Cons(); break;
            case 5:
                Leite_Prod_posAbate();break;
            case 6:
                Alim_Cons_posAbate();break;
            case 7:
                Cabecas_abate();break;
            case 0:
            break;
            default:
                printf ("Opcao invalida\nPressione <enter> e digite novamente sua opcao\n");
                system("PAUSE>>NULL");
                break;

        }
    }
    system("PAUSE");
    return 0;
}
