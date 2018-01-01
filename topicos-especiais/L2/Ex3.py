import random

def sortearPalavra():
    f = open("Ex3.txt", "r")
    arrayLine = []
    for line in f:
        arrayLine.append(line)

    print(arrayLine)
    numRamdom = random.randint(0,len(arrayLine)-1)
    return arrayLine[numRamdom]

def preencherForca(arrayForca, palavra, l):
    if(len(arrayForca) == 0):
        indice = 0
        for letra in palavra:
            arrayForca.insert(indice, "_")
            if(letra == l):
                arrayForca.insert(indice, l)
            indice += 1
    else:
        indice = 0
        for letra in palavra:
            if(arrayForca[indice] == "_"):
                arrayForca.pop(indice) #apaga o elemento na posicao do indice
                arrayForca.insert(indice, "_") #insere o elemento na mesma posicao do indice
            if(letra == l):
                arrayForca.pop(indice)
                arrayForca.insert(indice, l)
            indice += 1
    return arrayForca


def main():
    palavra = sortearPalavra()
    i = 0;
    forca = []
    while(i < 6):
        l = input("Informe uma letra")
        forca = preencherForca(forca, palavra, l)

        print(forca)
        i +=1



if __name__ == '__main__':
    main()

#quando executa, sempre sobra 1 ou 2 caracteres no final