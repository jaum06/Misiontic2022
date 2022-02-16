import random
import math


class Vector:
    def __init__(self, nroposiciones):
        self.nroposiciones = nroposiciones
        self.V = [0] * (nroposiciones + 1)

    def constructor(self, posicionesocupadas, maximo):
        self.v[0] = posicionesocupadas
        for i in range(1, posicionesocupadas + 1):
            self.v[i] = random.randint(1, maximo)

    def imprimir(self):
        for i in range(1, self.V[0] + 1):
            print(self.V[i])


nroposiciones = random.randint(15, 30)
maxim = 29
v = Vector(nroposiciones)
v.constructor(nroposiciones, maxim)

n = int(input("Digite el tamaño del vector... "))
v = Vector(n)

v.construyeVector(n//2, 100)
v.imprimeVector()

"""def solucion():
    #INSERTA TU CÓDIGO AQUÍ

    return vec1, vec1mod
"""
