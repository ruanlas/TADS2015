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
    setbuf(stdin,NULL);
    printf("Digite a quantidade de repeticoes: \n");
    scanf("%d", &x);
    for (i=1;i<=x;i++){
        printf("%s %d\n", frase ,i);
    }
    return 0;
}
