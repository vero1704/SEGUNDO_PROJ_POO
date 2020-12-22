/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexion.Conexion;
import Entidades.Departamento;
import Entidades.Empresa;
import Entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ma210
 */
public class Dato {
    
    public void insertarEmpresa(Empresa empresas) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "INSERT INTO empresa(\n" +
"	 nombreempresa, telefono, ubicacion)\n" +
"	VALUES ( ?, ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, empresas.getNombreE());
            p.setInt(2, empresas.getTelefono());
            p.setString(3, empresas.getUbicacion());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha registrado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }
    
     public ArrayList<Empresa> mostrarEmpresa() {

        ArrayList<Empresa> empresas = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombreempresa from empresa";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Empresa customer = new Empresa();
                customer.setNombreE(rs.getString("nombreempresa"));
                empresas.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return empresas;
    }
     
     public void insertarDpto(Departamento dpto) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "INSERT INTO departamento(\n" +
"	 nombredpto, encargado)\n" +
"	VALUES ( ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1,dpto.getNombreD());
            p.setString(2, dpto.persona.getNombre());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha registrado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }
     
       public void insertarPersona(Persona personas) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "INSERT INTO public.persona(\n" +
"	nombrepersona, puesto, empresa, salario)\n" +
"	VALUES ( ?, ?, ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1,personas.getNombre());
            p.setString(2, personas.getPuesto());
            p.setString(3, personas.empresa.getNombreE());
            p.setInt(4, personas.getSalario());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha registrado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }
    
       
         public ArrayList<Persona> mostrarPersonas() {

        ArrayList<Persona> personas = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombrepersona from persona";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Persona customer = new Persona();
                customer.setNombre(rs.getString("nombrepersona"));
                personas.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return personas;
    }
         
         public ArrayList<Persona> mostrarTodasPersonas() {
        ArrayList<Persona> informes = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombrepersona,empresa,puesto,salario from persona";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Persona customer = new Persona();
                customer.setNombre(rs.getString("nombrepersona"));
                customer.empresa.setNombreE(rs.getString("empresa"));
                customer.setPuesto(rs.getString("puesto"));
                customer.setSalario(rs.getInt("salario"));
                informes.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return informes;
    }
         
          public ArrayList<Departamento> cargasTodasDpto() {
        ArrayList<Departamento> informes = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombredpto,encargado from departamento";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Departamento customer = new Departamento();
                customer.setNombreD(rs.getString("nombredpto"));
                customer.persona.setNombre(rs.getString("encargado"));
                informes.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return informes;
    }
}