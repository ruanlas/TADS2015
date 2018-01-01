
def main():
    agendaContato = {}

    tamanhoAgenda = int(input("Digite o tamanho que terá sua agenda de contatos"))

    for i in range(tamanhoAgenda):
        nome = input("Informe o nome do contato")
        telefone = input("Informa o telefone do contato")
        agendaContato[nome] = telefone

    print(agendaContato)

if __name__ == '__main__':
    main()

