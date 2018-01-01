#Ex => matriz = [[3,1,6], [2,4,0], [9,4,2]] (cada linha da matriz eh uma lista de num)

from Matriz import Matriz3x3

def main():
    matriz = Matriz3x3([2,5,6],[1,6,7],[-1,2,3])
    print(matriz.matriz)
    matrizB = Matriz3x3([1,0,0],[0,1,0],[0,0,1])
    # print(matrizB.matriz)
    print(matriz.determinanteMatriz()) #quando calcula o determinante, altera as colunas da matriz
    print(matriz.matriz)
    print(matriz.multiplicacaoMatriz(matrizB))
    #print(matriz.matriz[0][4])



if __name__ == '__main__':
    main()
