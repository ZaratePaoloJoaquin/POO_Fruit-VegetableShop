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
import proyecto.clases.Gasto;
import proyecto.dao.gastoDao;

public class gastoBo {

    private String mensaje = "";
    private gastoDao gdao = new gastoDao();

    public String agregarGasto(Gasto g) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = gdao.agregarGasto(conn, g);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String modificarGasto(Gasto g) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = gdao.modificarGasto(conn, g);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminarGasto(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = gdao.eliminarGasto(conn, id);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public void listarGastos(JTable tabla) {
        Connection conn = Conexion.getConnection();
        gdao.listarGastos(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void buscarGasto(String dato, DefaultTableModel tabla) {
        Connection conn = Conexion.getConnection();
        gdao.buscarGasto(conn, dato, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
