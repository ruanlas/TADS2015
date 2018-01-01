#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
    char string[100];
    char string2[100];
    int tamanho_string=0;
    int i,j=0;
    for (i=0;i<99;i++){
        string2[i]=' ';
    }
    printf("Digite uma frase de ate 100 caracteres:\n");
    gets(string);
    tamanho_string=strlen(string);
    for (i=tamanho_string-1;i>=0;i--){
        string2[j]=string[i];
        j++;
    }
    for (i=0; i<tamanho_string;i++){
        if (string2[i]=='o'||string2[i]=='O'||string2[i]=='A'||string2[i]=='a'||string2[i]=='e'||string2[i]=='E'||string2[i]=='i'||string2[i]=='I'||string2[i]=='u'||string2[i]=='U'||string2[i]==' '){
        string2[i]=string2[i];
    } else {
        string2[i]='#';
    }
    }
    printf("%s", string2);
    return 0;
}
