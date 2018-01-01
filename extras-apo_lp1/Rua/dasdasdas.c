#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<conio.h>
    char palavra[];
    int x;
    int i;
int main()
{
    printf("Digite uma palavra: \n");
    gets(palavra);
    setbuf(stdin,NULL);
    printf("Digite um numero de repeticoes: \n");
    scanf("%d", &x);

    for (i=1;i<=x;i++){
        printf("%s %d\n", palavra, i);
    }
    return 0;
}
