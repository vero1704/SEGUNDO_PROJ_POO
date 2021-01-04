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
            String sql = "INSERT INTO empresa(\n"
                    + "	 nombreempresa, telefono, ubicacion)\n"
                    + "	VALUES ( ?, ?, ?);";

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
            String sql = "INSERT INTO departamento(\n"
                    + "	 nombredpto, encargado,empresa)\n"
                    + "	VALUES ( ?, ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, dpto.getNombreD());
            p.setString(2, dpto.persona.getNombre());
            p.setString(3, dpto.empresa.getNombreE());

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
            String sql = "INSERT INTO public.persona(\n"
                    + "	nombrepersona, puesto, empresa, salario,ced)\n"
                    + "	VALUES ( ?, ?, ?, ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, personas.getNombre());
            p.setString(2, personas.getPuesto());
            p.setString(3, personas.empresa.getNombreE());
            p.setInt(4, personas.getSalario());
            p.setInt(5, personas.getCedula());

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
            String sql = "select ced,nombrepersona,empresa,puesto,salario from persona";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Persona customer = new Persona();
                customer.setCedula(rs.getInt("ced"));
                customer.setNombre(rs.getString("nombrepersona"));
                customer.setEmpresas(rs.getString("empresa"));
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

            String sql = "select nombredpto,encargado,empresa from departamento";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Departamento customer = new Departamento();
                customer.setNombreD(rs.getString("nombredpto"));
                customer.setNombreP(rs.getString("encargado"));
                customer.setEmpresas(rs.getString("empresa"));
                informes.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return informes;
    }

    public ArrayList<Persona> mostrarIPersonasEspecificos(Empresa infoEmpresa) {

        ArrayList<Persona> personas = new ArrayList<>();
        try (Connection connection = Conexion.getConexion()) {
            String sql = "select ced,nombrepersona,puesto,empresa,salario from persona where empresa  = ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, infoEmpresa.getNombreE());

            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Persona customer = new Persona();
                customer.setCedula(rs.getInt("ced"));
                customer.setNombre(rs.getString("nombrepersona"));
                customer.setPuesto(rs.getString("puesto"));
                customer.setEmpresas(rs.getString("empresa"));
                customer.setSalario(rs.getInt("salario"));
                personas.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }

        return personas;
    }

    public ArrayList<Departamento> mostrarDptoEspecificos(Empresa infoEmpresa) {

        ArrayList<Departamento> dptos = new ArrayList<>();
        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombredpto,encargado,empresa from departamento where empresa  = ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, infoEmpresa.getNombreE());

            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Departamento customer = new Departamento();
                customer.setNombreD(rs.getString("nombredpto"));
                customer.setNombreP(rs.getString("encargado"));
                customer.setEmpresas(rs.getString("empresa"));
                dptos.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }

        return dptos;
    }

    public ArrayList<Persona> mostrarCedulas() {

        ArrayList<Persona> ids = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select ced from persona";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Persona customer = new Persona();
                customer.setCedula(rs.getInt("ced"));
                ids.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return ids;
    }

    public void editarPersona(Persona personas) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "UPDATE persona\n"
                    + "	SET nombrepersona=?, puesto=?, empresa=?, salario=?\n"
                    + "	WHERE ced=?;";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, personas.getNombre());
            p.setString(2, personas.getPuesto());
            p.setString(3, personas.empresa.getNombreE());
            p.setInt(4, personas.getSalario());
            p.setInt(5, personas.getCedula());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, modificacion fallida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }

    public ArrayList<Empresa> empresasPersona(Persona personas) {

        ArrayList<Empresa> empresas = new ArrayList<>();
        try (Connection connection = Conexion.getConexion()) {
            String sql = "select empresa from persona where nombrepersona = ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, personas.getNombre());

            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Empresa customer = new Empresa();
                customer.setNombreE(rs.getString("empresa"));
                empresas.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }

        return empresas;
    }

    public ArrayList<Departamento> mostrarDptoEsp(Empresa emp) {

        ArrayList<Departamento> dpto = new ArrayList<>();
        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombredpto from departamento where empresa = ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, emp.getNombreE());

            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Departamento customer = new Departamento();
                customer.setNombreD(rs.getString("nombredpto"));
                dpto.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }

        return dpto;
    }
    
    public ArrayList<Persona> PersonaEmpresa(Empresa emp) {

        ArrayList<Persona> person = new ArrayList<>();
        try (Connection connection = Conexion.getConexion()) {
            String sql = "select nombrepersona from persona where empresa = ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, emp.getNombreE());

            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                Persona customer = new Persona();
                customer.setNombre(rs.getString("nombrepersona"));
                person.add(customer);
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo establecer la conexión");
        }

        return person;
    }
    
    public void editarDpto(Departamento dpto) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "UPDATE departamento\n" +
"	SET  encargado=? WHERE nombredpto=?;";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, dpto.getNombreD());
            p.setString(2, dpto.getNombreP());


            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, modificacion fallida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }
    
     public void eliminarPersonas(int person) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "delete from persona where ced =  ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1, person);

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado, correctamente", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, eliminado fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }

    }
    
    public void eliminarDptos(String dptos) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "delete from departamento where nombredpto =  ? ";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, dptos);

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado, correctamente", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, eliminado fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }

    }

}
