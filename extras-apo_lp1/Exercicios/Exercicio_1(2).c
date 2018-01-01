#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int Vogal(char letra)
{
    switch (letra){
    case 'a':
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U':
        return 1;
        break;
    default:
        return 0;
        break;
    }
}

int main()
{
    char vogal='0';
    printf("Digite uma letra: ");
    scanf("%c", &vogal);
    if (Vogal(vogal)==1){
        printf("O caractere %c e uma vogal\n", vogal);
    }else{
        printf("O caractere %c e uma consoante\n", vogal);
    }
    return 0;
}
