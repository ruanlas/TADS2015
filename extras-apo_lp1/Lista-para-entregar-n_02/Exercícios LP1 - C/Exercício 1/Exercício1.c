#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main ()
{
    float resultado, valor, subtotal, comparativo;
    int qtd;//variavel que conta quantos valores você digita
    comparativo = 555.55;
    printf ("Calculo da diferenca de um valor para um inteiro mais proximo\n\n");
    qtd = 0;
    while ( valor != comparativo ){ // loop infinito. O programa só termina quando o usuario digitar o valor 555.55
        printf ("Digite o Valor: R$ ");
        scanf("%f", &valor);

        if ( valor == trunc(valor) ){
            resultado = 0;
        } else {
            resultado = 1 - (valor - trunc(valor));// função trunk pega a parte inteira do numero
            printf("A diferenca e de: %.2f\n", resultado); // %.(numero)f - o número diz quantas casas decimais vc quer exibir
            }
        subtotal = subtotal + resultado;
        qtd = qtd + 1; // a cada vez que o programa é rodado, ele soma para saber quantos valores foram inseridos
        printf("Subtotais: R$ %.2f \n\n", subtotal);// mostra o resultado na tela, totalizando as diferenças
    }
    printf("Quantidade de valores digitados: %d\n", qtd); // mosttra quantos valores foram digitados
    printf ("Valor total das diferecas: R$ %.2f\n", subtotal); //mostra na tela o total geral das diferenças

    return 0;
}
