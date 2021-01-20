/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
import Modelo.Operations;

/**
 *
 * @author Veronica Quesada
 */
public class inicioControlador {
    private Operations model;
    
   public static inicio ventana  = new inicio();
   
   public static void mostrar (){ventana.setVisible(true);
   
   }
   public static void ocultar (){ ventana.setVisible(false);
   }
      
   public static void LlamarEmpresa(){
       ocultar();
       RegistrarEmpresaControlador.mostrarEmp();
       
   }
   
     public static void LlamarMenu(){
       ocultar();
       MenuControlador.volverMenu();
       Operations.cargarEmpresamenu();
       
   }
     
     public static void LlamarReportes(){
         ocultar();
         InicioReportesControlador.mostrarInicioReportes();
     }
     
     
     
   
   public static void volverInicio(){
       mostrar();
   }
  
   
   
  
}
