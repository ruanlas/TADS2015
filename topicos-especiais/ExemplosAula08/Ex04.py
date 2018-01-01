from NumerosComplexos import NumerosComplexos
#import math

def main():
    numeroComplexo = NumerosComplexos(2,3)
    print(numeroComplexo.adicao(NumerosComplexos(2,4)))
    print(numeroComplexo.subtracao(NumerosComplexos(3,6)))
    print(numeroComplexo.multiplicacao(NumerosComplexos(3,2)))
    print(numeroComplexo.divisao(NumerosComplexos(1,2)))
    #print(math.pow(2,5))

if __name__ == '__main__':
    main()