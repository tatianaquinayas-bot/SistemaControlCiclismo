
package com.mycompany.sistemacontrolciclismo;

import Controlador.ControladorMundial;
import Vista.VistaMundial;

public class SistemaControlCiclismo {

    public static void main(String[] args) {

        // Crear el controlador
        ControladorMundial controlador = new ControladorMundial();

        // Crear la vista
        VistaMundial vista = new VistaMundial();

        // Conectar la vista con el controlador
        vista.setControlador(controlador);

        // Mostrar la ventana
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

    }
}
