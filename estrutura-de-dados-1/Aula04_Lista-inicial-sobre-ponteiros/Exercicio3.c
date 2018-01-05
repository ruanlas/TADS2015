#include<stdio.h>
#include<stdlib.h>

int main(){
    int mat[4], *p, x;
    p = mat + 1;
    //p = mat++;
    //p = ++mat;
    x = (*mat)++;
    printf("p = %d/,*mat = %d/,mat = %d/,x = %d", p, *mat, mat, x);
    return 0;
}
