

def retangulo(linhas,colunas):
    if(linhas < 1):
        linhas = 1
    if(linhas > 20):
        linhas = 20
    if(colunas < 1):
        colunas = 1
    if(colunas > 20):
        colunas = 20

    i = 0
    while(i < linhas+2):
        j = 0
        while(j < colunas+2):
            if(i == 0 and j == 0 or
               i == linhas+1 and j == 0):
                print("+", end="")
            elif(i == 0 and j == colunas+1 or
               i == linhas+1 and j == colunas+1):
                print("+")
            elif(i>0 and i<linhas+1 and j == 0):
                print("|", end="")
            elif(i>0 and i<linhas+1 and j == colunas+1):
                print("|")
            elif(i==0 and j>0 and j<colunas+1):
                print("-", end="")
            elif (i == linhas+1 and j > 0 and j < colunas+1):
                print("-", end="")
            else:
                print(" ", end="")
            j+=1
        i+=1


if __name__ == '__main__':
    retangulo(3,10)