/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.concatenarcaracteres;

/**
 *
 * @author Andrés
 */
public class E6 {

    public static void main(String[] args) {
        char[] vector = {' ', 'P', 'r', 'o', ' ', 'g', 'r', 'a', ' ', 'm', 'a', 'r'};
        String vectorConcatenado = "";
        for (int i =0; i< vector.length; i++){
            vectorConcatenado += vector[i];
        }
        System.out.println(vectorConcatenado);
    }
}
