package org.conversor.conversiones;

import org.conversor.models.Monedas;
import org.conversor.models.TransacionMonedas;
import org.conversor.utilidades.EntradaSalida;

public class ConversionDeMoneda {

    public static void convertirMoneda () {
        Monedas monedaOrigen = EntradaSalida.entradaMoneda("Ingrese moneda de Origen");
        double cantOrigen = EntradaSalida.entradafloat("Que cantidad tiene?");
        Monedas monedaDestino = EntradaSalida.entradaMoneda("Ingrese moneda de Destino");

        TransacionMonedas transacionMonedas = new TransacionMonedas(monedaOrigen, cantOrigen, monedaDestino);

        EntradaSalida.SalidaInformacion(transacionMonedas.toString(), "Cambio realizado");
    }

}
