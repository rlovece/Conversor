package org.conversor.conversiones;

import org.conversor.models.CambioUnidadTemperatura;
import org.conversor.models.UnidadesTemperatura;
import org.conversor.utilidades.EntradaSalida;

public class ConversionTemperatura {
    public static void convertirTemperatura () {
        UnidadesTemperatura unidadOrigen = EntradaSalida.entradaUnidadTemperatura("Ingrese unidad de Origen");
        double tempOrigen = EntradaSalida.entradafloat("cuántos grados tiene?");
        UnidadesTemperatura unidadDestino = EntradaSalida.entradaUnidadTemperatura("Ingrese unidad de Destino");

        CambioUnidadTemperatura conversionTemp= new CambioUnidadTemperatura(unidadOrigen, tempOrigen, unidadDestino);

        EntradaSalida.SalidaInformacion(conversionTemp.toString(), "Cambio realizado");

    }

}
