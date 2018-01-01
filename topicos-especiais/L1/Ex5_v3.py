import sys

# Não entendi como fazer a 5a nem a 5b
# Como retornar uma tupla contendo a lista?
# Como fazer a interação da 5b?? deverá fazer um controle com while e solicitar
# imput do usuário para selecionar a função??

def criacaoArquiviTXT(nomeArquivo, texto):
    f = open(str(nomeArquivo)+".txt", "wt")
    f.seek(0)
    linhasArq = texto.split("%") #ira devolver um array com as linhas
    for linha in linhasArq:
        f.write(linha + "\n")
    f.close()
    print(f)

def procuraPalavra(nomeArquivo, palavra):
    f = open(str(nomeArquivo)+".txt", "rt")
    f.seek(0)
    linhasArq = f.readlines()
    numLinha = 0;
    achouPalavra = False

    for linha in linhasArq:
        numLinha += 1
        if palavra in linha:
            achouPalavra = True
            break

    if achouPalavra == True:
        return numLinha
    else:
        return -1



if __name__ == '__main__':
    nomeArquivo = sys.argv[1]
    texto = sys.argv[2]
    # nomeArquivo = "teste"
    # palavra = "Dioo"
    criacaoArquiviTXT(nomeArquivo, texto)
    # print(procuraPalavra(nomeArquivo, palavra))
