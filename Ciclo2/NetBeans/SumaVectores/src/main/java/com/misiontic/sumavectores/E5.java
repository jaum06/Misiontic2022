/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.sumavectores;

/**
 *
 * @author Andrés
 */
public class E5 {

    public static void main(String[] args) {
        int[] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int[] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        int[] v3 = new int[v1.length];
        for(int i =0;i < v1.length; i++){
            v3[i] = v1[i]+v2[i];
        }
        for(int i=0; i <v3.length;i++){
            System.out.print(v3[i]+", ");
        }
    }
}
