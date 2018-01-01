import math
#melhorar, tornar mais legível estes métodos/funções.....
class NumerosComplexos:
    def __init__(self, numReal, numImaginario):
        self.numReal = numReal
        self.numImaginario = numImaginario

    def adicao(self,numeroComplexo):
        somaReal = self.numReal + numeroComplexo.numReal
        somaImaginario = self.numImaginario + numeroComplexo.numImaginario
        return str(somaReal)+"+"+str(somaImaginario)+"i"

    def subtracao(self,numeroComplexo):
        subtracaoReal = self.numReal - numeroComplexo.numReal
        subtracaoImaginario = self.numImaginario - numeroComplexo.numImaginario
        return str(subtracaoReal)+"+"+str(subtracaoImaginario)+"i"

    def multiplicacao(self,numeroComplexo):
        multiplicacaoReal = (self.numReal * numeroComplexo.numReal) - (self.numImaginario * numeroComplexo.numImaginario)
        multiplicacaoImaginario = (self.numReal * numeroComplexo.numImaginario) + (self.numImaginario * numeroComplexo.numReal)
        return str(multiplicacaoReal)+"+"+str(multiplicacaoImaginario)+"i"

    def divisao(self,numeroComplexo):
        divisaoReal = ((self.numReal * numeroComplexo.numReal) + (self.numImaginario * numeroComplexo.numImaginario)) / (math.pow(numeroComplexo.numReal,2) + math.pow(numeroComplexo.numImaginario, 2))
        divisaoImaginario = ((self.numImaginario * numeroComplexo.numReal) - (self.numReal * numeroComplexo.numImaginario)) / (math.pow(numeroComplexo.numReal,2) + math.pow(numeroComplexo.numImaginario, 2))
        return str(divisaoReal)+"+"+str(divisaoImaginario)+"i"