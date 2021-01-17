/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Model.Operations;
import Vista.*;
/**
 *
 * @author Veronica Quesada
 */
public class RegistrarPersonaControlador {
     public static RegistrarPersona ventanaPer  = new RegistrarPersona();
    private static String nombre;
    private static String puesto;
    private static int salario;
    private static int cedula;
    private  static String empresa;
   public static void mostrar (){ventanaPer.setVisible(true);
       Operations.cargarEmpresa();
   
   }
   public static void ocultarPer (){ ventanaPer.setVisible(false);
   }
   
   
   public static void InicioPersona(){
       mostrar();
       
       
   }
   public static void botonGuardaPersona(){
       leerPersona();
       Operations.registrarPersona(nombre, puesto, cedula, salario, empresa);
   }
   public static void botonSalir(){
        ocultarPer();
        inicioControlador.volverInicio();
    }
         
   
   
   
   
    public static void leerPersona() {
        try {

            nombre = ventanaPer.txtNombrePersona.getText();
            puesto = ventanaPer.txtPuesto.getText();
            cedula=  Integer.valueOf(ventanaPer.txtCedula.getText());
            salario = Integer.valueOf(ventanaPer.txtSalario.getText());
            empresa = (String) ventanaPer.cmbEmpresa.getSelectedItem();

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
