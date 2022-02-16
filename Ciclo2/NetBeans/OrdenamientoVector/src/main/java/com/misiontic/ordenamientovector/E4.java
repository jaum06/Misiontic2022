/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.ordenamientovector;

/**
 *
 * @author Andrés
 */
public class E4 {

    /*public static int [] ordenamientoPersonalizado(int [] vector){
        int vectorOrdenado[];
        
        return vectorOrdenado[];
    }*/
    public static void main(String[] args) {
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int[] vectorEntradaOrdenado = new int[vectorEntrada.length];
        int numero = 0;
        int aux = 0;
        boolean prueba = false;
        vectorEntradaOrdenado[0] = vectorEntrada[0];
        for (int i = 1; i < (vectorEntrada.length / 2); i++) {
            numero = vectorEntrada[i];
            for (int j = 0; j < (vectorEntradaOrdenado.length / 2); j++) {
                prueba = false;
                if (numero < vectorEntradaOrdenado[j]) {
                    prueba = true;
                    aux = vectorEntradaOrdenado[j];
                    vectorEntradaOrdenado[j] = numero;
                    numero = aux;
                    j = 0;
                }
            }
            if (prueba == false) {
                vectorEntradaOrdenado[i] = numero;
            }
        }
        vectorEntradaOrdenado[vectorEntradaOrdenado.length / 2] = vectorEntrada[vectorEntrada.length / 2];
        for (int i = (vectorEntrada.length / 2) + 1; i < vectorEntrada.length; i++) {
            numero = vectorEntrada[i];
            for (int j = (vectorEntradaOrdenado.length / 2); j < i; j++) {
                prueba = false;
                if (numero > vectorEntradaOrdenado[j]) {
                    prueba = true;
                    aux = vectorEntradaOrdenado[j];
                    vectorEntradaOrdenado[j] = numero;
                    numero = aux;
                    j = (vectorEntradaOrdenado.length / 2) - 1;
                }
            }
            if (prueba == false) {
                vectorEntradaOrdenado[i] = numero;
            }
        }
        for (int i = 0; i < vectorEntradaOrdenado.length; i++) {
            System.out.print(vectorEntradaOrdenado[i] + ", ");
        }
    }
}
