/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.factorial;

import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class Ciclo {

    public static void main(String[] args) {
        long factorial = 0;
        long total = 1;
        Scanner scanner = new Scanner(System.in);
        factorial = scanner.nextLong();
        if (factorial == 0) {
            factorial = 1;
        }
        for (long i = 1; i <= factorial; i++) {
            total = total * i;
        }
        System.out.println(total);
    }
}
