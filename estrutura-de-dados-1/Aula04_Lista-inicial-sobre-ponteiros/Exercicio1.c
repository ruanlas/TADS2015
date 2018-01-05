#include<stdio.h>
#include<stdlib.h>

int main(){

    int i = 99, j;
    int *p;
    p = &i;
    j = *p + 200;
    printf("O valor de J eh: %d\n", j);
    return 0;
}
