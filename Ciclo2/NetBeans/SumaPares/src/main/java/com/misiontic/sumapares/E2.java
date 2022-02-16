/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.sumapares;

/**
 *
 * @author Andrés
 */
public class E2 {

    public static int sumaPares(int[] vector) {
        int s = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                if (vector[i] % 2 == 0) {
                    s = s + vector[i];
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int total = 0;
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        total = sumaPares(vectorEntrada);
        System.out.println(total);
    }
}
