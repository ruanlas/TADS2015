import sys
# Pelo terminal da 0.0, e pelo console dá certo, PQ????
def serie():
    n = int(sys.argv[1])
    #n = 6
    listaN = list(range(1, n + 1))
    listaM = []
    total = 0
    for n in listaN:
        listaM.append(n+2)
    i = 0
    while (i < len(listaN)):
        total += float(listaN[i]/listaM[i])
        i += 1
    return total

def main():
    print(serie())

if __name__ == '__main__':
    main()