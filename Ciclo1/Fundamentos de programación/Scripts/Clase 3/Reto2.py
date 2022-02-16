from math import sqrt
import numpy as np

# NOTA: PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
# LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO

# En este espacio podrás programar las funciones que deseas usar en la función solución (NO ES OBLIGATORIO CREAR OTRAS FUNCIONES)
"""Inicio espacio para programar funciones propias"""

# PUEDES PROGRAMAR CUANTAS FUNCIONES DESEES


"""Fin espacio para programar funciones propias"""


def solucion(a):
    """
    En esta función deberás programar tu solución.
    Explicación del parámetro que recibe:
    - a: Es un vector unidimensionalde numpy, (No te preocupes si NO conoces numpy,
        el manejo que debes darle es IGUAL al de una lista de Python)
        El largo de la lista lo puedes calcular así: L = len(a)
        Para indexar el elemento en la posición i se hace así (Igual como una lista):
            a[i]

    Explicación de lo que debe retornar:
    -matriz: Puede ser de dos tipos (COMO TE SIENTAS MÁS CÓMODO)
        Una matriz de numpy O una lista de listas (El calificador está en las condiciones
        para recibit cualquiera de los dos tipos), en esta matriz debes guardar los
        elementos que hay en el vector a como se especifica en el enunciado
    """
    """contador = 0
    matriz = []
    lista = []
    fila = 0

    for i in range(len(a)):
        fila = (i * (i + contador))//2
        if fila == 0:
            lista.append(a[0])
            #lista.append(0)
            matriz = np.insert(matriz, fila, lista, axis=0)
            #matriz = np.array(lista)
            lista.clear()
            print(f'prueba: {matriz}')
            contador += 1
        else:
            while contador <= fila + 1:
                lista.append(a[contador])
                contador += 1
            matriz = np.insert(matriz, fila, lista, axis=0)
            lista.clear()
            print(matriz)
                #filasMatriz = matriz.shape[0]
                #lista = a[i]
                #matriz = np.insert(matriz, filasMatriz,[i], axis = 0)"""


    #opcion 2
    contador = 0
    matriz =[]*4
    matriz = np.zeros((4,4))
    for fila in range(4):
        for j in range(fila + 1):
            matriz[fila][j] = a[contador]
            contador += 1


    #opcion 3
    """matriz = []
    lista = []
    recorrido = 0
    fila = 0
    while recorrido < len(a):
        matriz.append([])
        for i in range(fila + 1):
            if recorrido == len(a):
                break
            else:
                lista.append(a[recorrido])
                recorrido += 1
        for j in range(len(lista)):
            matriz = np.insert(matriz, fila, lista[j])
            #matriz[fila].append(lista[j])
        lista.clear()
        fila += 1"""
    return matriz

"""
Estas líneas de código que siguen, permiten probar si su ejercicio es correcto
"""
# NO MODIFICAR
l = [8, 60, 72, 35, 26, 75, 15, 12, 33, 54]
matriz_correcta = np.array([[8., 0., 0., 0.], [60., 72., 0., 0.], [35., 26., 75., 0.], [15., 12., 33., 54.]])
matriz_estudiante = np.array(solucion(l))
print("LISTA ENTREGADA:\n", l, "\n")
print("===SALIDA ESPERADA===\nMatriz:\n", matriz_correcta, "\n")
print("===TU SALIDA===\nMatriz:\n", matriz_estudiante, "\n")

for i in range(matriz_correcta.shape[0]):
    for j in range(matriz_correcta.shape[1]):
        if matriz_correcta[i, j] != matriz_estudiante[i, j]:
            print("Las salidas no coinciden, ¡Estás olvidando algo en tu código!")
            exit()
print("Todo se ve correcto, ¡Procede a calificar tu código!")



