archivo = open(r'D:\Documentos\Misiontic 2022\Ciclo 1\Fundamentos de programación\Scripts\Clase 3\archivo.txt', "a+", encoding="utf-8")
print(archivo.mode)
#archivo.write("Ron\n")
archivo.seek(0)
for i in archivo.readlines():
    print(i, end="")