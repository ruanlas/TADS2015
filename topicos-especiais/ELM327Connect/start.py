import obd
#O bluetooth não esta funcionando
#O programa python não está conseguindo localizar o ELM327 conectado via interface Bluetooth
def main():
    #connection = obd.OBD()
    #c = obd.commands.RPM

    #if(connection.has_command(c)):
        #print(connection.query(c).value)


    connection = obd.OBD()  # auto-connects to USB or RF port

    cmd = obd.commands.RPM  # select an OBD command (sensor)

    response = connection.query(cmd)  # send the command, and parse the response

    print(response.value)  # returns unit-bearing values thanks to Pint
    print(response.value)  # user-friendly unit conversions

if __name__ == '__main__':
    main()