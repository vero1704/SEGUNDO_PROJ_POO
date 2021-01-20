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
public class InicioReportesControlador {
     public static  inicioReportes ventanaInicioReportes  = new inicioReportes();
   
   public static void mostrar (){ventanaInicioReportes.setVisible(true);
   
   }
   public static void ocultar (){ ventanaInicioReportes.setVisible(false);
   }
   
   public static void mostrarInicioReportes(){
       mostrar();
   }
   
   public static void botonRecursosSinUso(){
       ocultar();
       RecursosSinUsoControlador.mostrar();
   }
   public static void botonPersonalDepartamental(){
       ocultar();
       PersonalDptoControlador.mostrar();
       
   }
   public static void botonListaProyectos(){
     ocultar();
     ListaProyectosControlador.mostrar();
     
   }
   public static void botonListaPersonal(){
     ocultar();
     ListaPersonalControlador.mostrar();
   }
   
   public static void botonCostosProyectos(){
     ocultar();
     CostosProyControlador.mostrar();
     
   }
   public static void botonCostosPersonasRecursos(){
     ocultar();
     CostosPersonasControlador.mostrar();
     
   }
   public static void botonActividadesPersonal(){
     ocultar();
     ActividadesPersonasControlador.mostrar();
     
   }
   public static void botonDptoEmpresa(){
     ocultar();
     DepartamentosEmpresasControlador.mostrar();
     
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
