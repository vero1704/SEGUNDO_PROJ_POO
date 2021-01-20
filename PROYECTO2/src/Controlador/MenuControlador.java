/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operations;
import Vista.*;

/**
 *
 * @author Veronica Quesada
 */
public class MenuControlador {

    public static Menu ventanaMenu = new Menu();

    public static void mostrar() {
        ventanaMenu.setVisible(true);

    }

    public static void ocultar() {
        ventanaMenu.setVisible(false);
    }

    public static void RegistrarPerosn() {
        ocultar();
        RegistrarPersonaControlador.mostrar();
        Operations.cargarEmpresaPersona();

    }

    public static void registrarProy() {
        ocultar();
        RegistrarProyectoControlador.mostrar();

    }

    public static void registrardep() {
        ocultar();
        RegistrarDepControlador.mostrarDpto();
    }

    public static void editarPer() {
        ocultar();
        EditPersonaControlador.mostrarEditar();
        Operations.cargarCedulasEditarPersona();

    }

    public static void editarDpto() {
        ocultar();
        EditDptoControlador.mostrar();
    }

   

    //BOTONES DE SALIR 
    public static void SalirPer() {
        ocultar();
        inicioControlador.volverInicio();
    }

    public static void SalirDpto() {
        ocultar();
        inicioControlador.volverInicio();

    }

    public static void SalirProy() {
        ocultar();
        inicioControlador.volverInicio();
    }

    public static void volverMenu() {

        mostrar();
        Operations.cargarEmpresamenu();
    }
    
    
    public static void botonBuscarDpto(){
        Operations.BuscarDpto();
    }
    
    
     public static void botonBuscarEmpresa(){
         Operations.BuscarEmpresa();
     }
     
      public static void botonBuscarProyecto(){
        Operations.BuscarProyecto();
      }
}
