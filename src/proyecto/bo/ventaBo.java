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
import proyecto.clases.Venta;
import proyecto.dao.ventaDao;

public class ventaBo {
    
   private String mensaje = "";
    private ventaDao vdao= new ventaDao();

    public String agregarVenta(Venta v) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = vdao.agregarVenta(conn, v);
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

    public String eliminarVenta(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = vdao.eliminarVenta(conn, id);
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

    public void listarVentas(JTable tabla) {
        Connection conn = Conexion.getConnection();
        vdao.listarVenta(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void buscarVenta(String dato, DefaultTableModel tabla) {
        Connection conn = Conexion.getConnection();
        vdao.buscarVenta(conn, dato, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
}