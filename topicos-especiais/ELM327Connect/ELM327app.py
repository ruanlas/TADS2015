import obd

def main():

    connection = obd.OBD() #faz conexao automatica com o dispositivo
    c = obd.commands.RPM #executa o comando de leitura

    if(connection.has_command(c)): #verifica se o comando eh reconhecido
        print(connection.query(c).value) #informa o valor recebido


if __name__ == '__main__':
    main()