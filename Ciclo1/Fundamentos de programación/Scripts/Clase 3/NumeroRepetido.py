#Leer una matriz de 5 x 3 y mostrar cuales números se repiten y cuantas veces
mat=[[200,150,8],
     [7,9,13],
     [8,25,8],
     [26,12,12],
     [13,12,19]]

listRep = []
listCantRep = []

class Matriz:
    def __init__(self, numero, fila, columna):
        self.numero = numero
        self.fila = fila
        self.columna = columna

    def ExisteNumList(self, numero):
        valor = False
        if len(listRep) > 0:
            for i in listRep:
                if numero == i:
                    valor = True
                    break
                else:
                    valor = False
        else:
            valor = False
        return valor

    def LlenarListRep(self, numero, cantidad):
        listRep.append(numero)
        listCantRep.append(cantidad)

    def Recorrido(self, numero, fila, columna):
        repetidos = 0
        for i in range(5):
            for j in range(3):
                if fila == i and columna == j:
                    continue
                if numero == mat[i][j]:
                    repetidos += 1
        if repetidos > 0:
            if self.ExisteNumList(numero) == False:
                self.LlenarListRep(numero, repetidos)
                repetidos = 0

    def ImprimirListado(self):
        if len(listCantRep) > 0:
            for i in range(len(listCantRep)):
                print(f'\nEl número {listRep[i]}, se repite {listCantRep[i]} veces...')
        else:
            print("No hay números repetidos...")


for filas in range(5):
    for columnas in range(3):
        numero = mat[filas][columnas]
        recorrido = Matriz(numero, filas, columnas)
        recorrido.Recorrido(numero, filas, columnas)
recorrido.ImprimirListado()