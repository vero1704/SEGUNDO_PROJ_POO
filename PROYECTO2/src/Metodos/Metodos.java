/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Datos.Dato;
import Entidades.Departamento;
import Entidades.Empresa;
import Entidades.Persona;
import Entidades.Proyectos;
import Entidades.Recursos;
import Entidades.Tarea;
import java.util.ArrayList;

/**
 *
 * @author ma210
 */
public class Metodos {
    
    Dato udatos = new Dato();

    public static void guardarEmpresa(Empresa empresas) {

        Dato.insertarEmpresa(empresas);

    }

    public static ArrayList<Empresa> mostrarEmpresas() {
        return Dato.mostrarEmpresa();
    }
public static void guardarTareas(Tarea tareas) {

        Dato.insertarTarea(tareas);

    }

public static void guardarRecursos(Recursos recursos){
    Dato.insertarRecurso(recursos);
}

 public static ArrayList<Tarea> mostrarTareas() {
        return Dato.mostrarTareas();
    }
    public void guardarDepto(Departamento dpto) {
        udatos.insertarDpto(dpto);

    }
    
    public static void guardarProyecto(Proyectos proyecto){
        Dato.insertarProyecto(proyecto);
    }

    public static void guardarPersona(Persona personas) {
        Dato.insertarPersona(personas);
    }

    public ArrayList<Persona> mostrarPersonas() {
        return udatos.mostrarPersonas();
    }

    public ArrayList<Persona> mostrarTodasPersona() {
        return udatos.mostrarTodasPersonas();
    }

    public ArrayList<Departamento> mostrarTodasDepart() {
        return udatos.cargasTodasDpto();
    }

    public ArrayList<Persona> mostrarPersonaEspecifico(Empresa infoEmpresa) {
        return udatos.mostrarIPersonasEspecificos(infoEmpresa);
    }
    
    public ArrayList<Proyectos> mostrarProyec(Empresa infoEmpresa) {
        return udatos.mostrarProyectos(infoEmpresa);
    }

    public ArrayList<Departamento> mostrarDptoEspecificos(Empresa infoEmpresa) {
        return udatos.mostrarDptoEspecificos(infoEmpresa);
    }

    public ArrayList<Persona> mostrarCedulas() {
        return udatos.mostrarCedulas();
    }

    public static void editarPersonas(Persona personas) {
        Dato.editarPersona(personas);
    }

    public ArrayList<Empresa> empresaPersona(Persona personas) {
        return udatos.empresasPersona(personas);
    }

    public ArrayList<Departamento> mostrarDptoEsp(Empresa empresaEsp) {
        return udatos.mostrarDptoEsp(empresaEsp);
    }
    
    public ArrayList<Persona> PersonaEmpresa(Empresa emp) {
        return udatos.PersonaEmpresa(emp);
    }
    
     public static void editarDpto(Departamento dpto) {
        Dato.editarDpto(dpto);
    }
     
     public static void eliminarPersona(int person) {
        Dato.eliminarPersonas(person);
    }
     
     public static void eliminarDptos(String dptos) {
        Dato.eliminarDptos(dptos);
    }
     
     public static void RegistProy(Proyectos proyectos){
         
         
         
         
     }
     
     public static void AgregarTareas(){
         
     }
     
}
