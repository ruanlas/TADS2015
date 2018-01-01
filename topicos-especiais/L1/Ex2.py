import math

def numerosPrimosAte(n):
    numerosPrimos = []
    numeros = list(range(1, n + 1))
    qtdDivisores = 0
    for numero in numeros:
        for divisor in list(range(1, numero + 1)):
            if numero%divisor == 0: #verifica quantos divisores a variavel 'numero' possui
                qtdDivisores = qtdDivisores + 1
        if qtdDivisores == 2:
            numerosPrimos.append(numero)
        qtdDivisores = 0

    return numerosPrimos

def main():
    print(numerosPrimosAte(44))

if __name__ == '__main__':
    main()