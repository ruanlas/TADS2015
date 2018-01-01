#include <stdio.h>
#include <stdlib.h>

int main()
{

    int col, lin;
    int tabela[3][3];

    for (lin = 0; lin < 3; lin++){
            printf("Informe o valor do produto %i: ", lin + 1);
            scanf("%i", &tabela[lin][0]);
            printf("Informe o percentual de desconto %i: ", lin + 1);
            scanf("%i", &tabela[lin][1]);
            printf("\n");
    }

    for (lin = 0; lin < 3; lin++){
        tabela[lin][2] = tabela[lin][0] - (tabela[lin][0] * tabela[lin][1])/100;
        }
        printf("\n");

    printf("PRECO\tDESC\tVENDA\n");

    for (lin = 0; lin < 3; lin++){

        for (col = 0; col < 3; col++){
            printf("%i\t", tabela[lin][col]);
        }
        printf("\n");
    }


    return 0;
}
