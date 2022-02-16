import random


class Vector:
    def __init__(self, n): #n es el tamaño del vector
        self.n = n
        self.v = [0]*(n+1)

    def construyeVector(self, m, r): #m tamaño de los datos que voy a llenar, r rango maximo para numeros aleatorios
        self.v[0] = m
        for i in range(1,m+1):
            self.v[i] = random.randint(1,r)

    def tamagno(self):
        return self.n

    def posicionesUsadas(self):
        return self.v[0]

    def asignarNumeroElementos(self, m):
        self.v[0] = m

    def retornaDatos(self, i):
        return self.v[i]

    def asignaDato(self, d, i):
        self.v[i] = d



    def imprimeVector(self):

        for i in range(1, self.v[0]+1):
            print(self.v[i], end=",")