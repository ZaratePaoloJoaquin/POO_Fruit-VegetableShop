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
import proyecto.clases.Producto;
import proyecto.dao.productoDao;

public class productoBo {

    private String mensaje = "";
    private productoDao pdao = new productoDao();

    public String agregarProducto(Producto produc) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pdao.agregarProducto(conn, produc);

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

    public String modificarProducto(Producto produc) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pdao.modificarProducto(conn, produc);

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

    public String eliminarProducto(int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pdao.eliminarProducto(conn, id);
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

    public void listarProducto(JTable tabla) {
        Connection conn = Conexion.getConnection();
        pdao.listarProducto(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void buscarProducto(String dato, DefaultTableModel tabla) {
        Connection conn = Conexion.getConnection();
        pdao.buscarProducto(conn, dato, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public Producto buscarIdProducto(int id) {
        Connection conn = null;
        Producto producto = null;

        conn = Conexion.getConnection();
        producto = pdao.buscarProductoPorCodigo(conn, id);
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexión: " + ex.getMessage());
        }

        return producto;
    }
}
