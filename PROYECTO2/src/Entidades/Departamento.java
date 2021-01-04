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

    public String nombreD;
    public Persona persona;
    public String nombreP;
    public Empresa empresa;
    public String empresas;

    public Departamento() {
    }

    public Departamento(String nombreD, Persona persona, Empresa empresa) {
        this.nombreD = nombreD;
        this.persona = persona;
        this.empresa = empresa;
    }

    public Departamento(String nombreD, String nombreP) {
        this.nombreD = nombreD;
        this.nombreP = nombreP;
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

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getEmpresas() {
        return empresas;
    }

    public void setEmpresas(String empresas) {
        this.empresas = empresas;
    }

}
