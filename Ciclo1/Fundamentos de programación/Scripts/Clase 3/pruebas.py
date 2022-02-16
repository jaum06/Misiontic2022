class bcolors:
    OK = '\033[92m' #GREEN
    WARNING = '\033[93m' #YELLOW
    FAIL = '\033[91m' #RED
    RESET = '\033[0m' #RESET COLOR
    
def pruebas_codigo_estudiante(calculadora):
    try:
        print("===TESTEADOR AUTOMÁTICO - RETO 3 - UdeA===\n")
        if not caso1_aprobado(calculadora):
            return False
            exit()
        
        elif not caso2_aprobado(calculadora):
            return False
            exit()

        elif not caso3_aprobado(calculadora):
            return False
            exit()
            
        elif not caso4_aprobado(calculadora):
            return False
            exit()
        
        elif not caso5_aprobado(calculadora):
            return False
            exit()
        
    
    except Exception as e:
        print(f"{bcolors.FAIL}¡ERROR!{bcolors.RESET}\nAl probar tu código nos genera un error que NO está relacionado con los resultados\nChequéalo tu mismo: {e}")
        return False
    
    print(f"{bcolors.OK}¡Tu código está funcionando correctamente! Procede a evaluarlo{bcolors.RESET}")
    return True
    
    
def caso1_aprobado(calculadora):
    bits1 = '0110110110'
    bits2 = '1100011101'
    
    resultado_and_correcto = '0100010100'
    resultado_or_correcto = '1110111111'
    resultado_xor_correcto = '1010101011'
    
    resultado_and_estudiante = calculadora(bits1, bits2, "AND")
    resultado_or_estudiante = calculadora(bits1, bits2, "OR")
    resultado_xor_estudiante = calculadora(bits1, bits2, "XOR")
    
    if not resultado_and_correcto == resultado_and_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'AND'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_and_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_and_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_or_correcto == resultado_or_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'OR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_or_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_or_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_xor_correcto == resultado_xor_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'XOR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_xor_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_xor_estudiante}'{bcolors.RESET}
        """)
        return False
    
    return True
    
def caso2_aprobado(calculadora):
    bits1 = '1110001'
    bits2 = '1001011'
    
    resultado_and_correcto = '1000001'
    resultado_or_correcto = '1111011'
    resultado_xor_correcto = '0111010'
    
    resultado_and_estudiante = calculadora(bits1, bits2, "AND")
    resultado_or_estudiante = calculadora(bits1, bits2, "OR")
    resultado_xor_estudiante = calculadora(bits1, bits2, "XOR")
    
    if not resultado_and_correcto == resultado_and_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'AND'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_and_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_and_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_or_correcto == resultado_or_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'OR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_or_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_or_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_xor_correcto == resultado_xor_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'XOR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_xor_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_xor_estudiante}'{bcolors.RESET}
        """)
        return False
    
    return True


def caso3_aprobado(calculadora):
    bits1 = '1111111111'
    bits2 = '0000000000'
    
    resultado_and_correcto = '0000000000'
    resultado_or_correcto = '1111111111'
    resultado_xor_correcto = '1111111111'
    
    resultado_and_estudiante = calculadora(bits1, bits2, "AND")
    resultado_or_estudiante = calculadora(bits1, bits2, "OR")
    resultado_xor_estudiante = calculadora(bits1, bits2, "XOR")
    
    if not resultado_and_correcto == resultado_and_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'AND'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_and_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_and_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_or_correcto == resultado_or_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'OR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_or_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_or_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_xor_correcto == resultado_xor_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'XOR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_xor_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_xor_estudiante}'{bcolors.RESET}
        """)
        return False
    
    return True
    
def caso4_aprobado(calculadora):
    bits1 = '11110000'
    bits2 = '10101010'
    
    resultado_and_correcto = '10100000'
    resultado_or_correcto = '11111010'
    resultado_xor_correcto = '01011010'
    
    resultado_and_estudiante = calculadora(bits1, bits2, "AND")
    resultado_or_estudiante = calculadora(bits1, bits2, "OR")
    resultado_xor_estudiante = calculadora(bits1, bits2, "XOR")
    
    if not resultado_and_correcto == resultado_and_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'AND'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_and_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_and_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_or_correcto == resultado_or_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'OR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_or_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_or_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_xor_correcto == resultado_xor_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'XOR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_xor_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_xor_estudiante}'{bcolors.RESET}
        """)
        return False
    
    return True
    
def caso5_aprobado(calculadora):
    bits1 = '1011110'
    bits2 = '0100001'
    
    resultado_and_correcto = '0000000'
    resultado_or_correcto = '1111111'
    resultado_xor_correcto = '1111111'
    
    resultado_and_estudiante = calculadora(bits1, bits2, "AND")
    resultado_or_estudiante = calculadora(bits1, bits2, "OR")
    resultado_xor_estudiante = calculadora(bits1, bits2, "XOR")
    
    if not resultado_and_correcto == resultado_and_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'AND'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_and_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_and_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_or_correcto == resultado_or_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'OR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_or_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_or_estudiante}'{bcolors.RESET}
        """)
        return False
        
    elif not resultado_xor_correcto == resultado_xor_estudiante:
        print(f"""{bcolors.WARNING}
        ¡INCORRECTO!{bcolors.RESET}
        ENTRADAS:
            bits1 = '{bits1}'
            bits2 = '{bits2}'
            OP = 'XOR'
        {bcolors.OK}SALIDA ESPERADA: '{resultado_xor_correcto}'{bcolors.RESET}
        {bcolors.FAIL}TU SALIDA: '{resultado_xor_estudiante}'{bcolors.RESET}
        """)
        return False
    
    return True