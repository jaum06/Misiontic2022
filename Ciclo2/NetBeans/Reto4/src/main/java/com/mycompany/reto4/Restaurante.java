/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto4;

/**
 *
 * @author Laguaridagc
 */
//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;

public class Restaurante {

    //Inserte acá los atributos
    ArrayList<Pedido> pedidos = new ArrayList<>();

    //Inserte acá el método constructor
    public Restaurante() {

    }

    //Inserte acá los SETTERS Y GETTERS
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarPedidoLista(Pedido p) {
        /*Agrega el pedido recibido como parámetro a la lista pedidos si este NO está en la lista 
        (Dos pedidos son diferentes si sus ID son diferentes)*/
        boolean validador = false;
        if (pedidos.isEmpty()) {
            pedidos.add(p);
        } else {
            for (Pedido i : pedidos) {
                if (i.nPedido.equals(p.getnPedido())) {
                    validador = true;
                    break;
                }
            }
            if (!validador) {
                pedidos.add(p);
            }
        }
    }

    public void eliminarPedido(String nPedido) {
        //Elimina el pedido con número de pedido igual al recibido por parámetro (nPedido)
        int j = 0;
        for (Pedido i : pedidos) {
            if (i.nPedido.equals(nPedido)) {
                pedidos.remove(j);
                break;
            }
            j += 1;
        }
    }

    public double calcularGanancias() {
        //Retorna la suma del costo de todos los pedidos
        double ganancias = 0;
        for (Pedido i : pedidos) {
            ganancias += +i.costoPedido;
        }
        return ganancias;
    }

    public double promedioGananciasTotales() {
        //Retorna el promedio del costo de todos los pedidos
        double promedio = 0;
        for (Pedido i : pedidos) {
            promedio += i.costoPedido;
        }
        promedio = promedio / pedidos.size();
        return promedio;
    }

    public double desviacionEstandarGananciasTotales() {
        //Retorna la desviación estándar del costo de todos los pedidos
        double desviacion = 0;
        double n = 0;
        double sumatoria = 0;
        double u = 0;
        n = pedidos.size();
        u = promedioGananciasTotales();
        for (Pedido i : pedidos) {
            sumatoria += Math.pow((i.costoPedido - u), 2);
        }
        desviacion = Math.sqrt((1 / n) * sumatoria);
        return desviacion;
    }

    public double retornarCostoPedido(String ID) {
        //Retorna el costo del pedido cuyo ID sea igual al ingresado por parámetro
        double costo = 0;
        for (Pedido i : pedidos) {
            if (i.nPedido.equals(ID)) {
                costo = i.costoPedido;
                break;
            }
        }
        return costo;
    }

}
