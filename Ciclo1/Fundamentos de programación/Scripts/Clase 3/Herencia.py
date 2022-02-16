#Herencia
class Persona:
    def __init__(self, nombre, edad, telefono):
        self.nombre = nombre
        self.edad = edad
        self.telefono = telefono

    def imprimirDatos(self):
        print(f'Nombre: {self.nombre}, edad: {self.edad}, telefono: {self.telefono}')

class Empleado(Persona):
    def __init__(self, nombre, edad, telefono, salario, empresa):
        super().__init__(nombre, edad, telefono)
        self.salario = salario
        self.empresa = empresa

    def imprimirDatosEmpleado(self):
        print(f'Salario: {self.salario}, Empresa: {self.empresa}')

class Estudiante(Persona):
    def __init__(self, nombre, edad, telefono,carrera, universidad):
        super().__init__(nombre, edad, telefono)
        self.carrera = carrera
        self.universidad = universidad

    def imprimirDatosEstudiante(self):
        print(f'Carrera: {self.carrera}, Universidad: {self.universidad}')

empleado1 = Empleado('Andrés', 29, 12,5000000, 'Pragma')
empleado1.imprimirDatos()
empleado1.imprimirDatosEmpleado()

estudiante1 = Estudiante(telefono = '3017904014', edad = 30, nombre = 'Juan', carrera = 'Psicologia', universidad = 'Universidad de antioquia')
estudiante1.imprimirDatos()
estudiante1.imprimirDatosEstudiante()

#Ejemplo 2

#Ejercicio definir una clase padre llamada vehiculo y dos clases llamadas carro y bicicleta
#Vehiculo - atributos: Color, Ruedas métodos: __init__
#Coche - atributos: Velocidad métodos: __init__
#Bicicleta - atributos: tipo(Urbana/ Montaña/ Ruta) métodos: __init__

class Vehiculo():
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

class Coche(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

vehiculo = Vehiculo("Rojo", 4)
print(f'Vehículo \nColor: {vehiculo.color}, Ruedas: {vehiculo.ruedas}')

coche = Coche("Azul", 4, 200)
print(f'Coche \nColor: {coche.color}, Ruedas: {coche.ruedas}, Velocidad: {coche.velocidad} km/h')

bicicleta = Bicicleta("Negra",2,"MTB")
print(f'Bicicleta \nColor: {bicicleta.color}, Ruedas: {bicicleta.ruedas}, Tipo: {bicicleta.tipo}')

#Programa completo: Manejar el inventario de un supermercado
#Producto -> atributos: nombre, precio, marca, cantidad, fecha de vencimiento
#Lacteos -> atributos: Volumen, tipo (Entero, Deslactosado, descremado), presentación (Caja, Bolsa, Vaso)
#Detergentes -> atributos: tipoDeUso (cocina, baño, ropa), presentación (liquido, polvo, Barra)
#Licores -> atributos: tipo (Cerveza, Whisky), origen (Nacional, Importado), porcentajeAlcohol

class Producto():
    def __init__(self, nombre, precio, marca, cantidad, fechaVencimiento):
        self.nombre = nombre
        self.precio = precio
        self.marca = marca
        self.cantidad = cantidad
        self.fechaVencimiento = fechaVencimiento

    def __str__(self):
        return "Nombre: " + self.nombre + " Precio: " + self.precio + " Marca: " + self.marca + " Cantidad: " + self.cantidad + " Fecha de vencimiento: " +self.fechaVencimiento

class Lacteos(Producto):
    def __init__(self, nombre, precio, marca, cantidad, fechaVencimiento, volumen, tipo, presentacion):
        super().__init__(nombre, precio, marca, cantidad, fechaVencimiento)
        self.volumen = volumen
        self.tipo = tipo
        self.presentacion = presentacion

    def __str__(self):
        return super.__str__() +" Volumen: " + str(self.volumen) + " Tipo: " + self.tipo + " Presentacion " + self.presentacion

def imprimirMenu():
    opcion = int(input("1. Agregar producto\n2. Buscar producto\n3. Eliminar producto\n4. Actulizar producto \n5. Mostrar producto \n 6.Salir"))
    return opcion

lacteosList = []
detergentesList = []
licoresList = []

while(True):
    opcion = imprimirMenu()
    if(opcion == 1):
        tipo = int(input("Seleccione el tipo de producto: \n1. Lacteo \n2. Detergente\n3. Licores"))
        if tipo == 1: #Lacteo
            nombre = input("Digite el nombre... ")
            precio = int(input("Digite el precio... "))
            cantidad = int(input("Digite la cantidad... "))
            volumen = int(input("Digite el volumen... "))
            tipo = input("Digite el tipo")
            presentacion = input("Digite la presentación")
            lacteo = Lacteos(nombre, precio, cantidad,volumen, tipo, presentacion)
            lacteosList.append(lacteo)
        elif tipo == 2: #Detergente
            nombre = input("Digite el nombre... ")
            precio = int(input("Digite el precio... "))
            cantidad = int(input("Digite la cantidad... "))
        elif tipo == 3: #Licor
            nombre = input("Digite el nombre... ")
            precio = int(input("Digite el precio... "))
            cantidad = int(input("Digite la cantidad... "))
        else:
            print("Opción invalida")
    elif opcion == 5: #Mostrar inventario
        print("-----Lacteos-----")
        for lacteo in lacteosList:
            print(lacteo.__str__())
        print("-----Detergentes-----")

        print("-----Licores-----")
    elif opcion == 6:
        print("Gracias totales... ")
        break
    else:
        print("Opción invalida... ")