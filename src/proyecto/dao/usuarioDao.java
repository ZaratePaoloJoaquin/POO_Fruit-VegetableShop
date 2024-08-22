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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.clases.Usuario;

public class usuarioDao {

    private String mensaje;

    public String agregarUsuario(Connection con, Usuario user) {
        PreparedStatement pst = null;
        String sql = "Insert into USUARIOS_E (IDUSUARIO, NOMBRES_USUARIO, AP_USUARIO, AM_USUARIO, ROL, CONTRA_USUARIO) values (?,?,?,?,?,?) ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getId());
            pst.setString(2, user.getNombres());
            pst.setString(3, user.getAp());
            pst.setString(4, user.getAm());
            pst.setString(5, user.getRol());
            pst.setString(6, user.getContra());
            mensaje = "Guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente\n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarUsuario(Connection con, Usuario user) {
        PreparedStatement pst = null;
        String sql = "UPDATE USUARIOS_E SET NOMBRES_USUARIO=?, AP_USUARIO=?, AM_USUARIO=?, ROL=?, CONTRA_USUARIO=? "
                + "WHERE IDUSUARIO=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNombres());
            pst.setString(2, user.getAp());
            pst.setString(3, user.getAm());
            pst.setString(4, user.getRol());
            pst.setString(5, user.getContra());
            pst.setString(6, user.getId());
            mensaje = "Actualizado correctamente";
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo actualizar correctamente\n " + e.getMessage();
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

    public String eliminarUsuario(Connection con, String id) {
        PreparedStatement pst = null;
        String sql = "delete from USUARIOS_E where IDUSUARIO=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);

            mensaje = "Borrado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo borrar correctamente\n " + e.getMessage();
        }
        return mensaje;
    }

    public void listarUsuario(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "ROL", "CONTRASEÑA"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM USUARIOS_E ORDER BY IDUSUARIO";
        String[] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla");
        }
    }

    public void buscarUsuario(Connection con, String dato, DefaultTableModel tabla) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT IDUSUARIO, NOMBRES_USUARIO, AP_USUARIO, AM_USUARIO, ROL, CONTRA_USUARIO FROM USUARIOS_E WHERE IDUSUARIO LIKE ? OR NOMBRES_USUARIO LIKE ? OR AP_USUARIO LIKE ? OR AM_USUARIO LIKE ? OR ROL LIKE ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + dato + "%");
            pst.setString(2, "%" + dato + "%");
            pst.setString(3, "%" + dato + "%");
            pst.setString(4, "%" + dato + "%");
            pst.setString(5, "%" + dato + "%");
            rs = pst.executeQuery();
            tabla.setRowCount(0);

            while (rs.next()) {
                String idUsuario = rs.getString("IDUSUARIO");
                String nombres = rs.getString("NOMBRES_USUARIO");
                String ap = rs.getString("AP_USUARIO");
                String am = rs.getString("AM_USUARIO");
                String rol = rs.getString("ROL");
                String contra = rs.getString("CONTRA_USUARIO");
                tabla.addRow(new Object[]{idUsuario, nombres, ap, am, rol, contra});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar usuarios: " + e.getMessage());
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
