/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entidades.Departamento;
import Entidades.Empresa;
import Entidades.Persona;
import Entidades.Proyectos;
import Excepcion.ExcepcionesEmpresa;
import Excepcion.ExcepcionesPersona;
import Modelo.Metodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vista.*;
import java.awt.Component;



/**
 *
 * @author Veronica Quesada
 */
public class Operations extends javax.swing.JFrame {
     private static RegistrarPersona vista;
    
    public static Metodos procesos = new Metodos();
     
    

     public static void registrarPersona( String nombre, String puesto, int cedula, int salario, String empresa)  {
     
        
        Empresa empresas = new Empresa(empresa);
               Component rootPane = null;

        Persona personas = new Persona(nombre, salario,cedula, puesto, empresas);
        
         try {
            personas.setNombre(nombre);

        } catch (ExcepcionesPersona variable) {
            JOptionPane.showMessageDialog(rootPane, variable);
              variable.printStackTrace();
            
        }

          try {
              personas.setSalario(salario);

          } catch (ExcepcionesPersona variable) {
              JOptionPane.showMessageDialog(rootPane, variable);
          }

          try {
              personas.setPuesto(puesto);

          } catch (ExcepcionesPersona variable) {
              JOptionPane.showMessageDialog(rootPane, variable);
          }
          
             try {
              personas.setEmpresas(empresa);

          } catch (ExcepcionesPersona variable) {
              JOptionPane.showMessageDialog(rootPane, variable);
          }
             
             try {
              personas.setCedula(cedula);

          } catch (ExcepcionesPersona variable) {
              JOptionPane.showMessageDialog(rootPane, variable);
          }


        Metodos.guardarPersona(personas);

        }
        
        
        
        public static void registrarEmpresa( String nombreEmpresa,  int telefono, String ubicacion) {
          
    
        
          Empresa empresas = new Empresa(nombreEmpresa, telefono, ubicacion);
                 Component rootPane = null;
                 
          try {
            empresas.setNombreE(nombreEmpresa);

        } catch (ExcepcionesEmpresa variable) {
            JOptionPane.showMessageDialog(rootPane, variable);
        }

        try {
            empresas.setTelefono(telefono);

        } catch (ExcepcionesEmpresa variable) {
            JOptionPane.showMessageDialog(rootPane, variable);
        }

        try {
            empresas.setUbicacion(ubicacion);

        } catch (ExcepcionesEmpresa variable) {
            JOptionPane.showMessageDialog(rootPane, variable);
        }
   
         Metodos.guardarEmpresa(empresas);

        }
        
        public static void registarProyecto(int Id, String empresa, String nombreP, String encargadop, String Tareas, String EncarTarea, String fecha){
            
            Proyectos proyecto = new Proyectos(Id,empresa, nombreP,encargadop,Tareas,EncarTarea, fecha);
            Metodos.guardarProyecto(proyecto);
            
            
            
        }
        
        
        public static void EditarPersona(String nombre, int salario, int cedula, String puesto,  String empresas){
            //QUITE LOS COMENTARIOS
             //Persona personas = new Persona(nombre, salario,cedula, puesto, empresas); //SI VE ESTE ERROR AYUDEME A CORREGIRLO
              //  Metodos.editarPersonas(personas);
            
        }
        
        
        
        
        
        public static void registrarDep(String nombreDepto, String nombre, String empresas) {

       
        Persona persona = new Persona(nombre);
        Empresa empresa = new Empresa(empresas);

        Departamento dept = new Departamento(nombreDepto, persona, empresa);

        ArrayList<Empresa> empre = procesos.empresaPersona(persona);
        for (Empresa temp : empre) {
            if (temp.getNombreE() == null) {
                //JOptionPane.showMessageDialog(rootPane, "Debe de buscar una empresa para trabajar");
            } else if (temp.getNombreE().equals(empresas)) {
                procesos.guardarDepto(dept);
            } else {
                //JOptionPane.showMessageDialog(rootPane, "Usted no es colaborador de la empresa");
            }
        }

    }
        
    }
        
        
        
      

