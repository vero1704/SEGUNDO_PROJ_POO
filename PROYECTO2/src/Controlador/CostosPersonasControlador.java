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
public class CostosPersonasControlador {
     public static  CostosProyRecursos ventanaCostosPersonas  = new CostosProyRecursos();
   
   public static void mostrar (){ventanaCostosPersonas.setVisible(true);
   
   }
   public static void ocultar (){ ventanaCostosPersonas.setVisible(false);
   }
}
