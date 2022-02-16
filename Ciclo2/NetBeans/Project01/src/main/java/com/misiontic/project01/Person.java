/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01;

/**
 *
 * @author Andrés
 */
public class Person {

    private String fullName;
    private int age;
    private int identification;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    Person(String fullname, int year) {
        calculateAgeFromYear(year);
        setFullName(fullname);
    }

    public void walk() {
        System.out.println("Estoy caminando");
    }

    public void setAge(int age) {
        if (age < 150) {
            this.age = age;
        } else {
            System.out.println("La edad debe ser menor a 150");
        }
    }

    private void calculateAgeFromYear(int bornYear){
        this.age = (2021 - bornYear);
    }
}
