/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.clases.Venta;

public class ventaDao {

    String mensaje;

    public String agregarVenta(Connection con, Venta venta) throws SQLException {
        PreparedStatement pst = null;
        String mensaje;
        String sql = "INSERT INTO VENTA_E (FECHA,PRODUCTO, PRECIO, MEDIDA, DESCUENTO, CANTIDAD, SUBTOTAL) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);

            // Obtener fecha y hora actuales formateadas
            LocalDate fechaActual = LocalDate.now();
            String fechaFormateada = fechaActual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            pst.setString(1, fechaFormateada);     // Fecha
            pst.setString(2, venta.getProducto()); // Producto
            pst.setDouble(3, venta.getPrecio());   // Precio
            pst.setString(4, venta.getMedida());   // Medida
            pst.setDouble(5, venta.getDescuento()); // Descuento
            pst.setDouble(6, venta.getCantidad());  // Cantidad
            pst.setDouble(7, venta.getSubtotal());  // Subtotal

            mensaje = "Guardado correctamente";
            pst.execute();
        } catch (SQLException e) {
            mensaje = "Error al insertar la venta: " + e.getMessage();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }

        return mensaje;
    }

    public String eliminarVenta(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM VENTA_E WHERE IDVENTA=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "Borrado correctamente";
            pst.executeUpdate();
        } catch (SQLException e) {
            mensaje = "No se pudo borrar correctamente\n" + e.getMessage();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                mensaje = "Error al cerrar PreparedStatement: " + e.getMessage();
            }
        }
        return mensaje;
    }

    public void listarVenta(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID", "FECHA", "PRODUCTO", "PRECIO", "MEDIDA", "DESCUENTO", "CANTIDAD", "SUBTOTAL",};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT IDVENTA, FECHA, PRODUCTO, PRECIO, MEDIDA, DESCUENTO, CANTIDAD, SUBTOTAL FROM VENTA_E ORDER BY IDVENTA";

        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            DateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat horaFormateada = new SimpleDateFormat("HH:mm:ss");

            while (rs.next()) {
                int id = rs.getInt("IDVENTA");
                String fecha = fechaFormateada.format(rs.getDate("FECHA"));
                String producto = rs.getString("PRODUCTO");
                double precio = rs.getDouble("PRECIO");
                String medida = rs.getString("MEDIDA");
                double descuento = rs.getDouble("DESCUENTO");
                double cantidad = rs.getDouble("CANTIDAD");
                double subtotal = rs.getDouble("SUBTOTAL");
                model.addRow(new Object[]{id, fecha, producto, precio, medida, descuento, cantidad, subtotal});
            }

            tabla.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos de la tabla: " + e.getMessage());
        }
    }

    public void buscarVenta(Connection con, String dato, DefaultTableModel tabla) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT IDVENTA, FECHA, PRODUCTO, PRECIO, MEDIDA, DESCUENTO, CANTIDAD, SUBTOTAL "
                 + "FROM VENTA_E "
                 + "WHERE IDVENTA LIKE ? OR FECHA LIKE ? OR PRODUCTO LIKE ? OR PRECIO LIKE ? OR MEDIDA LIKE ? "
                 + "OR DESCUENTO LIKE ? OR CANTIDAD LIKE ? OR SUBTOTAL LIKE ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + dato + "%");
            pst.setString(2, "%" + dato + "%");
            pst.setString(3, "%" + dato + "%");
            pst.setString(4, "%" + dato + "%");
            pst.setString(5, "%" + dato + "%");
            pst.setString(6, "%" + dato + "%");
            pst.setString(7, "%" + dato + "%");
            pst.setString(8, "%" + dato + "%");
            rs = pst.executeQuery();
            tabla.setRowCount(0);

            while (rs.next()) {
                int idVenta = rs.getInt("IDVENTA");
                LocalDate fecha = rs.getDate("FECHA").toLocalDate();
                String producto = rs.getString("PRODUCTO");
                double precio = rs.getDouble("PRECIO");
                String medida = rs.getString("MEDIDA");
                double descuento = rs.getDouble("DESCUENTO");
                double cantidad = rs.getDouble("CANTIDAD");
                double subtotal = rs.getDouble("SUBTOTAL");
                tabla.addRow(new Object[]{idVenta, fecha, producto, precio, medida, descuento, cantidad, subtotal});
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
}