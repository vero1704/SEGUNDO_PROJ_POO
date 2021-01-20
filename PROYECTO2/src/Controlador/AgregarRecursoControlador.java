/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Entidades.Recursos;
import Vista.*;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author Veronica Quesada
 */
public class AgregarRecursoControlador {
       public static  AgregarRecurso ventanaRec  = new AgregarRecurso();
       private static String nombreReq;
       private int costo ;
   
   public static void mostrar (){ventanaRec.setVisible(true);
   
   }
   public static void ocultar (){ ventanaRec.setVisible(false);
   
   }
   
   
   
   
       public static void leerRecurso() {

        Recursos recurso = new Recursos();
        

        nombreReq = ventanaRec.jTextField1.getText();
        
        Component rootPane = null;

        if (ventanaRec.jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los campos");
        } else {
            nombreReq = ventanaRec.jTextField1.getText();
        }

    }
}
