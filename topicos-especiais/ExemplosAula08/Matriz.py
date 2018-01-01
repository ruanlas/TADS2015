import copy

class Matriz3x3:
    #matriz = []

    def __init__(self, linha1, linha2, linha3):
        #self.matriz.append(linha1)
        #self.matriz.append(linha2)
        #self.matriz.append(linha3)
        self.matriz = [linha1,linha2,linha3]
        #print(len(self.matriz[0]))


    def somaMatriz(self, matrizB):
        matrizResultante = []
        numLinhas = len(self.matriz)
        numColunas = len(self.matriz[0])

        for l in range(numLinhas):
            linha = []
            for c in range(numColunas):
                soma = self.matriz[l][c] + matrizB.matriz[l][c]
                linha.append(soma)
            matrizResultante.append(linha)

        return matrizResultante

    def multiplicacaoMatriz(self, matrizB):
        matrizResultante = []
        numLinhas = len(self.matriz)
        numColunas = len(self.matriz[0])
        #para verificar o nomero colunas
        #print ("numero colunas matriz: ", str(numColunas))
        for l in range(numLinhas):
            linha = []
            for c in range(numColunas):
                somaElemento = 0
                for slc in range(3):
                    #multiplica cada elemento da linha da matrizA com os elementos da coluna
                    #da matrizB. Por fim, soma-se as multiplicacoes
                    #ex = (mA[0][0]*mB[0][0]) + (mA[0][1]*mB[1][0]) + (mA[0][2]*mB[2][0])
                    multiplicacao = self.matriz[l][slc] * matrizB.matriz[slc][c]
                    somaElemento += multiplicacao
                    #print(slc, c, l)

                linha.append(somaElemento)
            matrizResultante.append(linha)

        return matrizResultante

    def determinanteMatriz(self):
        matrizTemp = copy.deepcopy(self.matriz)
        # matrizTemp = []
        # matrizTemp.append(self.matriz[0][:])
        # matrizTemp.append(self.matriz[1][:])
        # matrizTemp.append(self.matriz[2][:])
        linhaMatriz = len(self.matriz)
        colunaMatriz = len(self.matriz[0])

        for l in range(linhaMatriz):
            matrizTemp[l].append(matrizTemp[l][0])
            matrizTemp[l].append(matrizTemp[l][1])

        somaDiagonalPrincipal = 0

        for c in range(colunaMatriz):
            multiplicacao = matrizTemp[0][c] * matrizTemp[1][c +1] * matrizTemp[2][c + 2]
            somaDiagonalPrincipal += multiplicacao

        somaDiagonalSecundaria = 0
        inicioRange = colunaMatriz -1
        fimRange = len(matrizTemp[0])

        for c in range(inicioRange,fimRange):
            multiplicacao = matrizTemp[0][c] * matrizTemp[1][c -1] * matrizTemp[2][c - 2]
            somaDiagonalSecundaria += multiplicacao

        determinante = somaDiagonalPrincipal - somaDiagonalSecundaria
        return determinante
        #return (matrizTemp is self.matriz) => está retornando false