
def criarListaContatos(tamanho):
    listaContatos = {}
    i = 0;
    while i < tamanho:
        chave = input("Informe o nome do contato")
        valor = input("Informe o numero do contato")
        listaContatos[chave] = valor
        i += 1
    return listaContatos

def main():
    tamanhoLista = int(input("Informe o tamanho da lista de contatos"))
    print(criarListaContatos(tamanhoLista))

if __name__ == '__main__':
    main()