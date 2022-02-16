/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto3;

/**
 *
 * @author Andrés
 */
public class Estudiante extends Persona {

    //Inserte acá el método constructor
    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }

    //Inserte acá la implementación del método abstracto de la clase padre
    @Override
    public void dirigir() {
        if (getIdioma() == "español") {
            setUrl("“educursos.com/español/estudiante");
        }
        else if(getIdioma()=="English"){
            setUrl("educursos.com/English/estudiante");
        }
    }
}
