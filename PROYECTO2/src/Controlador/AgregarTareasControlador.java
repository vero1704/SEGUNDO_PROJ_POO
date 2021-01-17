/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
/**
 *
 * @author Veronica Quesada
 */
public class AgregarTareasControlador {
       public static  AgregarTareas ventanaTareas = new AgregarTareas();
   
   public static void mostrar (){ventanaTareas.setVisible(true);
   
   }
   public static void ocultar (){ ventanaTareas.setVisible(false);
   }
}
