from Ex5 import retangulo
from Ex4 import converterDataExtenso
from Ex4 import converterStringToData
import sys
import random
import datetime

def testeConversao(quantidadeTestes):
    for i in range(quantidadeTestes):
        dia = random.randint(1,30)
        mes = random.randint(1,12)
        ano = random.randint(2000,2017)
        myDate = datetime.date(ano,mes,dia)
        print(converterDataExtenso(myDate))


def testeDesenho(quantidadeTestes):
    for i in range(quantidadeTestes):
        linha = random.randint(0, 40)
        coluna = random.randint(0, 40)
        retangulo(linha, coluna)

if __name__ == '__main__':
    # numTestConversao = sys.argv[1]
    # numTesteDesenho = sys.argv[2]
    numTestConversao = int(input("Digite a quantidade de testes para Conversao"))
    numTesteDesenho = int(input("Digite a quantidade de testes para Desenho"))
    testeConversao(numTestConversao)
    testeDesenho(numTesteDesenho)
