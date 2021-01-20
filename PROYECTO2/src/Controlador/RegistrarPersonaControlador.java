/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Persona;
import Excepciones.ExcepcionesPersona;
import Modelo.Operations;
import Vista.*;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica Quesada
 */
public class RegistrarPersonaControlador {

    public static RegistrarPersona ventanaPer = new RegistrarPersona();
    private static String nombre;
    private static String puesto;
    private static int salario;
    private static int cedula;
    private static String empresa;

    public static void mostrar() {
        ventanaPer.setVisible(true);

    }

    public static void ocultarPer() {
        ventanaPer.setVisible(false);
    }

    public static void InicioPersona() {
        mostrar();
    }

    public static void botonGuardaPersona() {
        leerPersona();
        Operations.registrarPersona(nombre, puesto, cedula, salario, empresa);
    }

    public static void botonSalir() {
        ocultarPer();
        MenuControlador.volverMenu();
    }

    public static void leerPersona() {

        Persona personas = new Persona();
        int cedula = 0;
        int salario = 0;

        nombre = ventanaPer.txtNombrePersona.getText();
        puesto = ventanaPer.txtPuesto.getText();
        empresa = (String) ventanaPer.cmbEmpresa.getSelectedItem();
        Component rootPane = null;

        if (ventanaPer.txtCedula.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los campos");
        } else {
            cedula = Integer.parseInt(ventanaPer.txtCedula.getText());
        }

        if (ventanaPer.txtSalario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los campos");
        } else {
            salario = Integer.parseInt(ventanaPer.txtSalario.getText());
        }

    }
}
