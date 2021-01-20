/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operations;
import Vista.*;

/**
 *
 * @author Veronica Quesada
 */
public class RegistrarProyectoControlador {

    public static RegistrarProyecto ventanaPro = new RegistrarProyecto();
    private static int id=0 ;
    private static String empresa;
    private static String nombreP;
    private static String EncPro;
    private static String Tareas; //CAMBIAR POR UN ARRAY LIST QUE ALMACENE VARIAS TAREAS
    private static String EncarTarea;
    private static String fecha;
    private static String Recurso;

    public static void mostrar() {
        ventanaPro.setVisible(true);

    }

    public static void ocultar() {
        ventanaPro.setVisible(false);
    }

    public static void botonGuardarProy() {
        leerProyecto();
        Operations.registarProyecto(id, empresa, nombreP, EncarTarea, Tareas, EncarTarea, fecha);
        
    }

    public static void botonSalir() {
        ocultar();
        MenuControlador.volverMenu();
        
        
    }
    
    
    
    public static void botonTareas(){
        
    }
    
    
    public static void botonRecursos(){
        
    }

    public static void leerProyecto() {
        try {
            empresa = (String) ventanaPro.cmbEmpresaP.getSelectedItem();
            nombreP = ventanaPro.jTextFieldNombreProy.getText();
            EncPro = (String) ventanaPro.cmbPersona1.getSelectedItem();
            Tareas = (String) ventanaPro.cmbPersona3.getSelectedItem();
            EncarTarea = (String) ventanaPro.cmbPersona2.getSelectedItem();
            fecha = ventanaPro.jTextFieldFecha.getText();
            Recurso = (String) ventanaPro.cmbRecursos.getSelectedItem();
            id = id++;

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}


