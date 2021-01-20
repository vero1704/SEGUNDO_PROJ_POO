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
public class DepartamentosEmpresasControlador {
     public static  DepartamentosEmpresa ventanaDptoEmpresa  = new DepartamentosEmpresa();
   
   public static void mostrar (){ventanaDptoEmpresa.setVisible(true);
   
   }
   public static void ocultar (){ ventanaDptoEmpresa.setVisible(false);
   }
}
