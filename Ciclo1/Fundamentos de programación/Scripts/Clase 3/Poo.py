class Peluchito:
    def __init__(self, nombre, cantidad, valor):
        self.nombre = nombre
        self.cantidad = cantidad
        self.valor = valor
    def mostrarPeluchito(self):
        print(f'Peluche: {self.nombre}, cantidad: {self.cantidad}, valor: {self.valor}')

def imprimirMenu():
    opcion=int(input("1. Agregar peluche\n2. Buscar peluche\n3. Eliminar peluche\n4. Mostrar inventario\n 5. Realizar venta\n7. Salir"))
    return opcion

inventario =[]
while(True):
    opcion =imprimirMenu()
    if opcion == 1:
        nombre = input("Digite el nombre del peluche... ")
        cantidad = int(input("Digite la cantidad del peluche... "))
        valor = int(input("Digite el valor del peluche... "))
        peluche = Peluchito(nombre= nombre, cantidad= cantidad, valor= valor)
        inventario.append(peluche)
    elif opcion == 2:
        nombreABuscar = input("Digite el nombre del peluche a buscar... ")
        existe = False
        for peluche in inventario:
            if peluche.nombre == nombreABuscar:
                peluche.mostrarPeluchito()
                existe = True
        if not existe:
            print("El producto no existe")
    elif opcion == 3:
        nombreABuscar = input("Digite el nombre del peluche a eliminar... ")
        existe = False
        for peluche in inventario:
            if peluche.nombre == nombreABuscar:
                confirmacion = input(f"Confirma que desea eliminar a {peluche.nombre} S/N")
                if confirmacion == "S":
                    inventario.remove(peluche)
                existe = True
        if not existe:
            print("El producto no existe")
    elif opcion == 4:
        for peluche in inventario:
            peluche.mostrarPeluchito()
    elif opcion == 7:
        print("Hasta la vista")
        break
    else:
        print("Opción invalida")