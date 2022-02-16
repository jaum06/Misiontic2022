#Leer una matriz de 5*3 entera y determinar en que fila esta el mayor número primo

mat=[[2,4,6],
     [7,101,13],
     [8,25,24],
     [26,45,12],
     [13,17,19]]

for filas in range(5):
    for columnas in range(3):
        print(mat[filas][columnas], end = ', ')
    print()

posMayorPrimoFila = 0
PosMayorPrimoColum = 0
primoMayor = mat[0][0]

for filas in range(5):
    for columnas in range(3):
        if mat[filas][columnas] > primoMayor:
            contadorDivisores = 0
            for i in range(1, mat[filas][columnas] + 1):
                if mat[filas][columnas] % i == 0:
                    contadorDivisores += 1
            if contadorDivisores == 2:
                primoMayor = mat[filas][columnas]
                posMayorPrimoFila = filas
                PosMayorPrimoColum = columnas

print(f'El número mayor es {primoMayor} y esta en la fila {posMayorPrimoFila}')


"""#Leer una matriz de 5 x 3 y mostrar cuales números se repiten y cuantas veces
mat=[[200,150,8],
     [7,9,13],
     [8,25,8],
     [26,12,12],
     [13,12,19]]

repetidos = 0
listNum = []
listRep = []

for i in range(5):
    for j in range(3):
        numero = mat[i][j]
        for filas in range(5):
            for columnas in range(3):
                if i == filas and j == columnas:
                    continue
                if numero == mat[filas][columnas]:
                    repetidos += 1
        if repetidos > 0:
            if len(listNum) > 0:
                for k in listNum:
                    if
                listNum.append(numero)
                listRep.append(repetidos)
                repetidos = """

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
        if len(listRep) > 0:
            for i in listRep:
                if numero == i:
                    return True
                    break
        else:
            return False

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
                self.llenarListRep(numero, repetidos)
                repetidos = 0

    def ImprimirListado(self):
        if len(listCantRep) > 0:
            for i in listCantRep:
                print(f'\nEl número {listRep[i]}, se repite {listCantRep} veces...')
        else:
            print("No hay números repetidos...")


for filas in range(5):
    for columnas in range(3):
        numero = mat[filas][columnas]
        recorrido = Matriz(numero, filas, columnas)
        recorrido.Recorrido(numero, filas, columnas)
recorrido.ImprimirListado()