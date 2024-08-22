/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bo;

import proyecto.dao.clienteDao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.Conexion.Conexion;
import proyecto.clases.Cliente;

public class clienteBo {

    private String mensaje = "";
    private clienteDao cdao = new clienteDao();

    public String agregarCliente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.agregarCliente(conn, cli);

        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();
            }
        }
        return mensaje;
    }

    public String modificarCliente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.modificarCliente(conn, cli);

        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminarCliente(String id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.eliminarCliente(conn, id);
        } catch (Exception e) {
            mensaje = mensaje + "" + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + "" + e.getMessage();
            }
        }
        return mensaje;
    }

    public void listarCliente(JTable tabla) {
        Connection conn = Conexion.getConnection();
        cdao.listarCliente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void buscarCliente (String dato, DefaultTableModel tabla){
        Connection conn = Conexion.getConnection();
        cdao.buscarCliente(conn, dato, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
