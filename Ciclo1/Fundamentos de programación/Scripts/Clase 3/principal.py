from Vector import Vector

n = int(input("Digite el tamaño del vector... "))
v = Vector(n)

v.construyeVector(n//2, 100)
v.imprimeVector()

print("\nLa capacidad del vector es ", v.tamagno())

print("\nLas posiciones usadas del vector son... ", v.posicionesUsadas())

v.asignarNumeroElementos(3)

print("\nEl dato que esta en la posicion 2 es... ", v.retornaDatos(2))

v.asignaDato(24, 3)
v.imprimeVector()
