package Entidades;


import Entidades.Proyectos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica Quesada
 */
public class Persona {
    public String nombre;
    public int salario ;
    public String puesto;
    public Empresa empresa;
    
    Departamento departamento;
    Proyectos proyectosAsig;
    Actividades tareasAsig;

    public Persona(String nombre, int salario, String puesto, Empresa empresa) {
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
        this.empresa = empresa;
    }

    public Persona() {
    }
       

    public Persona(String nombre) {
        this.nombre = nombre;
    }


     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    
        
    
}
