import datetime

def converterStringToData(parametro):
    partes = parametro.split('/')
    if(int(partes[0]) > 31 or int(partes[1]) > 12):
        return None
    myDate = datetime.date(int(partes[2]), int(partes[1]), int(partes[0]))
    return myDate

def converterDataExtenso(parametroData):
    meses = ['Janeiro', 'Fevereiro', 'Marco', 'Abril', 'Maio',
             'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro',
             'Novembro', 'Dezembro']
    mes = parametroData.month - 1
    data = str(parametroData.day)+ " de "+ meses[mes] + " de " +str(parametroData.year)
    return data

if __name__ == '__main__':
    print(converterDataExtenso(converterStringToData("03/09/2017")))
    print(converterDataExtenso(datetime.date.today()))