/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controlador;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.modelo.Modelo;
import mvc.vista.RegistrarEmpresa;
import mvc.vista.inicio;

/**
 *
 * @author ma210
 */
public class Controlador implements ActionListener{
    
    private RegistrarEmpresa vista;
    private Modelo modelo;
    
    public Controlador( RegistrarEmpresa vista , Modelo modelo){
         this.vista = vista;
         this.modelo = modelo;
         this.vista.btnSalir.addActionListener(this);//los botones deben ser publicos en la vista.
      
    }


    public void actionPerformed(ActionEvent e) { 
        if(e.getActionCommand().equals("Salir")){
           volverInicio();
         }
    }
    
    public void volverInicio(){
        inicio ventana = new inicio(this.vista,true);
        ventana.pack();
        setVisible(false);
        ventana.setVisible(true);
    }
    
    
}
