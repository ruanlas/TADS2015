#include<stdio.h>
#include<stdlib.h>
#include<string.h>

    char frase[];
    int x;
    int i;

int main()
{
    printf("Digite uma frase: \n");
    gets(frase);
    // fgets(frase, 100, stdin); // fgets -> lê string, frase -> variável, 100 limite de caracteres, stdin-> entrada padrão
    setbuf(stdin,NULL);
    //scanf("%s", &frase);
    //fflush(stdin); limpa buffer teclado
    printf("Digite a quantidade de repeticoes: \n");
    scanf("%d", &x);
    for (i=1;i<=x;i++){
        printf("%s %d\n", frase ,i);
    }
    return 0;
}
