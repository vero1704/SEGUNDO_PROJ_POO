/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operations;
import Vista.*;
import Modelo.Operations;
/**
 *
 * @author Veronica Quesada
 */



public class EditPersonaControlador {

    public static EditarPersona ventanaEditPer = new EditarPersona();

    private static String nombre;
    private static String puesto;
    private static int salario;
    private static int cedula;
    private static String empresa;

    public static void mostrarEditar() {
        ventanaEditPer.setVisible(true);

    }

    public static void ocultarEditar() {
        ventanaEditPer.setVisible(false);
    }

    
    public static void botonGuardar(){
        leerEdit();
       Operations.actualizarPersona(nombre, salario, cedula, puesto, empresa);
        
        
    }
    public static void botonSalir(){
         ocultarEditar();
         MenuControlador.volverMenu();
         
    }
    
    
    
    
    public static void leerEdit() {
        nombre = ventanaEditPer.txtNombrePersona.getText();
        puesto = ventanaEditPer.txtPuesto.getText();
        cedula = (int) ventanaEditPer.cmbCedulas.getSelectedItem();
        salario = Integer.valueOf(ventanaEditPer.txtSalario.getText());
        empresa = (String) ventanaEditPer.cmbEmpresa.getSelectedItem();
    }
}
