# NO ELIMINAR LA SIGUIENTE IMPORTACIÓN, sirve para probar tu código en consola
from pruebas import pruebas_codigo_estudiante

"""NOTAS: 
    -PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
    -LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO
"""

"""Inicio espacio para programar funciones propias"""
# En este espacio podrás programar las funciones que deseas usar en la función solución (ES OPCIONAL


"""Fin espacio para programar funciones propias"""


def actualizar_estado_pestana(operaciones_usuario, pagina_default):
    # ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    pila_atras = []
    pagina_actual = pagina_default
    pila_adelante = []
    tamaño = 0
    for i in range (len(operaciones_usuario)):
        if operaciones_usuario[i] == "atras":
            tamaño = len(pila_atras) - 1
            pila_adelante.append(pagina_actual)
            pagina_actual = pila_atras[tamaño]
            pila_atras.pop(tamaño)
        elif operaciones_usuario[i] == "adelante":
            tamaño = len(pila_adelante) - 1
            pila_atras.append(pagina_actual)
            pagina_actual = pila_adelante[tamaño]
            pila_adelante.pop(tamaño)
        else:
            if operaciones_usuario[i] != pagina_actual:
                pila_adelante.clear()
                pila_atras.append(pagina_actual)
                pagina_actual = operaciones_usuario[i]
    return pila_atras, pagina_actual, pila_adelante


"""
NO PEDIR DATOS CON LA FUNCIÓN input(), NO COLOCAR CÓDIGO FUERA DE LAS FUNCIONES QUE USTED CREE
Esta línea de código que sigue, permite probar si su ejercicio es correcto
Por favor NO ELIMINARLA
"""
#pruebas_codigo_estudiante(actualizar_estado_pestana)
operaciones_usuario = ['udea.edu.co', 'ingeniaudea.co', 'twitter.com', 'atras', 'atras', 'adelante', 'facebook.com', 'facebook.com']
pagina_default = "google.com"
actualizar_estado_pestana(operaciones_usuario, pagina_default)