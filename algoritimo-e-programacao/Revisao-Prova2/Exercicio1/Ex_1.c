#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    int i=0, n =1001;
    char frase[101];
    printf("Digite uma frase:\n");
    gets(frase);
    //scanf("%[^\n]s", &frase)
    while (n>1000){
    printf("Digite um numero de repeticoes menor ou igual a 1000\n");
    scanf("%d", &n);
    }
    for (i=1; i<=n; i++){
            printf("%s %d\n", frase, i);
        }
    return 0;
}
