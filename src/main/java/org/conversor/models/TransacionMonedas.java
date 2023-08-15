package org.conversor.models;

import java.text.DecimalFormat;

public class TransacionMonedas {

    private Monedas monedaOrigen;

    private double cantMonedaOrigen;

    private Monedas monedaDestino;

    private double cantMonedaDestino;

    ///region Contructor
    public TransacionMonedas(Monedas monedaOrigen, double cantMonedaOrigen, Monedas monedaDestino) {
        this.monedaOrigen = monedaOrigen;
        this.cantMonedaOrigen = cantMonedaOrigen;
        this.monedaDestino = monedaDestino;
        this.cantMonedaDestino = this.cantMonedaOrigen / this.monedaOrigen.getTasaDeCambioDolar()
                * this.monedaDestino.getTasaDeCambioDolar();
    }
    ///endregion

    ///region getters y setters

    public Monedas getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(Monedas monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public double getCantMonedaOrigen() {
        return cantMonedaOrigen;
    }

    public void setCantMonedaOrigen(double cantMonedaOrigen) {
        this.cantMonedaOrigen = cantMonedaOrigen;
    }

    public Monedas getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(Monedas monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getCantMonedaDestino() {
        return cantMonedaDestino;
    }

    public void setCantMonedaDestino(double cantMonedaDestino) {
        this.cantMonedaDestino = cantMonedaDestino;
    }

    ///endregion

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Transacion \n" +
                "Usted tenía " + decimalFormat.format(cantMonedaOrigen) +
                " " + monedaOrigen +
                "\nLos cambio por " + decimalFormat.format(cantMonedaDestino) +
                " " + monedaDestino;
    }
}
