from Matriz import Matriz3x3

class SistemasLineares:
    matrizLinear = []
    determinantes = {}

    def __init__(self, sistema1, sistema2, sistema3):#utiliar dicionário no formato
        #ex: sistema1["x"], sistema1["y"], sistema1["z"], sistema1["res"]
        self.matrizLinear.append(sistema1)
        self.matrizLinear.append(sistema2)
        self.matrizLinear.append(sistema3)

    def determinante(self):
        linha1 = [self.matrizLinear[0]["x"], self.matrizLinear[0]["y"], self.matrizLinear[0]["z"]]
        linha2 = [self.matrizLinear[1]["x"], self.matrizLinear[1]["y"], self.matrizLinear[1]["z"]]
        linha3 = [self.matrizLinear[2]["x"], self.matrizLinear[2]["y"], self.matrizLinear[2]["z"]]
        matriz = Matriz3x3(linha1,linha2,linha3)

        self.determinantes["D"] = matriz.determinanteMatriz()

    def determinanteX(self):
        linha1 = [self.matrizLinear[0]["res"], self.matrizLinear[0]["y"], self.matrizLinear[0]["z"]]
        linha2 = [self.matrizLinear[1]["res"], self.matrizLinear[1]["y"], self.matrizLinear[1]["z"]]
        linha3 = [self.matrizLinear[2]["res"], self.matrizLinear[2]["y"], self.matrizLinear[2]["z"]]
        matriz = Matriz3x3(linha1,linha2,linha3)

        self.determinantes["Dx"] = matriz.determinanteMatriz()

    def determinanteY(self):
        linha1 = [self.matrizLinear[0]["x"], self.matrizLinear[0]["res"], self.matrizLinear[0]["z"]]
        linha2 = [self.matrizLinear[1]["x"], self.matrizLinear[1]["res"], self.matrizLinear[1]["z"]]
        linha3 = [self.matrizLinear[2]["x"], self.matrizLinear[2]["res"], self.matrizLinear[2]["z"]]
        matriz = Matriz3x3(linha1,linha2,linha3)

        self.determinantes["Dy"] = matriz.determinanteMatriz()

    def determinanteZ(self):
        linha1 = [self.matrizLinear[0]["x"], self.matrizLinear[0]["y"], self.matrizLinear[0]["res"]]
        linha2 = [self.matrizLinear[1]["x"], self.matrizLinear[1]["y"], self.matrizLinear[1]["res"]]
        linha3 = [self.matrizLinear[2]["x"], self.matrizLinear[2]["y"], self.matrizLinear[2]["res"]]
        matriz = Matriz3x3(linha1,linha2,linha3)

        self.determinantes["Dz"] = matriz.determinanteMatriz()

    def calculoSistemaLinear(self):
        conjuntoVerdade = {}
        self.determinante()
        self.determinanteX()
        self.determinanteY()
        self.determinanteZ()

        conjuntoVerdade["x"] = self.determinantes["Dx"] / self.determinantes["D"]
        conjuntoVerdade["y"] = self.determinantes["Dy"] / self.determinantes["D"]
        conjuntoVerdade["z"] = self.determinantes["Dz"] / self.determinantes["D"]

        return conjuntoVerdade