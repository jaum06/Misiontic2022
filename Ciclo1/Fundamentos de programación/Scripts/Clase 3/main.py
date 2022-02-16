"""a = input("entre un número ")
b = input("entre otro número ")
c = int(input("entre un tercer número "))
d = int(input("entre un cuarto número "))

if  b > a:

    print(c+d, end=",")

    print(a+b)

else:
    if a == b:

        print(a, d)

    else:

        print(a, b, c, d, sep ="")
"""
#Elabore un programa en Python que lea una temperatura en grados Celsius, la convierta a grados Fahrenheit y muestre el resultado con un mensaje bien explicativo.
gradosC = float(input("Ingrese los grados en Celsius..."))
gradosF = (gradosC * 9/5) + 32#( °C × 9/5) + 32
print(f'{gradosC} grados Celsius equivalen a {gradosF} en grados Farenheit')

numero = int(input("Ingrese un número de 2 digitos... "))
cast = str(numero)
for i in cast:
    print(i)

metros=float(input("Ingrese la longitud en metros..."))
centimetros = metros * 100
pies = metros * 3.28084
pulgadas = metros * 39.3701
print(f'{metros} en metros equivalen a: {centimetros} centimetros, {pies} pies, {pulgadas} pulgadas')

suma = 0
for i in range(300,5001):
    suma = suma + i
print(suma)

import numpy as np