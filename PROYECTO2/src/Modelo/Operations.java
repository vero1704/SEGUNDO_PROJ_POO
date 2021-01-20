/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidades.Departamento;
import Entidades.Empresa;
import Entidades.Persona;
import Entidades.Proyectos;
import Entidades.Recursos;
import Entidades.Tarea;
import Excepciones.ExcepcionesEmpresa;
import Excepciones.ExcepcionesPersona;
import Metodos.Metodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vista.*;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veronica Quesada
 */
public class Operations extends javax.swing.JFrame {

    private static RegistrarPersona RegPersona;
    private static EditarDpto Dpto;
    private static EditarPersona editP;
    
    public static Menu menu;
      public static ListaProyectos l;

    public static Metodos procesos = new Metodos();

    
    //THIS METHOD REGISTER A PERSON IN THE DB
    public static void registrarPersona(String nombre, String puesto, int cedula, int salario, String empresa) {

        Empresa empresas = new Empresa(empresa);
        Component rootPane = null;

        Persona personas = new Persona(nombre, salario, cedula, puesto, empresas);

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
//THIS METHOD REGISTER A COMPANY IN THE DB
    public static void registrarEmpresa(String nombreEmpresa, int telefono, String ubicacion) {

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
//THIS METHOD REGISTER A PROJECT IN THE DB
    public static void registarProyecto(int Id, String empresa, String nombreP, String encargadop, String Tareas, String EncarTarea, String fecha) {

        Proyectos proyecto = new Proyectos(Id, empresa, nombreP, encargadop, Tareas, EncarTarea, fecha);

        Metodos.guardarProyecto(proyecto);

    }
    //THIS METHOD REGISTER A TASK IN THE DB
     public static void registarTareas(int Id,String descripcion, String encargados,int cantper, int semanas,int horareq, int horasdia) {

        Tarea tareas = new Tarea( Id, descripcion, encargados, cantper, semanas, horareq, horasdia);
        Metodos.guardarTareas(tareas);

    }
     
     //THIS METHOD REGISTER A RESOURCE IN THE DB
     public static void registrarRecursos(int costo, String nombreReq){
         Recursos recurso = new Recursos(costo,nombreReq);
         Metodos.guardarRecursos(recurso);
     }
//THIS METHOD REGISTER A DEPARTMENT IN THE DB
    public static void registrarDep(String nombreDepto, String nombre, String empresas) {

        Persona persona = new Persona(nombre);
        Empresa empresa = new Empresa(empresas);

        Departamento dept = new Departamento(nombreDepto, persona, empresa);

        ArrayList<Empresa> empre = procesos.empresaPersona(persona);
        Component rootPane = null;
        for (Empresa temp : empre) {
            if (temp.getNombreE() == null) {
                JOptionPane.showMessageDialog(rootPane, "Debe de buscar una empresa para trabajar");
            } else if (temp.getNombreE().equals(empresas)) {
                procesos.guardarDepto(dept);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usted no es colaborador de la empresa");
            }
        }
        
        Metodos.editarDpto(dept);

    }
// THIS METHOD GET THE DEPARTMENT FOR THE MENU WINDOW
    public static void CargarDeptos() {

        try {
            String dept = (String) menu.cmbDeparta.getSelectedItem();
            Empresa infoDpto = new Empresa();
            infoDpto.setNombreE(dept);

            ArrayList<Departamento> dptos = procesos.mostrarDptoEspecificos(infoDpto);
            DefaultTableModel modelo = (DefaultTableModel) menu.tablaDepart.getModel();
            modelo.setRowCount(0);

            for (Departamento temp : dptos) {
                Object[] fila = {temp.getNombreD(), temp.getNombreP()};
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            menu.txtCon.setText("No hay departamentos registrados");
        }
    }
    
    // THIS METHOD GET THE COMPANY FOR THE MENU WINDOW
    public static void cargarEmpresamenu() {
        
        Component rootPane = null;
        try {
            ArrayList<Empresa> usuarios = procesos.mostrarEmpresas();
            if (usuarios.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Debe de registrar primero una empresa");
            } else {
                for (Empresa temp : usuarios) {
                    menu.cmbDeparta.addItem(temp.getNombreE());
                    menu.cmbEmpresas1.addItem(temp.getNombreE());
                    menu.cmbEmpresas2.addItem(temp.getNombreE());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
// THIS METHOD GET THE PEOPLE FOR THE MENU WINDOW
    public static void cargarPersonas() {
        try {
            ArrayList<Persona> personas = procesos.mostrarTodasPersona();
            DefaultTableModel modelo = (DefaultTableModel) menu.tablaPersona.getModel();
            modelo.setRowCount(0);

            for (Persona temp : personas) {
                Object[] fila = {temp.getCedula(), temp.getNombre(), temp.getEmpresas(), temp.getPuesto(), temp.getSalario()};
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            menu.txtCon.setText("No hay personas registradas");
        }

    }

//THIS METHOD GET THE COMPANY FOR THE  PERSON WINDOW
    public static void cargarEmpresaPersona() {
        Component rootPane = null;
        try {
            ArrayList<Empresa> usuarios = procesos.mostrarEmpresas();
            if (usuarios.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Debe de registrar primero una empresa");
            } else {
                for (Empresa temp : usuarios) {
                    RegPersona.cmbEmpresa.addItem(temp.getNombreE());
                    ;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//THIS METHOD GET THE COMPANY FOR THE EDIT PERSON WINDOW
    public static void cargarEmpresaEditarPersona() {
        Component rootPane = null;
        try {
            ArrayList<Empresa> usuarios = procesos.mostrarEmpresas();
            if (usuarios.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Debe de registrar primero una empresa");
            } else {
                for (Empresa temp : usuarios) {
                    editP.cmbEmpresa.addItem(temp.getNombreE());

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
       public static void cargarCedulasEditarPersona() {
        Component rootPane = null;
        try {
            ArrayList<Persona> usuarios = procesos.mostrarCedulas();
            if (usuarios.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Debe de registrar primero una persona");
            } else {
                for (Persona temp : usuarios) {
                    String cedulas = String.valueOf(temp.getCedula());
                    editP.cmbCedulas.addItem(cedulas);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualizarPersona(String nombre, int salario, int cedula, String puesto, String empresas) {

        Empresa empresa = new Empresa(empresas);

        Persona personas = new Persona(nombre, salario, cedula, puesto, empresa);
        Metodos.editarPersonas(personas);

    }

    public static void actualizarDpto(String nombreDepto, String nombre, String empresas) {

        Empresa empresa = new Empresa(empresas);
        Persona Nombre = new Persona(nombre);

        Departamento departamento = new Departamento(nombreDepto, Nombre, empresa);
        Metodos.editarDpto(departamento);

    }

    
    
    public static void BuscarDpto(){
        try {
            String dep = (String) menu.cmbDeparta.getSelectedItem();
            Empresa infoDpto = new Empresa();
            infoDpto.setNombreE(dep);

            ArrayList<Departamento> dptos = procesos.mostrarDptoEspecificos(infoDpto);
            DefaultTableModel modelo = (DefaultTableModel) menu.tablaDepart.getModel();
            modelo.setRowCount(0);

            for (Departamento temp : dptos) {
                Object[] fila = {temp.getNombreD(),temp.getNombreP()};
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            menu.txtCon.setText("No hay departamentos registrados");
        }
        
        
    }
    
    public static void BuscarEmpresa(){
         try {
            String nombre = (String) menu.cmbEmpresas2.getSelectedItem();
            Empresa infoEmpresa = new Empresa();
            infoEmpresa.setNombreE(nombre);

            ArrayList<Persona> personas = procesos.mostrarPersonaEspecifico(infoEmpresa);
            DefaultTableModel modelo = (DefaultTableModel) menu.tablaPersona.getModel();
            modelo.setRowCount(0);

            for (Persona temp : personas) {
                Object[] fila = {temp.getCedula(),temp.getNombre(),temp.getEmpresas(), temp.getPuesto(),temp.getSalario()};
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            menu.txtCon.setText("No hay personas registradas");
        }
    }
    
    public static void BuscarProyecto(){
           try {
            String dep = (String) menu.cmbEmpresas1.getSelectedItem();
            Empresa infoDpto = new Empresa();
            infoDpto.setNombreE(dep);

            ArrayList<Proyectos> dptos = procesos.mostrarProyec(infoDpto);
            DefaultTableModel modelo = (DefaultTableModel) menu.tablaProyectos.getModel();
            modelo.setRowCount(0);

            for (Proyectos temp : dptos) {
                Object[] fila = {temp.getempresa(),temp.getnombrep()};
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            menu.txtCon.setText("No hay proyectos registrados");
        }
    }
    
    
    //IT´S USED IN THE LISTA PROYECTOS WINDOW
    public static void MostrarListaProyectos() {
               try {
    

            ArrayList<Proyectos> dptos = procesos.mostrarProyect();
            DefaultTableModel modelo = (DefaultTableModel) l.jTable1.getModel();
            modelo.setRowCount(0);

            for (Proyectos temp : dptos) {
                Object[] fila = {temp.getempresa(),temp.getnombrep()};
                modelo.addRow(fila);
            }

        } catch (Exception e) {
            menu.txtCon.setText("No hay proyectos registrados");
        }
    }
    public static void MostrarListaPersonas(){
        
    }
    
    
    
    
    

}
