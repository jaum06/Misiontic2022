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
public class Exercise1 {

    //private int numPeople;
    private Person[] people;

    public void setNumPeople(int numPeople) {
        //this.numPeople = numPeople;
        //this.people = new Person[numPeople];
        this.people = new Person[numPeople];
    }

    public void setPeopleInfo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            System.out.println("Ingrese los datos de la persona " + i);
            System.out.print("Ingrese el nombre completo... ");
            String fullName = scanner.nextLine();
            System.out.print("Ingrese el año de nacimiento... ");
            int year = scanner.nextInt();
            Person person = new Person(fullName, year);
            people[i] = person;
        }
    }
}
