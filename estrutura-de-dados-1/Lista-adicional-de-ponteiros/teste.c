#include<stdio.h>
#include<stdlib.h>

int main(){
    int x = 10, *px=&x, **ppx=&x;
    float y=5.8, *py = &y, **ppy=&py;
*ppx++;
    printf("*ppx = %p\n &x = %p\n &*px = %p", *ppx, &x, &px);
    printf("*ppy = %p\n &y = %p\n &*py = %p", **ppy, &y, &py);

    return 0;
}
