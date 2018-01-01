#include <stdio.h>
int main( )
{
 int i = 1;
 while ( i < 4 ) {
 int j = 0;
 while (j < 3 ) {
 int k = i + j;
 printf("%d + %d = %d \n", i, j, k);
 j++;
 }
 i++;
 }
 system ("PAUSE");
 return 0;
}
