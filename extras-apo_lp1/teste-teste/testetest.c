#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int main()
{
    int i=0;
    char palavra[100];
    printf("Digite uma palavra: ");
    fflush(stdin);
    scanf("%[^\n]s", &palavra); // %[^\n]s => Captura a string até a tecla enter
    for (i=0;i<4;i++){
        printf("%s\n", palavra);
    }
    return 0;
}
