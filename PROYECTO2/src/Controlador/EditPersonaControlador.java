/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Operations;
import Vista.*;
import Model.Operations;
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

    public static void mostrar() {
        ventanaEditPer.setVisible(true);

    }

    public static void ocultar() {
        ventanaEditPer.setVisible(false);
    }

    
    public static void botonGuardar(){
        leerEdit();
        
       
        
        
        
    }
    
    
    
    
    public static void leerEdit() {
        nombre = ventanaEditPer.txtNombrePersona.getText();
        puesto = ventanaEditPer.txtPuesto.getText();
        cedula = (int) ventanaEditPer.cmbCedulas.getSelectedItem();
        salario = Integer.valueOf(ventanaEditPer.txtSalario.getText());
        empresa = (String) ventanaEditPer.cmbEmpresa.getSelectedItem();
    }
}
