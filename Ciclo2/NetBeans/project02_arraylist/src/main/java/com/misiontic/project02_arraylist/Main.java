/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project02_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Andrés
 */
public class Main {

    public static void main(String[] args) {
        //Declaración de arraylist
        ArrayList<String> people = new ArrayList<String>();
        people.add("Juan");
        people.add("Luis");
        people.add("Juan");
        System.out.println(people.contains("Juan"));
        people.removeAll(Collections.singleton("Juan"));
        System.out.println(people.size());
        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("while: "+item);
        }
        for(int i =0; i<people.size(); i++){
            String item = people.get(i);
            System.out.println("for: "+item);
        }
    }
}
