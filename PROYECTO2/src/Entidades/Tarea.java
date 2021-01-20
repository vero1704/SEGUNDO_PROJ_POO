/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Excepciones.ExcepcionesTareas;

/**
 *
 * @author Veronica Quesada
 */
public class Tarea {

    public int Id;
    public String descripcion;
    public String encargados;
    public int cantper;
    public int semanas;
    public int horareq;
    public int horasdia;

    public Tarea(int Id, String descripcion, String encargados, int cantper, int semanas, int horareq, int horasdia) {
        this.Id = Id;
        this.descripcion = descripcion;
        this.encargados = encargados;
        this.cantper = cantper;
        this.semanas = semanas;
        this.horareq = horareq;
        this.horasdia = horasdia;
    }

    public Tarea() {
    }

    public int getId() {
        return Id;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws ExcepcionesTareas {
        if (descripcion.equals("")) {
            throw new ExcepcionesTareas("Los datos deben de llenarse");
        } else {
            this.descripcion = descripcion;
        }

    }

    public String getencargados() {
        return encargados;
    }

    public int getcantper() {
        return cantper;
    }

    public int getsemanas() {
        return semanas;
    }

    public int gethorareq() {
        return horareq;
    }

    public int gethorasdia() {
        return horasdia;
    }

}
