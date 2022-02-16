/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project12_junit_01;

/**
 *
 * @author Andrés
 */
public class Main {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        int result = myCalculator.sum(2, 3);
        System.out.println(result);
    }
}
