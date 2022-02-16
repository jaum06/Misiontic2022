from tkinter import *
from tkinter import messagebox

#funciones
def agregar():
    if not validarDatos():
        peluche = Peluchitos(nombre=nombrePeluche.get(), cantidad=cantidadPeluche.get(), precio=precioPeluche.get())
        peluchitosList.append(peluche)
        messagebox.showinfo("Almacenamiento exitoso",f"{nombrePeluche.get()} ha sido almacenado de forma exitosa.")
        cleanWidgets()
    else:
        messagebox.showerror("Error", "Debe digitar todos los datos")

def buscar():
    bandExiste = False
    if nombrePeluche.get() != "":
        for peluche in peluchitosList:
            if peluche.nombre == nombrePeluche.get():
                cantidadPeluche.set(peluche.cantidad)
                precioPeluche.set(peluche.precio)
                bandExiste = True
        if not bandExiste:
            messagebox.showwarning("No existe", f"el peluche {nombrePeluche.get()} no existe.")
    else:
        messagebox.showerror("error", "Debe digitar el nombre del peluche a buscar")

def validarDatos():
    return nombrePeluche.get() == "" or cantidadPeluche.get() == 0 or precioPeluche == 0.0

def cleanWidgets():
    nombrePeluche.set("")
    cantidadPeluche.set(0)
    precioPeluche.set(0.0)

#Definición de variables y objetos
class Peluchitos():
    def __init__(self, nombre, cantidad, precio):
        self.nombre = nombre
        self.cantidad = cantidad
        self.precio = precio


ventana = Tk()
nombrePeluche = StringVar()
cantidadPeluche = IntVar()
precioPeluche = DoubleVar()
peluchitosList = []

#Interfaz de usuario -> GUI
ventana.geometry("400x400")
ventana.title("Peluchitos.com")
tituloLabel = Label(ventana, text="Peluchitos.com").place(relx=0.5, y=10, anchor = CENTER)
nombreLabel = Label(ventana, text="Nombre del peluche: ").place(x=10, y=40)
nombreEntry = Entry(ventana, textvariable=nombrePeluche).place(x=160, y=40)
cantidadLabel = Label(ventana, text="Cantidad del peluche").place(x=10, y=70)
cantidadEntry = Entry(ventana, textvariable=cantidadPeluche).place(x=160, y=70)
precioLabel = Label(ventana, text="Precio del peluche").place(x=10, y=100)
precioEntry = Entry(ventana, textvariable=precioPeluche).place(x=160, y=100)
agregarButton = Button(ventana, text="Agregar", command=agregar).place(x=10, y=130)
buscarButton = Button(ventana, text="Buscar", command=buscar).place(x=160, y=130)
ventana.mainloop()