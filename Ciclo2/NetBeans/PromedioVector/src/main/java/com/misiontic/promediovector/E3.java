/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.promediovector;

/**
 *
 * @author Andrés
 */
public class E3 {

    public static double mean(int[] vector) {
        double promedio = 0;
        for(int i = 0; i < vector.length; i++)
        {
            promedio = promedio + vector[i];
        }
        promedio = promedio / vector.length;
        return promedio;
    }

    public static void main(String[] args) {
        double total = 0;
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        total = mean(vectorEntrada);
        System.out.println(total);
    }
}
