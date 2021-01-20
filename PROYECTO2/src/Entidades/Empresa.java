package Entidades;

import Excepciones.ExcepcionesEmpresa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica Quesada
 */
public class Empresa {

     String nombreE;
    int telefono;
    String ubicacion;

    public Empresa() {
    }

    public Empresa(String nombreE) {
        this.nombreE = nombreE;
    }

    public Empresa(String nombreE, int telefono, String ubicacion) {
        this.nombreE = nombreE;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) throws ExcepcionesEmpresa {
        if (nombreE.equals("")) {
            throw new ExcepcionesEmpresa("Los datos deben de llenarse");
        } else {
            this.nombreE = nombreE;
        }

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) throws ExcepcionesEmpresa {
        if (telefono >= 0) {
            throw new ExcepcionesEmpresa("Su telefono debe ser mayor que 0");
        } else {
            this.telefono = telefono;
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) throws ExcepcionesEmpresa {
        if (ubicacion.equals("")) {
            throw new ExcepcionesEmpresa("Los datos deben de llenarse");
        } else {
            this.ubicacion = ubicacion;
        }

    }
    }