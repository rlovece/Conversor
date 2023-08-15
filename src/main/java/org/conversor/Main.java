package org.conversor;

import org.conversor.conversiones.ConversionDeMoneda;
import org.conversor.conversiones.ConversionTemperatura;
import org.conversor.utilidades.EntradaSalida;

public class Main {
    public static void main(String[] args) {

        boolean continuar;

        do {
            int opcion = EntradaSalida.entradaInt("\n\n     INGRESE LA OPCIÓN DESEADA   " +
                    "\n 1. Realizar conversión de moneda" +
                    "\n 2. Realizar conversión de temperatura" +
                    "\n\n"
            );

            switch (opcion) {
                case 1:
                    ConversionDeMoneda.convertirMoneda();
                    break;

                case 2:
                    ConversionTemperatura.convertirTemperatura();
                    break;

                default:
            }

            continuar = EntradaSalida.entradaBoolean("\n\n Desea realizar otra operación? \n\n");

        } while (continuar);
    }
}