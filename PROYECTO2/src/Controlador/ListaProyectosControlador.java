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
public class ListaProyectosControlador {
    public static  ListaProyectos ventanaListaProy  = new ListaProyectos();
   
   public static void mostrar (){ventanaListaProy.setVisible(true);
   
   }
   public static void ocultar (){ ventanaListaProy.setVisible(false);
   }
}
