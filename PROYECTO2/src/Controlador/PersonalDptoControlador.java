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
public class PersonalDptoControlador {
    public static  PersonalDepartamental ventanaPersonalDpto  = new PersonalDepartamental();
   
   public static void mostrar (){ventanaPersonalDpto.setVisible(true);
   
   }
   public static void ocultar (){ ventanaPersonalDpto.setVisible(false);
   }
}
