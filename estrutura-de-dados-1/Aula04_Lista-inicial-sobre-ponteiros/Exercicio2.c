#include<stdio.h>
#include<stdlib.h>

int main(){
    int x, y, *p;
    y = 0;
    p = &y;
    x = *p;
    printf("x = %d, *p = %d\n", x, *p);
    x = 4;
    printf("x = %d, *p = %d\n", x, *p);
    //*p = *p + 1;
    (*p++);
    //*p++;
    printf("x = %d, *p = %d\n", x, *p);
    --x;
    printf("x = %d, *p = %d\n", x, *p);
    //*p = *p + x;
    (*p) += x;
    printf("O valor de *p = %d, x = %d, y = %d\n", *p, x, y);
    return 0;
}
