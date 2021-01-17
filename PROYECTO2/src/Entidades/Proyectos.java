package Entidades;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica Quesada
 */
public class Proyectos {
    int Id;
   String empresa;
   String nombreP;
   String encargadop;
   String Tareas;
   String encarTarea;
   String fechainicio;
   
    Departamento departamento , encargado;
    public ArrayList ListaP; 
    String estado;
    Boolean compartido;
    public ArrayList Tarea; 

    public Proyectos(int Id, String empresa, String nombreP, String encargadop, String Tareas, String encarTarea,String fechainicio) {
        this.Id = Id;
        this.empresa = empresa;
        this.nombreP = nombreP;
        this.encargadop = encargadop;
        this.Tareas = Tareas;
        this.encarTarea = encarTarea;
        this.fechainicio = fechainicio;
        
    }

    public int getId() {
        return Id;
    }

    public String getempresa() {
        return empresa;
    }

    public String getnombrep() {
        return nombreP;
    }

    public String getencargadop() {
        return encargadop;
    }

    public String gettareas() {
        return Tareas;
    }

    public String getEncarTarea() {
        return encarTarea;
    }

    public String getfechainicio() {
        return fechainicio;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Departamento getEncargado() {
        return encargado;
    }

    public ArrayList getListaP() {
        return ListaP;
    }

    public String getEstado() {
        return estado;
    }

    public Boolean getCompartido() {
        return compartido;
    }

    public ArrayList getTarea() {
        return Tarea;
    }

    

    


   
    
}
