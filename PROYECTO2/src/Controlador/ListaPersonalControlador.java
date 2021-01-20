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
public class ListaPersonalControlador {
     public static  ListaPersonas ventanaListaPersonal  = new ListaPersonas();
   
   public static void mostrar (){ventanaListaPersonal.setVisible(true);
   
   }
   public static void ocultar (){ ventanaListaPersonal.setVisible(false);
   }
}
