
def numeroEhPrimo(numero):
    qtdDivisores = 0
    for divisor in list(range(1, numero + 1)):
        if numero%divisor == 0:
            qtdDivisores = qtdDivisores + 1
    if qtdDivisores == 2:
        return True
    else:
        return False

def main():
    n = 5
    print("O numero " + str(n) + " é primo?")
    print("Resposta: "+str(numeroEhPrimo(n)))

if __name__ == '__main__':
    main()