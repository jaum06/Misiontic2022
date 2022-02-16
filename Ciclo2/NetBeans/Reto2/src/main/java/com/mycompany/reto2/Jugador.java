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
public class Jugador extends Personaje {

    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos
    int numeroBotiquines = 0;
    //Inserte acá el método constructor

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin() {
        //Resta 1 a numeroBotiquines y suma 5 a vida (Solo si el jugador tiene botiquines)
        if (getNumeroBotiquines() != 0) {
            if (getVida() < 100) {
                setNumeroBotiquines(getNumeroBotiquines() - 1);
                setVida(getVida() + 5);
                if (getVida() > 100) {
                    setVida(100);
                }
            } else {
                setNumeroBotiquines(getNumeroBotiquines() - 1);
            }
        }
    }

    public void recogerBotiquin() {
        //Suma 1 a numeroBotiquines
        setNumeroBotiquines(getNumeroBotiquines() + 1);
    }

    public void moverDerecha(double d) {
        //Suma 𝑑 a posicionX
        setPosicionX(getPosicionX() + d);
    }

    public void moverIzquierda(double d) {
        //Resta 𝑑 a posicionX
        setPosicionX(getPosicionX() - d);
    }

    public void moverArriba(double d) {
        //Suma 𝑑 a posicionY
        setPosicionY(getPosicionY() + d);
    }

    public void moverAbajo(double d) {
        //Resta 𝑑 a posicionY
        setPosicionY(getPosicionY() - d);
    }

    public void golpear(Enemigo p) {
        //Además de realizar lo que se especifica en la clase padre, debe invocar la evolución del enemigo p
        if (p.getVida() > 0) {
            if (p.evolucionesAplicadas == 2) {
                p.setVida(p.getVida() - ((getDamage() / 2) / calcularDistanciaRespectoPersonaje(p)));
            } else {
                p.setVida(p.getVida() - (getDamage() / calcularDistanciaRespectoPersonaje(p)));
            }
            p.evolucionar();
        } else {
            p.setVida(0);
        }
    }

    //Inserte acá los SETTERS Y GETTERS
    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }
}
