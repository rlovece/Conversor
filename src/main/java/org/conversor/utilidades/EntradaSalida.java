package org.conversor.utilidades;

import org.conversor.models.Monedas;
import org.conversor.models.UnidadesTemperatura;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class EntradaSalida {

    ///region Entradas
    /**
     * <h2> Entrada de un número entero</h2>
     * Metodo para ingresar un número entero por teclado.
     * La entrada se obtiene con JOptionPane como string y se parsea a Integer dentro de un try-catch que muestra error y retorna al bucle do
     * en caso de capturase la excepción, e ingresa nuevamente al bucle do.
     *
     * @see JOptionPane
     * @return numero entero ingresado
     * @author Ruth Lovece
     */
    public static int entradaInt (String msj){

        boolean continuar = false;
        int nro = 0;

        while (!continuar) {
            try {
                String entrada = showInputDialog(msj);
                nro = Integer.parseInt(entrada);
                continuar = true;
            } catch (NumberFormatException e) {
                String error = "Introduzca un nro entero";
                EntradaSalida.SalidaError(error);
            }
        }
        return  nro;
    }

    /**
     * <h2> Entrada de un Boolean</h2>
     * Metodo para ingresar un boolean por teclado.
     *
     * @see JOptionPane
     * @return boolean
     * @author Ruth Lovece
     */
    public static boolean entradaBoolean (String msj){

        int option = JOptionPane.showConfirmDialog(null, msj, "", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * <h2> Entrada de un número flotante</h2>
     * Metodo para ingresar un número flotante por teclado.
     * La entrada se obtiene con JOptionPane como string y se parsea a Float dentro de un try-catch que muestra error y retorna al bucle do
     * en caso de capturase la excepción, e ingresa nuevamente al bucle do.
     *
     * @see JOptionPane
     * @return numero entero ingresado
     * @author Ruth Lovece
     */
    public static float entradafloat (String mensaje){
        boolean continuar = false;
        float nro = 0;
        do {
            try {
                String entrada = showInputDialog(mensaje);
                nro= Float.parseFloat(entrada);
                continuar = true;
            }catch (NumberFormatException e){
                String error = "Introduzca un nro";
                EntradaSalida.SalidaError(error);
            }
        } while (!continuar);
        return  nro;
    }

    /**
     * <h2> Entrada de una Moneda</h2>
     * Metodo para ingresar una instancia de Moneda. El método permite selecionar la moneda deseada eliminando
     * posibles errores y siendo amigable con el usuario.
     * Para esto utiliza una arreglo de Monedas y luego se muestra el atributo descripción utilizando
     * JComboBox y JOptionPane
     *
     * @see Monedas
     * @see JComboBox
     * @see JOptionPane
     * @return Zona seleccionada
     * @author Ruth Lovece
     */
    public static Monedas entradaMoneda(String titulo){
        Monedas[] monedas = Monedas.values();

        JComboBox<Monedas> comboBox = new JComboBox<>(monedas);

        int seleccion = JOptionPane.showOptionDialog(
                null,
                comboBox,
                titulo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                monedas[0]);

        Monedas monedaEntrada = monedas[0];;
        if (seleccion != JOptionPane.CLOSED_OPTION) {
            monedaEntrada = (Monedas) comboBox.getSelectedItem();
        }
        return monedaEntrada;
    }

    /**
     * <h2> Entrada Unidad Temperatura</h2>
     * Metodo para ingresar una instancia de UnidadesTemperatura. El método permite selecionar la moneda deseada eliminando
     * posibles errores y siendo amigable con el usuario.
     * Para esto utiliza una arreglo de Monedas y luego se muestra el atributo descripción utilizando
     * JComboBox y JOptionPane
     *
     * @see Monedas
     * @see JComboBox
     * @see JOptionPane
     * @return Zona seleccionada
     * @author Ruth Lovece
     */
    public static UnidadesTemperatura entradaUnidadTemperatura(String titulo){
        UnidadesTemperatura[] unidades = UnidadesTemperatura.values();

        JComboBox<UnidadesTemperatura> comboBox = new JComboBox<>(unidades);

        int seleccion = JOptionPane.showOptionDialog(
                null,
                comboBox,
                titulo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                unidades[0]);

        UnidadesTemperatura entradaUnidad = unidades[0];;
        if (seleccion != JOptionPane.CLOSED_OPTION) {
            entradaUnidad = (UnidadesTemperatura) comboBox.getSelectedItem();
        }
        return entradaUnidad;
    }


    ///endregion

    ///region Salidas
    /**
     * <h2> Mensaje con Error</h2>
     * Metodo mostrar errores al usuario utilizando JOptionPane. Se solititan como paràmetros el mensaje que
     * se quiere mostrar y el tìtulo de la ventana.
     *
     * @see JOptionPane
     * @param msj
     * @author Ruth Lovece
     */
    public static void SalidaError (String msj){
        JOptionPane.showMessageDialog(null, msj, " ❌ ERROR ❌", ERROR_MESSAGE);
    }

    /**
     * <h2> Mensaje con Información</h2>
     * Metodo para mostrar información al usuario utilizando JOptionPane. Se solititan como paràmetros el mensaje que
     * se quiere mostrar y el tìtulo de la ventana.
     *
     * @see JOptionPane
     * @param msj
     * @param titulo
     * @author Ruth Lovece
     */
    public static void SalidaInformacion (String msj, String titulo){
        JOptionPane.showMessageDialog(null, msj, titulo, INFORMATION_MESSAGE);
    }

    ///endregion


}