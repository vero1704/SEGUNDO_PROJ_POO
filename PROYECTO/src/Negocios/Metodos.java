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
        
        Dato udatos = new Dato();
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

}