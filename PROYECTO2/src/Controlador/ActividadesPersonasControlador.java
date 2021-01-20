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
public class ActividadesPersonasControlador {
    public static  ActividadesPersona ventanaActividadesPersonas  = new ActividadesPersona();
   
   public static void mostrar (){ventanaActividadesPersonas.setVisible(true);
   
   }
   public static void ocultar (){ ventanaActividadesPersonas.setVisible(false);
   }
}
