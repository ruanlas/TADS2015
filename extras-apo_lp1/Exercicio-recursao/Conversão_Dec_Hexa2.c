#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void Dec_Hexa(int x)
{
    int resto = x%16;
    if (x>0){
       (Dec_Hexa(x/16));
        switch (resto){
            case 10: printf("A");break;
            case 11: printf("B");break;
            case 12: printf("C");break;
            case 13: printf("D");break;
            case 14: printf("E");break;
            case 15: printf("F");break;
            default: printf("%d", resto);break;
        }
    }
}
int main()
{
    int x=0;
    printf("Digite um numero: ");
    scanf("%d", &x);
    printf("O numero %d em Hexadecimal fica: ", x);
    Dec_Hexa(x);
    return 0;
}
