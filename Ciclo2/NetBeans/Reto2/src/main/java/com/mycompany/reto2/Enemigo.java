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
public class Enemigo extends Personaje {

    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
    int evolucionesAplicadas = 0;
    int resistencia = 1;

    //Inserte acá el método constructor
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void evolucionar() {
        /*Si el enemigo que invoca este método tiene 30 puntos de vida (O menos) y evoluciones Aplicadas es igual a 0, se suma 20 al atributo damage, y se suma 1 a evolucionesAplicadas. 
          Si el enemigo que invoca este método tiene 10 puntos de vida (O menos) y evoluciones Aplicadas es igual a 1, se suma 1 al atributo resistencia, y se suma 1 a evolucionesAplicadas*/
        if (getVida() > 10 && getVida() <= 30) {
            if (getEvolucionesAplicadas()== 0) {
                setDamage(getDamage() + 20);
                setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
            }
        } else if (getVida() <= 10 && getVida() > 0) {
            if (getEvolucionesAplicadas()== 0) {
                setDamage(getDamage() + 20);
            }
            setResistencia(2);
            setEvolucionesAplicadas(2);
        }
    }

    public void recibirImpacto(double d) {
        // Resta 𝑑/𝑟𝑒𝑠𝑖𝑠𝑡𝑒𝑛𝑐𝑖𝑎 a vida
        setVida(d / getResistencia());
    }

    //Inserte acá los SETTERS Y GETTERS
    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }
}
