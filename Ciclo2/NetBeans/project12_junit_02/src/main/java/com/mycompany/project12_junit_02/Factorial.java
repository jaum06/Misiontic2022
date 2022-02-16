/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project12_junit_02;

/**
 *
 * @author Andrés
 */
public class Factorial {

    public long calculateFactorial(long number) {
        long resultFactorial = 1;
        for (int i = 2; i <= number; i++) {
            resultFactorial = resultFactorial * i;
        }
        return resultFactorial;
    }
}
