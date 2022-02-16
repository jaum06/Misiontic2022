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
public class Autobus {

    //Inserte acá los atributos
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    //Inserte acá el método constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void recogerPasajero(int estrato) {
        //Suma el costo del pasaje pagado por el pasajero a cantidadDinero
        if (isEnMarcha() == false) {
            if (getnPasajeros() < getnMaximoPasajeros()) {
                if (estrato >= 0 && estrato < 3) {
                    setCantidadDinero(getCantidadDinero() + 1500);
                    setnPasajeros(getnPasajeros() + 1);
                } else if (estrato == 3 || estrato == 4) {
                    setCantidadDinero(getCantidadDinero() + 2600);
                    setnPasajeros(getnPasajeros() + 1);
                } else if (estrato == 5 || estrato == 6) {
                    setCantidadDinero(getCantidadDinero() + 3000);
                    setnPasajeros(getnPasajeros() + 1);
                }
            }
        }
    }

    public void dejarPasajero() {
        //Resta 1 a nPasajeros
        //if (isEnMarcha() == false) {
        setnPasajeros(getnPasajeros() - 1);
        //}
    }

    public double calcularDistanciaAcopio() {
        //Retorna la distancia entre el origen de coordenadas y el punto en el que se encuentra el autobús.
        double distancia = 0;
        distancia = Math.sqrt((getLocalizacionX() * getLocalizacionX()) + (getLocalizacionY() * getLocalizacionY()));
        return distancia;
    }

    public void gestionarPuerta() {
        //Abre la puerta si está cerrada al invocar este método y viceversa (El abrir o cerrar la puerta no se ve afectado por el estado encendido del motor)
        if (isEnMarcha()) {
            setPuertaAbierta(false);
        } else {
            if (isPuertaAbierta()) {
                setPuertaAbierta(false);
            } else {
                setPuertaAbierta(true);
            }
        }
    }

    public void gestionarAireAcondicionado() {
        //Enciende el aire acondicionado si  está apagado al invocar este método y viceversa
        if (isMotorEncendido()) {
            if (isAireAcondicionadoActivado()) {
                setAireAcondicionadoActivado(false);
            } else {
                setAireAcondicionadoActivado(true);
            }
        } else {
            setAireAcondicionadoActivado(false);
        }
    }

    public void gestionarMotor() {
        //Enciende el motor si está apagado al invocar este método y viceversa
        if (isMotorEncendido()) {
            setMotorEncendido(false);
            setWifiEncendido(false);
            setAireAcondicionadoActivado(false);
            setEnMarcha(false);
        } else {
            setMotorEncendido(true);
        }
    }

    public void gestionarWifi() {
        //Enciende el wifi si está apagado al invocar este método y viceversa
        if (isMotorEncendido()) {
            if (isWifiEncendido()) {
                setWifiEncendido(false);
            } else {
                setWifiEncendido(true);
            }
        } else {
            setWifiEncendido(false);
        }
    }

    public void gestionarMarcha() {
        //Activa la marcha del autobús si está parado al invocar este método y viceversa
        if (isMotorEncendido()) {
            if (isEnMarcha()) {
                setEnMarcha(false);
            } else {
                setEnMarcha(true);
            }
        } else {
            setEnMarcha(false);
        }

    }

    public void moverDerecha(double d) {
        //Suma 𝑑 a localizacionX
        if (isEnMarcha() && isPuertaAbierta() == false) {
            setLocalizacionX(getLocalizacionX() + d);
        }

    }

    public void moverIzquierda(double d) {
        //Resta 𝑑 a localizacionX
        if (isEnMarcha() && isPuertaAbierta() == false) {
            setLocalizacionX(getLocalizacionX() - d);
        }
    }

    public void moverArriba(double d) {
        //Suma 𝑑 a localizacionY
        if (isEnMarcha() && isPuertaAbierta() == false) {
            setLocalizacionY(getLocalizacionY() + d);
        }
    }

    public void moverAbajo(double d) {
        //Resta 𝑑 a localizacionY
        if (isEnMarcha() && isPuertaAbierta() == false) {
            setLocalizacionY(getLocalizacionY() - d);
        }
    }

    //Inserte acá los SETTERS Y GETTERS
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

}
