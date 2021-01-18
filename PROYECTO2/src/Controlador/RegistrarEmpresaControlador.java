/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.*;
import Model.Operations;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica Quesada
 */
public class RegistrarEmpresaControlador {

    private Operations model;
    private static String nombreEmp;
    private static int telefono;
    private static String ubicacion;

    public static RegistrarEmpresa ventanaEmp = new RegistrarEmpresa();

    public static void mostrarEmp() {
        ventanaEmp.setVisible(true);

    }

    public static void ocultarEmp() {
        ventanaEmp.setVisible(false);
    }

    public static void botonGuardarEmpresa() {
        leerEmpresa();
        Operations.registrarEmpresa(nombreEmp, telefono, ubicacion);
    }

    public static void botonSalir() {
        ocultarEmp();
        inicioControlador.volverInicio();
    }

    public static void leerEmpresa() {
        int telefono = 0;
        try {

            nombreEmp = ventanaEmp.txtNombreEmpres.getText();
            if (ventanaEmp.txtTelefonoEmpresa.getText().equals("")) {
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los campos");
            } else {
                telefono = Integer.parseInt(ventanaEmp.txtTelefonoEmpresa.getText());
            }

            ubicacion = ventanaEmp.txtUbicsacionEmpresa.getText();

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
