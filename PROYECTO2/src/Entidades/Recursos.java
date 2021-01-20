package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica Quesada
 */
public class Recursos {
    public String nombreRec;
    public int costo;

    public Recursos() {
    }

    
    
    
    public Recursos( int costo,String nombreRec) {
        this.nombreRec = nombreRec;
        this.costo = costo;
    }

    public String getnombreRec() {
        return nombreRec;
    }

    public int getCosto() {
        return costo;
    }

   
    

    
}
