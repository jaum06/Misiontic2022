"""import csv

import lst as lst

lista = []
with open('MSFT.csv') as data:
    entrada = csv.reader(data)
    lista = list(entrada)
    for i in lista:
        print(i)"""

"""import csv

personas =[
    ['Palacios', 'Rivas', 'Adan', 'CDMX']
]

personas2 =[
    ['Palacios 2', 'Rivas 2', 'Adan 2', 'CDMX 2']
]

with open('analisis_archivo.csv', 'w', newline='') as file:
    writer = csv.writer(file, delimiter= "\t")
    writer.writerows(personas)
    writer.writerows(personas2)"""

"""                         Reto 5                      """

import csv

entradaLst = []
salidaLst = ['Fecha', 'Mean-Min-Max', 'Concepto']
fechaStr = ""
promedioFl = 0.0
conceptoStr = ""
date_lowest = ""
lowest_value = 0.0
date_highest = ""
highest_value = 0.0

def ConceptoFn(promedio):
    if promedio < 207:
        conceptoStr = "MUY BAJO"
    elif promedio >= 207 and promedio < 221:
        conceptoStr = "BAJO"
    elif promedio >= 221 and promedio < 235:
        conceptoStr = "MEDIO"
    elif promedio >= 235 and promedio < 249:
        conceptoStr = "ALTO"
    else:
        conceptoStr = "MUY ALTO"
    return conceptoStr


with open('MSFT.csv', encoding='utf-8') as data:
    entrada = csv.reader(data)
    entradaLst = list(entrada)

with open('analisis_archivo.csv', 'w', newline='') as salida:
    writer = csv.writer(salida, delimiter= "\t")
    writer.writerow(salidaLst)
    salidaLst.clear()
    for i in entradaLst:
        if i[0] != "Date":
            if lowest_value == 0.0:
                date_lowest = i[0]
                lowest_value = float(i[3])
                date_highest = i[0]
                highest_value = float(i[2])
            else:
                if float(i[3]) < lowest_value:
                    lowest_value = float(i[3])
                    date_lowest = i[0]
                if float(i[2]) > highest_value:
                    highest_value = float(i[2])
                    date_highest = i[0]
            fechaStr = i[0]
            salidaLst.append(fechaStr)
            promedioFl = (float(i[2]) + float(i[3])) / 2
            salidaLst.append(str(promedioFl))
            conceptoStr = ConceptoFn(promedioFl)
            salidaLst.append(conceptoStr)
            writer.writerow(salidaLst)
            salidaLst.clear()
    print(f"El precio mas bajo fue {lowest_value} con fecha {date_lowest}")
    print(f"El precio mas alto fue {highest_value} con fecha {date_highest}")