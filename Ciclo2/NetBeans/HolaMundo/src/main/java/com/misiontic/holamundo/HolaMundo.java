/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.holamundo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class HolaMundo {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        
        String message = "";
        message = scanner.nextLine();
        System.out.print("Ingrese el número... ");
        number1 = scanner.nextInt();
        if (number1 < 2 && number1 <= 3)
        {
            System.out.println("Es mayor");
        }
        else if (number1 > 4)
        {
            System.out.println("Es mayor a 4");
        }
        else
        {
            System.out.println("Es menor");
        }
        int nombre = 5;
        String selector = "a";
        switch (selector)
        {
            case "a":
                System.out.println("Caso 1");
                break;
            case "2":
                System.out.println("Caso 2");
                break;
        }*/
        int [] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int[] vectorA = new int[5];
        int[] vectorB = new int[5];
        int[] vectorC = new int[5];
        int[] vectorOrdenado = new int[vectorA.length + vectorC.length];
        System.arraycopy(vector, 0, vectorA, 0, vectorA.length);
        System.arraycopy(vector, 5, vectorB, 0, vectorB.length);

        Arrays.sort(vectorA);

        for (int i = vectorB.length - 1; i >= 0; i--) {
            int aux = 0;
            Arrays.sort(vectorB);
            int varEmerg = ((vectorB.length - 1) - i);
            aux = vectorB[i];
            vectorC[varEmerg] = aux;
        }

        System.arraycopy(vectorA, 0, vectorOrdenado, 0, vectorA.length);
        System.arraycopy(vectorC, 0, vectorOrdenado, vectorA.length, vectorC.length);
    }
}
