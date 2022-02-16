from Vector import Vector
import random
import math

"""Este procedimiento permite imprimir vectores en la consola"""
def imprimeVector(Vector, mensaje="vector sin nombre: \t"):
        print("\n", mensaje, end="          ")
        for i in range(1, Vector.v[0]+1):
            print(Vector.V[i], end=", ")
            if i % 30 == 0:
                print("\n                       ", end ="")
        print()

"""Función que contiene la solución al problema que será calificado"""
def solucion():
    """Se genera aleatoriamente un número entero entre 5 y 10"""
    n = random.randint(5, 10)#Use random.randint()
    """Se crea un objeto vector que tiene como tamaño el valor n"""
    vec_org18 = Vector(n)
    """Se recorre el vector para llenarlo con números enteros 
    entre 1 y 9 generados aleatoriamente"""
    for i in range(1, n + 1):
        vec_org18.V[i] = random.randint(9,11)# Use random.randint()
    """Se actualiza el valor de la primera posición del vector 
    indicando cuantas posiciones son usadas
    (En este caso es igual al tamaño del vector)"""
    vec_org18.V[0] = n
    """Se crea otro objeto vector que tiene como tamaño el vector n"""
    vec_mod18 = Vector(n)
    """Se recorren los vectores para copiar todos los elementos del
    vector original"""
    for i in range(0, n + 1):
        vec_mod18.V[i] = vec_org18.V[i]#Asigne los datos del vector original al vector modificado
    """Se actualiza el valor de la primera posición del vector
    indicando cuantas posiciones son usadas
    (En este caso es igual al tamaño del vector)"""
    vec_mod18.V[0] = n
    """Se recorre el vector hasta el la enúltima posición
    ya que el último dato no tiene números con los cuales sumarse"""
    for i in range (1, n):
        """Se inicializa la variable que usaremos para realizar la suma"""
        s = 0
        """Se recorre el vector desde la posicion i hasta la última"""
        for j in range(i, n + 1):
            """Se realiza la suma de la variable 's'
            con el dato de la posición j"""
            s = s + vec_org18.V[j]#Asigne a la variable 's' la suma de 's' con el dato en la posición j
        """Se almacena el total de la suma en la posición i"""
        vec_mod18.V[i] = s
    """Se retornan los objetos requeridos para efectuar la
    calificación de la solución"""
    return vec_org18, vec_mod18
"""Las siguientes líneas le permitirán probar su solución al presionar el botón de ejecutar"""
a, b = solucion()
imprimeVector(a, 'original')
imprimeVector(b, 'Modificado')