/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bo;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.Conexion.Conexion;
import proyecto.clases.Usuario;
import proyecto.dao.usuarioDao;


public class usuarioBo {
    private String mensaje = "";
    private usuarioDao udao=new usuarioDao();
    
    public String agregarUsuario(Usuario user) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = udao.agregarUsuario(conn, user);

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
    
    public String modificarUsuario(Usuario user) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = udao.modificarUsuario(conn, user);

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
    
    public String eliminarUsuario(String id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = udao.eliminarUsuario(conn, id);
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
    
    public void listarUsuario(JTable tabla) {
        Connection conn = Conexion.getConnection();
        udao.listarUsuario(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public void buscarUsuario (String dato, DefaultTableModel tabla){
        Connection conn = Conexion.getConnection();
        udao.buscarUsuario(conn, dato, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
