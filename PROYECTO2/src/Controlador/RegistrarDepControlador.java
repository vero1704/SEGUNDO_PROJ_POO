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
public class RegistrarDepControlador {
     public static  RegistrarDepartamentos ventanaDpto  = new RegistrarDepartamentos();
     
     private static String empresa;
     private static String encargado;
     private static String nombre;
     
   public static void mostrarDpto (){ventanaDpto.setVisible(true);
   
   }
   public static void ocultarDpto (){ ventanaDpto.setVisible(false);
   }
    public static void InicioDpto(){
       mostrarDpto();
       
       
   }
   
    public static void botonGuardaPersona(){
       leerDpto();
       Operations.registrarDep(nombre,encargado, empresa);
   }
   public static void botonSalir(){
        ocultarDpto();
        MenuControlador.volverMenu();
    }
   
   
   
   
   public static void leerDpto(){
       try {

            nombre = ventanaDpto.txtNombreDepart1.getText();
            encargado = (String) ventanaDpto.cmbEncargadoDep1.getSelectedItem();
           
            empresa = (String) ventanaDpto.cmbEmpresa.getSelectedItem();

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
   }
   
   
}
