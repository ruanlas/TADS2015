import math
import sys

#????????? Não entendi o Exercicio
# O que devo passar como parâmetro na chamada???
# OK, certo!!

def senoCosseno():
    listaGraus = list(range(0, 360 + 1, 10))
    for graus in listaGraus:
        print("Grau(s): ", graus, "° |Sen: ", math.sin(graus), " |Cos: ", math.cos(graus))


def main():
    senoCosseno()

if __name__ == '__main__':
    main()