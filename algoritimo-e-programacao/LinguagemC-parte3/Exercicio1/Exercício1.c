#include<stdio.h>
#include<stdlib.h>
#include<math.h>

    int x,y, z;
int main()
{
    y = x = 10;
    printf ("Y= %d, X= %d\n", y,x);
    z = ++x;
    printf ("Z= %d\n", z);
    x = -x ;
    printf ("X= %d\n",x);
    y*=x+1;
    printf ("Y= %d\n", y);
    y++;
    printf ("Y= %d\n", y);
    x=x+y-(z--);
    printf ("X= %d\n", x);
    return 0;
}
