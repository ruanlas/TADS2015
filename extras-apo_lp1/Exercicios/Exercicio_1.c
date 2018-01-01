#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int Vogal(char letra)
{
    if (letra=='a' || letra=='A' || letra=='e' || letra=='E' || letra=='i' || letra=='I' || letra=='o' || letra=='O'|| letra=='u' || letra=='U'){
        return 1;
    }else{
        return 0;
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
