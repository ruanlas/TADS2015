import sys
# Na primeira execução funcionou, depois não funcionou mais
def valorCombustivel():
    tipoComb = sys.argv[1]
    litrosComb = sys.argv[2]

    if(tipoComb == 'A'):
        precoAlcool = 2.90
        precoSemDesconto = float(litrosComb) * precoAlcool

        if(litrosComb <= 20.0):
            desconto = precoSemDesconto * 0.03
        else:
            desconto = precoSemDesconto * 0.05

        precoTotal = precoSemDesconto - desconto
        #print("Tipo Combustivel: Alcool - Preco Total", str(precoTotal))
        return precoTotal

    elif(tipoComb == 'G'):
        precoGasolina = 3.50
        precoSemDesconto = float(litrosComb) * precoGasolina

        if (litrosComb <= 20.0):
            desconto = precoSemDesconto * 0.04
        else:
            desconto = precoSemDesconto * 0.06

        precoTotal = precoSemDesconto - desconto
        #print("Tipo Combustivel: Gasolina - Preço Total", str(precoTotal))
        return precoTotal

def main():
    #valorCombustivel()
    print(valorCombustivel())

if __name__ == '__main__':
    main()