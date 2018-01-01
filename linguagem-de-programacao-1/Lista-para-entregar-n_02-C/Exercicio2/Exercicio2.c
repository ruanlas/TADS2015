#include<stdio.h>
#include<stdlib.h>
#include<string.h> // Biblioteca de String

#define comparativo "poderoso"
    char senha[]; // comparativo[] = "poderoso";
    int qtd = 1;

int main() //int main(int argc, char *argv[])
{
    printf("Digite sua senha para se conectar no sistema\n");
    gets(senha);
   // scanf("%s", &senha);
    setbuf(stdin,NULL); // esvazia o buffer do teclado
 /* (strcmp(senha, comparativo) != 0) essa função compara strings.
 se o retorno for = 0, as strings são iguais, se o retorno for diferente de 0, as strings são diferentes
 */
    while (strcmp(senha, comparativo) != 0){
        printf("Esta e a sua %d tentativa de acesso sem sucesso\n\n", qtd);
        printf("Digite sua senha novamente\n");
        scanf("%s", &senha);

        qtd = qtd + 1;
            if (qtd == 5){
                break;
            }
    }

    if (strcmp(senha, comparativo) == 0){
        printf("Acesso Liberado!!!!!!!!\n\n");
    }else{
        printf("Verifique sua senha e tente novamente mais tarde!\n\n");
        }

    return 0;
}
