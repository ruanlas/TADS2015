#include <stdio.h>
#include <stdlib.h>
void recursaoHexa(int num){
    int numeroACalcular;
    char resto;

    if(resto < 16 && resto >=0){
        printf("%d", resto);

    }else{

        numeroACalcular = num/16;

        resto = num % 16;

        recursaoHexa(numeroACalcular);

        switch (resto){
            case 10: resto = 'A'; break;
            case 11: resto = 'B';break;
            case 12: resto = 'C'; break;
            case 13: resto = 'D'; break;
            case 14: resto = 'E'; break;
            case 15: resto = 'F'; break;
        }
        resto = num % 16;
        printf("%d", resto) ;

    }

}
int main()
{
    char teste;

    recursaoHexa(100);

    printf("%c", teste);
    return 0;
}
