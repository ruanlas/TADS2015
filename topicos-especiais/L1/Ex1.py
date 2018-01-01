import math

def eliminaNumerosRepetidos(listaNumeros):
    numerosSemRepeticao = []
    for numero in listaNumeros:
        if numerosSemRepeticao.count(numero)<1:
            numerosSemRepeticao.append(numero)
    return numerosSemRepeticao



def main():
    numeros = [3, 5, 7, 8, 9, 4, 3, 4, 7, 90, 8, 1, 23, 9]
    print("Lista com numeros repetidos:")
    print(numeros)
    print()
    print("Lista sem numeros repetidos:")
    print(eliminaNumerosRepetidos(numeros))

if __name__== "__main__":
    main()