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
public abstract class Persona {

    //Inserte acá los atributos
    String id;
    String nombre;
    String email;
    String idioma;
    String url = "educursos.com";

    //Inserte acá el método constructor
    public Persona(String id, String nombre, String email, String idioma) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.idioma = idioma;
    }

    //Inserte acá los SETTERS Y GETTERS
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //Inserte acá el método abstracto
    public abstract void dirigir();
    //Es el método abstracto donde las clases hijas implementarán el comportamiento de la aplicación cuando la persona intente acceder a la plataforma.

}
