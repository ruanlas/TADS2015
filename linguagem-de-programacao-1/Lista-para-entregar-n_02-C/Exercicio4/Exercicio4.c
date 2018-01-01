#include<stdio.h>
#include<stdlib.h>

float real, cotacao, resultado, diferenca, comparativo = 50.00;
int main()
{
    printf("Calculo da cotacao do dolar e comparacao do limite de importacao\n");
    printf("Insira o valor em Real: R$ \n");
    scanf("%f", &real);
    printf("Insira a cotacao do dolar: R$ \n");
    scanf("%f", &cotacao);

    resultado = real / cotacao;
    printf("R$ %.2f -> US$ %.2f\n", real, resultado);

    if (resultado == comparativo){
        printf("O Valor esta no limite\n");
    } else if (resultado < comparativo) {
        diferenca = comparativo - resultado;
        printf("Faltam US$ %.2f para completar o limite\n", diferenca );
    } else{
        diferenca = resultado - comparativo;
        printf("O limite foi superado com US$ %.2f acima do limite\n", diferenca);
    }
    return 0;
}
