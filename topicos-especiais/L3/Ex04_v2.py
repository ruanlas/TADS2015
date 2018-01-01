import string

def numeroOcorrenciasPalavra(nomeArquivo, palavra):
    f = open(str(nomeArquivo)+".txt", "rt")
    f.seek(0)
    linhasArq = f.readlines()

    numOcorrencia = 0;

    for linha in linhasArq:
        for caractereEsp in string.punctuation:
            if caractereEsp in linha:
                linha.replace(caractereEsp, '')

    for linha in linhasArq:
        if palavra in linha.lower():
            numOcorrencia += 1

    return numOcorrencia

if __name__ == '__main__':
    print(numeroOcorrenciasPalavra("alice", "alice"))