/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.dao;

import proyecto.clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class productoDao {

    private String mensaje;

    public String agregarProducto(Connection con, Producto produc) {
        PreparedStatement pst = null;
        String sql = "Insert into PRODUCTOS_EE (IDPRODUC, CATEGORIA, DESCRIPCION, PRECIO, DESCUENTO, MEDIDA, STOCK) values (?,?,?,?,?,?,?) ";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, produc.getId());
            pst.setString(2, produc.getCategoria());
            pst.setString(3, produc.getDescripcion());
            pst.setDouble(4, produc.getPrecio());
            pst.setDouble(5, produc.getDescuento());
            pst.setString(6, produc.getMedida());
            pst.setDouble(7, produc.getStock());
            mensaje = "Guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente\n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarProducto(Connection con, Producto produc) {
        PreparedStatement pst = null;
        String sql = "UPDATE PRODUCTOS_EE SET CATEGORIA=?, DESCRIPCION=?, PRECIO=?, DESCUENTO=?,MEDIDA=?, STOCK=? WHERE IDPRODUC=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, produc.getCategoria());
            pst.setString(2, produc.getDescripcion());
            pst.setDouble(3, produc.getPrecio());
            pst.setDouble(4, produc.getDescuento());
            pst.setString(5, produc.getMedida());
            pst.setDouble(6, produc.getStock());
            pst.setInt(7, produc.getId());
            mensaje = "Actualizado correctamente";
            pst.executeUpdate();
            pst.close();

        } catch (SQLException e) {
            mensaje = "No se pudo actualizar correctamente\n " + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarProducto(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "delete from PRODUCTOS_EE where IDPRODUC=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            mensaje = "Borrado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo borrar correctamente\n " + e.getMessage();
        }
        return mensaje;
    }

    public void listarProducto(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID", "CATEGORÍA", "DESCRIPCIÓN", "PRECIO", "DESCUENTO", "MEDIDA", "STOCK"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM PRODUCTOS_EE ORDER BY IDPRODUC";
        String[] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla");
        }
    }

    public void buscarProducto(Connection con, String dato, DefaultTableModel tabla) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT IDPRODUC, CATEGORIA, DESCRIPCION, PRECIO, DESCUENTO, MEDIDA, STOCK FROM PRODUCTOS_EE WHERE IDPRODUC LIKE ? OR DESCRIPCION LIKE ? OR CATEGORIA LIKE ? OR PRECIO LIKE ? OR DESCUENTO LIKE ? OR MEDIDA LIKE ? OR STOCK LIKE ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + dato + "%");
            pst.setString(2, "%" + dato + "%");
            pst.setString(3, "%" + dato + "%");
            pst.setString(4, "%" + dato + "%");
            pst.setString(5, "%" + dato + "%");
            pst.setString(6, "%" + dato + "%");
            pst.setString(7, "%" + dato + "%");
            rs = pst.executeQuery();
            tabla.setRowCount(0);

            while (rs.next()) {
                int idProducto = rs.getInt("IDPRODUC");
                String descripcion = rs.getString("DESCRIPCION");
                String categoria = rs.getString("CATEGORIA");
                double precio = rs.getDouble("PRECIO");
                double descuento = rs.getDouble("DESCUENTO");
                String medida = rs.getString("MEDIDA");
                double stock = rs.getDouble("STOCK");
                tabla.addRow(new Object[]{idProducto, descripcion, categoria, precio, descuento, medida, stock});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar productos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
            }
        }
    }

    public Producto buscarProductoPorCodigo(Connection con, int codigo) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Producto producto = null;

        try {
            // Validar la conexión
            if (con == null) {
                throw new SQLException("La conexión no está inicializada");
            }

            String sql = "SELECT DESCRIPCION, PRECIO, MEDIDA, DESCUENTO FROM PRODUCTOS_EE WHERE IDPRODUC = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, codigo);

            rs = pst.executeQuery();
            if (rs.next()) {
                String descripcion = rs.getString("DESCRIPCION");
                double precio = rs.getDouble("PRECIO");
                String medida = rs.getString("MEDIDA");
                double descuento = rs.getDouble("DESCUENTO");

                producto = new Producto(codigo, descripcion, precio, descuento, medida);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar producto: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
            }
        }

        return producto;
    }

}
