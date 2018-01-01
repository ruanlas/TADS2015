#Depende do exercício 02
#dicionario1 = {}
#dicionario1["x"] = 10
#dicionario1["y"] = 20
#dicionario2 = {}
#dicionario2["x"] = 90
#dicionario2["y"] = 80
#array = []

#array.append(dicionario1)
#array.append(dicionario2)
#print(array)
#print(array[1]["x"])

from SistemasLineares import SistemasLineares

def main():
    sistemaLinear1 = {}
    sistemaLinear1["x"] = 1
    sistemaLinear1["y"] = 2
    sistemaLinear1["z"] = 1
    sistemaLinear1["res"] = 8
    sistemaLinear2 = {}
    sistemaLinear2["x"] = 2
    sistemaLinear2["y"] = -1
    sistemaLinear2["z"] = 1
    sistemaLinear2["res"] = 3
    sistemaLinear3 = {}
    sistemaLinear3["x"] = 3
    sistemaLinear3["y"] = 1
    sistemaLinear3["z"] = -1
    sistemaLinear3["res"] = 2

    calculoSistemas = SistemasLineares(sistemaLinear1, sistemaLinear2, sistemaLinear3)

    print(calculoSistemas.calculoSistemaLinear())

if __name__ == '__main__':
    main()