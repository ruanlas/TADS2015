import obd

def main():
    ports = obd.scanSerial()  # return list of valid USB or RF ports
    print(ports)

if __name__ == '__main__':
    main()