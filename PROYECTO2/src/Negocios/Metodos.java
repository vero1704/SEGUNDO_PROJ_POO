/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.Dato;
import Entidades.Departamento;
import Entidades.Empresa;
import Entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author ma210
 */
public class Metodos {
    
    Dato udatos = new Dato();

    public void guardarEmpresa(Empresa empresas) {

        udatos.insertarEmpresa(empresas);

    }

    public ArrayList<Empresa> mostrarEmpresas() {
        return udatos.mostrarEmpresa();
    }

    public void guardarDepto(Departamento dpto) {
        udatos.insertarDpto(dpto);

    }

    public void guardarPersona(Persona personas) {
        udatos.insertarPersona(personas);
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

    public ArrayList<Departamento> mostrarDptoEspecificos(Empresa infoEmpresa) {
        return udatos.mostrarDptoEspecificos(infoEmpresa);
    }

    public ArrayList<Persona> mostrarCedulas() {
        return udatos.mostrarCedulas();
    }

    public void editarPersonas(Persona personas) {
        udatos.editarPersona(personas);
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
    
     public void editarDpto(Departamento dpto) {
        udatos.editarDpto(dpto);
    }
     
     public void eliminarPersona(int person) {
        udatos.eliminarPersonas(person);
    }
     
     public void eliminarDptos(String dptos) {
        udatos.eliminarDptos(dptos);
    }
}
