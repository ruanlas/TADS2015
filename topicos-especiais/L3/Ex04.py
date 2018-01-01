import string

## Nao entendi como usar as dicas do exercicio. TIRAR DUVIDA

def numeroOcorrenciasPalavra(nomeArquivo, palavra):
    f = open(str(nomeArquivo)+".txt", "rt")
    f.seek(0)
    linhasArq = f.readlines()
    numOcorrencia = 0;
    achouPalavra = False

    for linha in linhasArq:
        if palavra in linha.lower():
            numOcorrencia += 1

    return numOcorrencia

if __name__ == '__main__':
    print(numeroOcorrenciasPalavra("alice", "alice"))