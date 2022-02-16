/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01;

import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class Main {

    public static void main(String[] args) {
        int age = 0;
        Scanner teclado = new Scanner(System.in);
        Person person1 = new Person("Juan", 1993);
        Person person2 = new Person("Juan", 1993);
        person1.walk();
        //System.out.println(person1.getAge());

        int[] myArray;
        double[] myArray2;
        System.out.print("Ingrese la cantidad de datos...");
        int numData = teclado.nextInt();
        myArray = new int[numData];
        myArray2 = new double[numData];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Ingrese el dato en la posición " + i + ":");
            myArray2[i] = teclado.nextDouble();
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray2[i]);
        }
        //person1.setAge(170);
        //System.out.println(person1.getAge() );
    }
}
