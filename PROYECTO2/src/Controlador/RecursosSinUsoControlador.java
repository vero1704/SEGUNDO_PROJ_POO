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
public class RecursosSinUsoControlador {
    public static  RecursosSinUso ventanaRecSinUso  = new RecursosSinUso();
   
   public static void mostrar (){ventanaRecSinUso.setVisible(true);
   
   }
   public static void ocultar (){ ventanaRecSinUso.setVisible(false);
   }
   
   
   
   
   
   
   public static void botonMostrarDatos(){
       mostrar();
       
   }
   
   
   
   
   
   
}

