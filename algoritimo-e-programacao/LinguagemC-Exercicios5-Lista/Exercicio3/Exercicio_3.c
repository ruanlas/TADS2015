#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<string.h>

int main()
{
    int vetor[10];
    int i;
    int x=0;
    for (i=0; i<10;i++){
            x=x+2;
            vetor[i]=x;
        }

    for (i=0;i<10;i++){
        printf("Vetor %d = %d\n",i+1 ,vetor[i]);
    }
    return 0;
}
