import math
import random
from Dog import Dog

def main():
    listaDog = [Dog("Dog"+str(i), random.randint(0,17)) for i in range(1,100 + 1)]
    for dog in listaDog:
        print("Nome: " + dog.nome+" Idade: " + str(dog.idade))

if __name__ == '__main__':
    main()