import math
import random

matriz =[[0, 0, 0],
         [0, 1, 1],
         [1, 0, 1],
         [1, 1, 1]]

print(matriz[1][2])

class Vector:
    def __init__(self, nro_posiciones):
        self.nro_posiciones = nro_posiciones
        self.V = [0] * (nro_posiciones + 1)

    def constructor(self, posiciones_ocupadas, maximo):
        self.posiciones_ocupadas = posiciones_ocupadas
        for i in range(1, posiciones_ocupadas + 1):
            self.V[i] = random.randint(1, maximo + 1)

    def imprimir(self):
        for i in range(1, self.V + 1):
            print(self.V[i])

nro_posiciones =  random.randint(15, 30)
positions_taken = nro_posiciones // 2
maximo = 29
Vector.constructor(posiciones_ocupadas=positions_taken, maximo=maximo)
Vector.imprimir()