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
public class Main {

    public static void main(String[] args) {
        //Pedido ped = new Pedido("1","1", 1000, 28, 6, 2021);
        //Restaurante p = new Restaurante();

        Pedido p1 = new Pedido("A1", "72023394", 70000.0, 31, 3, 2020);
        Pedido p2 = new Pedido("A21", "1037681391", 67000.0, 23, 4, 2020);
        Pedido p3 = new Pedido("A32", "33277591", 20000.0, 24, 5, 2020);
        //Pedido p5 = new Pedido("A32", "33277591", 20000.0, 24, 5, 2020);
        Pedido p4 = new Pedido("B1", "1032678245", 40000.0, 7, 1, 2021);

        Restaurante p = new Restaurante();

        p.agregarPedidoLista(p1);
        p.agregarPedidoLista(p2);
        p.agregarPedidoLista(p3);
        //p.agregarPedidoLista(p5);
        p.eliminarPedido("A3456789");
        p.agregarPedidoLista(p4);
        p.eliminarPedido("A21");

        System.out.println("Ganancias " + p.calcularGanancias());
        System.out.println("Promedio ganancias totales " + p.promedioGananciasTotales());
        System.out.println("Desviación " + p.desviacionEstandarGananciasTotales());
        System.out.println("Costo del pedido número A32 "+p.retornarCostoPedido("A32"));

    }
}
