/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Excepciones.ExcepcionesTareas;
import Entidades.Tarea;
import Modelo.Operations;
import Vista.*;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author Veronica Quesada
 */
public class AgregarTareasControlador {
       public static  AgregarTareas ventanaTareas = new AgregarTareas();
       private static String descripcion;
       private static int semana;
       private static int cantper;
       private static int horareq;
       private static int horasdia;
   
   public static void mostrar (){ventanaTareas.setVisible(true);
   
   }
   public static void ocultar (){ ventanaTareas.setVisible(false);
   }
   
   
   public static void botonguardar(){
       leerTarea();
       Operations.registarTareas(semana, descripcion, descripcion, cantper, semana, horareq, horasdia);
       
   }
   public static void botonSalir(){
       
      ocultar();
      RegistrarProyectoControlador.mostrar();
      
   }
   
   
   
   
   
       public static void leerTarea() {

        Tarea tareas = new Tarea();
        

        descripcion = ventanaTareas.jTextFieldDescrip.getText();
        semana = (Integer)ventanaTareas.jSpinnerSemana.getValue();
        cantper= (Integer)ventanaTareas.jSpinnerPersonas.getValue();
        horareq= (Integer)ventanaTareas.jSpinnerHorasReq.getValue();
        horasdia= (Integer)ventanaTareas.jSpinnerHorasXD.getValue();
        
        Component rootPane = null;

        if (ventanaTareas.jTextFieldDescrip.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los campos");
        } else {
            descripcion = ventanaTareas.jTextFieldDescrip.getText();
        }

    }
}

   
   
   

