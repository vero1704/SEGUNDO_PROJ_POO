package Entidades;


import Entidades.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica Quesada
 */
public class Departamento {
    public String nombreD  ;
    public Persona persona;

    public Departamento() {
    }
    

    public Departamento(String nombreD, Persona persona) {
        this.nombreD = nombreD;
        this.persona = persona;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    
    
    
}
