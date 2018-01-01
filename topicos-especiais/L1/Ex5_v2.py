import sys

# Não entendi como fazer a 5a nem a 5b
# Como retornar uma tupla contendo a lista?
# Como fazer a interação da 5b?? deverá fazer um controle com while e solicitar
# imput do usuário para selecionar a função??

def criacaoArquiviTXT():
    nomeArquivo = sys.argv[1]
    texto = sys.argv[2]
    f = open(str(nomeArquivo)+".txt", "wt")
    f.seek(0)
    f.write(texto)
    f.close()
    print(f)

def procuraPalavra(nomeArquivo, palavra):
    f = open(str(nomeArquivo)+".txt", "rt")
    f.seek(0)
    texto = f.read()
    return texto.find(palavra)

if __name__ == '__main__':
    criacaoArquiviTXT()
