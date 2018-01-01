#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<math.h>
#include<limits.h>

struct hab { //estrutura com o tipo hab
    int numFilhos;
    float salario;
};
int leituraInt(int x)//função que executa a leitura dos dados inteiros(numero de filhos)
{
    scanf("%d", &x);
    return (x);
}

float leituraFloat(float x)//função que executa a leitura dos dados inseridos(salário dos habitantes)
{
    scanf("%f", &x);
    return (x);
}
float mediaSalario(float x, int y)//função que calcula a média dos salários
{
    float media=0;
    media=x/y;
    return (media);
}
float mediaFilhos(float x, int y)//função que retorna a média dos filhos
{
    float media=0;
    media=x/y;
    return (media);
}
int verificacaoSalario(float x)//função que verifica quantas pssoas ganham acima de 750
{
    if ( x > 750){
        return 0;
    } else {
        return 1;
    }
}
float PercentualAcima750(float x, int y)//função que calcula o percentual de pessoas que ganham acima de 750
{
    float porcentagem;
    porcentagem=(x/y)*100;
    return (porcentagem);
}
//int M = INT_MAX;
int main(int argc, char *argv[])
{
    struct hab pes[3000]; //declaração de um vetor
    int controle, cont, x, i;
    float y, somaSalario, somaFilhos, GanhaAcima750, maior;
    maior=0;
    GanhaAcima750=0;
    somaFilhos=0;
    somaSalario=0;
    y=0;
    x=0;
    controle = 1;
    cont=1;
    while ( controle != 0){//loop infinito. Ele sai da execução quando o numero 0 for digitado
            system("cls");
        printf("PESQUISA ENTRE OS HABITANTES\n----------------------------\n");
        printf("Digite quantos filhos voce tem: \n");
        pes[cont].numFilhos = leituraInt(x);
        printf("Digite seu salario: \n");
        pes[cont].salario=leituraFloat(y);
        printf("\n\nDeseja continuar?\nPrecione qualquer tecla para continuar ou digite 0 para sair\n");
        controle=leituraInt(x);//variavel de controle do loop
        somaSalario=somaSalario+pes[cont].salario;
        somaFilhos=somaFilhos+pes[cont].numFilhos;
        if (controle!=0){
            cont=cont+1;//contador que conta quantas pessoas estão sendo entrevistadas dentro do loop
        }
    }
    for (i=1; i<= cont; i++){
        GanhaAcima750 = GanhaAcima750 + verificacaoSalario(pes[i].salario);//chamada da função que verifica quantas pessoas ganham mais que 750
    }
    for (i=1; i<= cont;  i++){//bloco que verifica qual é o maior salário
            if (pes[i].salario>maior){
                maior=pes[i].salario;
            }else{
                maior=maior;
            }

    }
    system("cls");
    printf("RELATORIO\n---------\n");
    printf("\n\nPessoas Entrevistadas: %d\n", cont);
    printf("A media de salario da populacao entrevistada e: R$%.2f\n", mediaSalario(somaSalario,cont));
    printf("A media de filhos por habitante e de: %.2f filhos\n", mediaFilhos(somaFilhos,cont));
    printf("O percentual de pessoas que ganham ate R$ 750.00 e: %.2f%%\n", PercentualAcima750(GanhaAcima750,cont));
    printf("O maior salario foi: R$%.2f\n", maior);
    system("PAUSE>>NULL");

    return 0;
}
