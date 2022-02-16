# NO ELIMINAR LA SIGUIENTE IMPORTACIÓN, sirve para probar tu código en consola
from pruebas import pruebas_codigo_estudiante

# NOTA: PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
# LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO

# En este espacio podrás programar las funciones que deseas usar en la función solución (NO ES OBLIGATORIO CREAR OTRAS FUNCIONES)
"""Inicio espacio para programar funciones propias"""

# PUEDES PROGRAMAR CUANTAS FUNCIONES DESEES

def Vector(bits1):
    vector = []
    for i in bits1:
        vector.append(int(i))
    return vector
def Operacion(OP):
    if OP == "AND":
        matriz =[[0, 0, 0],
                 [0, 1, 0],
                 [1, 0, 0],
                 [1, 1, 1]]
    elif OP == "OR":
        matriz =[[0, 0, 0],
                 [0, 1, 1],
                 [1, 0, 1],
                 [1, 1, 1]]
    else:
        matriz =[[0, 0, 0],
                 [0, 1, 1],
                 [1, 0, 1],
                 [1, 1, 0]]
    return matriz

"""Fin espacio para programar funciones propias"""




def calculadora(bits1, bits2, OP):
    # PROGRAMA ACÁ LA SOLUCIÓN
    resultado = ""
    array1 = Vector(bits1)
    array2 = Vector(bits2)
    arrayOp = Operacion(OP)
    for recorre in range(len(array1)):
        i = 0
        while i < 4:
            if array1[recorre] == arrayOp[i][0] and array2[recorre] == arrayOp[i][1]:
                resultado = resultado + str(arrayOp[i][2])
                break
            i += 1

    return resultado


"""
Esta línea de código que sigue, permite probar si su ejercicio es correcto
"""
# NO ELIMINAR LA SIGUIENTE LÍNEA DE CÓDIGO
pruebas_codigo_estudiante(calculadora)