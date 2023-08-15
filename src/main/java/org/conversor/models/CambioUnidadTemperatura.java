package org.conversor.models;

import java.text.DecimalFormat;

public class CambioUnidadTemperatura {

    private UnidadesTemperatura unidadOrigen;

    private double temperaturaOrigen;

    private UnidadesTemperatura unidadDestino;

    private double temperaturaDestino;

    public CambioUnidadTemperatura(UnidadesTemperatura unidadOrigen, double temperaturaOrigen, UnidadesTemperatura unidadDestino) {
        this.unidadOrigen = unidadOrigen;
        this.temperaturaOrigen = temperaturaOrigen;
        this.unidadDestino = unidadDestino;
        double temperaturaCelsius = (temperaturaOrigen - unidadOrigen.getDesplazamiento()) /
                unidadOrigen.getFactorConversion() ;
        this.temperaturaDestino = temperaturaCelsius * unidadDestino.getFactorConversion() +
                unidadDestino.getDesplazamiento();
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Conversión:  \n" +
                decimalFormat.format(temperaturaOrigen) +
                " " + unidadOrigen +
                " = " + decimalFormat.format(temperaturaDestino) +
                " " + unidadDestino;
    }
}
