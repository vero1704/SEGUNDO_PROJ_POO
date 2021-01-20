package Entidades;


import Entidades.Proyectos;
import Excepciones.ExcepcionesPersona;

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
    public int salario;
    public int cedula;
    public String puesto;
    public Empresa empresa;
    public String empresas;

    Departamento departamento;
    Proyectos proyectosAsig;
    Tarea tareasAsig;

    public Persona(String nombre, int salario, int cedula, String puesto, Empresa empresa) {
        this.nombre = nombre;
        this.salario = salario;
        this.cedula = cedula;
        this.puesto = puesto;
        this.empresa = empresa;
    }

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpresas(String empresas) throws ExcepcionesPersona {

        if (empresas.equals("")) {
            throw new ExcepcionesPersona("El dato debe de llenarse");

        } else {
            this.empresas = empresas;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionesPersona {
        
        if (nombre.equals("")) {
            throw new ExcepcionesPersona("El dato debe de llenarse");

        } else {
            this.nombre = nombre;
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) throws ExcepcionesPersona {

        if (salario >= 0) {
            throw new ExcepcionesPersona("Su salario debe ser mayor que 0");
        } else {
            this.salario = salario;
        }

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) throws ExcepcionesPersona {

        if (puesto.equals("")) {
            throw new ExcepcionesPersona("El dato debe de llenarse");

        } else {
            this.puesto = puesto;
        }
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getEmpresas() {
        return empresas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) throws ExcepcionesPersona {

        if (cedula >= 0) {
            throw new ExcepcionesPersona("Su cedula debe ser mayor que 0");
        } else {
            this.cedula = cedula;
        }

    }

}
