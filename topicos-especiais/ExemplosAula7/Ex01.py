import math
import sys

class OpError(Exception): #Criacao da classe de excessão -> Herdando da classe genérica Exception
    def __init__(self):
        self.nameError = "Erro de Operador"

def calculadora(num1, num2, operador):
    if(operador == "+"):
        return adicao(num1,num2)
    elif(operador == "-"):
        return subtracao(num1, num2)
    elif(operador == "*"):
        return multiplicacao(num1, num2)
    elif(operador == "/"):
        return divisao(num1, num2)
    else:
        raise OpError
        #return TypeError
        #return "Operador nao identificado"

def adicao(num1, num2):
    total = num1 + num2
    return total
def subtracao(num1, num2):
    total = num1 - num2
    return total
def multiplicacao(num1, num2):
    total = num1 * num2
    return total
def divisao(num1, num2):
    total = num1 / num2
    return total

def main():
    #numero1 = input("Digite um numero")
    #numero2 = input("Digite outro numero")
    #operador = input("Digite o operador")
    numero1 = sys.argv[1]
    numero2 = sys.argv[2]
    operador = sys.argv[3]

    try:
        print("Resultado: "+ str(calculadora(float(numero1), float(numero2), operador)))
    except ValueError:
        print("Erro: Nao foi possivel calcular pois um dos numeros informados sao invalidos")
    except ZeroDivisionError:
        print("Erro: Nao foi possivel efetuar o calculo de uma divisao por 0")
    except OpError:
        print("Erro: Operador nao identificado")
    #except TypeError:
        #print("Erro: Operador nao identificado")
if __name__ == '__main__':
    main()
    #ZeroDivisionError
    #ValueError
