package org.conversor.models;

public enum UnidadesTemperatura {
    CELSIUS("Celsius", "°C", 1.0,0),
    FAHRENHEIT("Fahrenheit", "°F", 9.0 / 5.0, 32.0),
    KELVIN("Kelvin", "K", 1.0, 273.15);

    private final String nombre;
    private final String simbolo;
    private final double factorConversion;
    private final double desplazamiento;

    ///region Constructor
    UnidadesTemperatura(String nombre, String simbolo, double factorConversion, double desplazamiento) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.factorConversion = factorConversion;
        this.desplazamiento = desplazamiento;
    }

    //endregion

    ///region Getters

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getFactorConversion() {
        return factorConversion;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    ///endregion
    @Override
    public String toString() {return simbolo;}
}
