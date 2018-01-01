
def criacaoArquiviTXT(nomeArquivo, texto):
    f = open(str(nomeArquivo)+".txt", "w")
    f.write(texto)
    f.close()
    print(f)

def procuraPalavra(nomeArquivo, palavra):
    f = open(str(nomeArquivo)+".txt", "r")
    texto = f.read()
    return texto.find(palavra)

def main():
    nome = "teste"
    texto = "ola mundo!!!\nOla Mundos novamente!!!"
    criacaoArquiviTXT(nome, texto)

    print(procuraPalavra(nome, "Ola"))

if __name__ == '__main__':
    main()