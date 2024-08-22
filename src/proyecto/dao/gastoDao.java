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
import proyecto.clases.Gasto;

public class gastoDao {

    private String mensaje;

    public String agregarGasto(Connection con, Gasto g) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO GASTOS_E (FECHA, RAZON, DESCRIPCION, MONTO) values (?,?,?,?) ";
        try {
            pst = con.prepareStatement(sql);
            LocalDate fechaActual = LocalDate.now();
            String fechaformateada = fechaActual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            pst.setString(1, fechaformateada);
            pst.setString(2, g.getRazon());
            pst.setString(3, g.getDescripcion());
            pst.setString(4, g.getMonto());
            pst.executeUpdate();
            mensaje = "Guardado correctamente";
            
        } catch (SQLException e) {
            e.printStackTrace();
            mensaje = "Error al intentar guardar el gasto: \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarGasto(Connection con, Gasto g) {
        PreparedStatement pst = null;
        String sql = "UPDATE GASTOS_E SET RAZON=?, DESCRIPCION=?, MONTO=? WHERE IDGASTOS=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, g.getRazon());
            pst.setString(2, g.getDescripcion());
            pst.setString(3, g.getMonto());
            pst.setInt(4, g.getId());
            mensaje = "Actualizado correctamente";
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo actualizar correctamente\n" + e.getMessage();
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

    public String eliminarGasto(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM GASTOS_E WHERE IDGASTOS=?";
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

    public void listarGastos(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID", "FECHA", "RAZÓN", "DESCRIPCIÓN", "MONTO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM GASTOS_E ORDER BY IDGASTOS";
        String[] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;

        DateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("IDGASTOS");
                filas[0] = String.valueOf(id);
                java.sql.Date fecha = rs.getDate("FECHA");
                filas[1] = fechaFormateada.format(fecha);
                filas[2] = rs.getString("RAZON");
                filas[3] = rs.getString("DESCRIPCION");
                filas[4] = rs.getString("MONTO");
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
            }
        }
    }

    public void buscarGasto(Connection con, String dato, DefaultTableModel tabla) {
        String sql = "SELECT IDGASTOS, FECHA, RAZON, DESCRIPCION, MONTO FROM GASTOS_E WHERE IDGASTOS LIKE ? "
                + "OR RAZON LIKE ? OR DESCRIPCION LIKE ? OR MONTO LIKE ?";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, "%" + dato + "%");
            pst.setString(2, "%" + dato + "%");
            pst.setString(3, "%" + dato + "%");
            pst.setString(4, "%" + dato + "%");

            try (ResultSet rs = pst.executeQuery()) {
                tabla.setRowCount(0);

                while (rs.next()) {
                    String id = rs.getString("IDGASTOS");
                    LocalDate fecha = rs.getDate("FECHA").toLocalDate();
                    String razon = rs.getString("RAZON");
                    String descripcion = rs.getString("DESCRIPCION");
                    String monto = rs.getString("MONTO");
                    tabla.addRow(new Object[]{id, fecha, razon, descripcion, monto});
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al procesar resultados de la consulta: " + e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta: " + e.getMessage());
        }
    }
}
