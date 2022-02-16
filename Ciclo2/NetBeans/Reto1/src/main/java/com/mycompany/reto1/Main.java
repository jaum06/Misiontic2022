/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto1;

/**
 *
 * @author Andrés
 */
public class Main {

    public static void main(String[] args) {
        Autobus camion1 = new Autobus("Pepe", 30, false);
        camion1.moverDerecha(5);
        camion1.gestionarWifi();
        camion1.gestionarAireAcondicionado();
        camion1.gestionarMarcha();
        camion1.gestionarMotor();
        camion1.gestionarMarcha();
        camion1.moverDerecha(5);
        camion1.recogerPasajero(2);
        camion1.gestionarPuerta();
        camion1.moverArriba(10);
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.recogerPasajero(1);
        camion1.recogerPasajero(4);
        camion1.recogerPasajero(6);
        camion1.gestionarWifi();
        camion1.gestionarAireAcondicionado();
        camion1.gestionarMarcha();
        camion1.moverIzquierda(2);
        camion1.dejarPasajero();
        camion1.gestionarMotor();
        camion1.calcularDistanciaAcopio();
    }

}
