#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void Dec_Bin(int x)
{
    int resto = x%2;
    if (x>0){
       (Dec_Bin(x/2));
        printf("%d", resto);
        }
    }
int main()
{
    int x=0;
    printf("Digite um numero: ");
    scanf("%d", &x);
    printf("O numero %d em Binario fica: ", x);
    Dec_Bin(x);
    return 0;
}
