#include<stdio.h>
#include<stdlib.h>
#include<string.h> // Biblioteca de String

#define comparativo "poderoso"
    char senha[];
    int qtd = 1;

int main()
{
    printf("Digite sua senha para se conectar no sistema\n");
    gets(senha);
    setbuf(stdin,NULL); // esvazia o buffer do teclado
 /* (strcmp(senha, comparativo) != 0) essa função compara strings.
 se o retorno for = 0, as strings são iguais, se o retorno for diferente de 0, as strings são diferentes
 */
    while (strcmp(senha, comparativo) != 0){ //início do loop infinito. O loop só se desfaz quando a String for igual a "poderoso"
        printf("Esta e a sua %d tentativa de acesso sem sucesso\n\n", qtd);
        printf("Digite sua senha novamente\n");
        scanf("%s", &senha);

        qtd = qtd + 1;//contador do loop
            if (qtd == 5){ //se caso o programa der um loop maior maior ou igual a 5, ele sai do laço
                break;
            }
    }

    if (strcmp(senha, comparativo) == 0){ //condicional, se caso a "senha" inserida for "poderoso", ele dara acesso concedido
        printf("Acesso Liberado!!!!!!!!\n\n");
    }else{
        printf("Verifique sua senha e tente novamente mais tarde!\n\n");
        }

    return 0;
}
