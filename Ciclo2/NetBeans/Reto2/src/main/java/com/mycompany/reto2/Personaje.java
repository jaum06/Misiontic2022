/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto2;

/**
 *
 * @author Andrés
 */
public class Personaje {

    //Inserte acá los atributos
    String nombre;
    char sexo;
    double posicionX;
    double posicionY;
    double damage;
    double vida = 100;
    double distancia = 0;

    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Personaje p) {
        //Resta 𝑑𝑎𝑚𝑎𝑔𝑒/𝑑 al atributo vida del personaje p, donde 𝑑 es la distancia entre el personaje que invoca el método y el personaje p
        /*double vida1 = p.getVida();
        double damage1 = getDamage();
        double distancia1 = calcularDistanciaRespectoPersonaje(p);
        double vida2=0;
        vida2=vida1-(damage1/distancia1);*/
        if(p.getVida()>0){
            p.setVida(p.getVida()-(getDamage()/calcularDistanciaRespectoPersonaje(p)));
        }
        else{
            p.setVida(0);
        }
    }

    public void recibirImpacto(double d) {
        //Resta 𝑑 a vida
        setVida(getVida() - d);
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        //Retorna la distancia entre el personaje que invoca el método y el personaje p (Que entró como parámetro).
        distancia = Math.sqrt(Math.pow(getPosicionX() - p.getPosicionX(), 2) + Math.pow(getPosicionY() - p.getPosicionY(), 2));
        return distancia;
    }
    //Inserte acá los SETTERS Y GETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return vida;
    }

}
