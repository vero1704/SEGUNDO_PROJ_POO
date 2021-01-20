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
public class CostosProyControlador {
     public static  CostosProyectos ventanaCostosProy  = new CostosProyectos();
   
   public static void mostrar (){ventanaCostosProy.setVisible(true);
   
   }
   public static void ocultar (){ ventanaCostosProy.setVisible(false);
   }
}
