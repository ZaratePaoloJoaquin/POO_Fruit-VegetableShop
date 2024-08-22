package proyecto.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.clases.Cliente;

public class clienteDao {
    
    private String mensaje;
    
    public String agregarCliente(Connection con, Cliente cli) {
        PreparedStatement pst = null;
        String sql = "Insert into CLIENTES_E (IDCLIENTE, NOMBRES, APCLIENTE, AMCLIENTE, NUMCELULAR, CORREO) values (?,?,?,?,?,?) ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getId());
            pst.setString(2, cli.getNombres());
            pst.setString(3, cli.getAp());
            pst.setString(4, cli.getAm());
            pst.setString(5, cli.getCelular());
            pst.setString(6, cli.getCorreo());
            mensaje = "Guardado correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente\n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarCliente(Connection con, Cliente cli) {
        PreparedStatement pst = null;
        String sql = "update CLIENTES_E set NOMBRES=?, APCLIENTE=?, AMCLIENTE=?, NUMCELULAR=?, CORREO=? where IDCLIENTE=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getNombres());
            pst.setString(2, cli.getAp());
            pst.setString(3, cli.getAm());
            pst.setString(4, cli.getCelular());
            pst.setString(5, cli.getCorreo());
            pst.setString(6, cli.getId());
            mensaje = "Actualizado correctamente";
            pst.executeUpdate();
            pst.close();

        } catch (SQLException e) {
            mensaje = "No se pudo actualizar correctamente\n " + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarCliente(Connection con, String id) {
        PreparedStatement pst = null;
        String sql = "delete from CLIENTES_E where IDCLIENTE=?";
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

    public void listarCliente(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "CELULAR", "CORREO"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM CLIENTES_E ORDER BY IDCLIENTE";
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

    public void buscarCliente(Connection con, String dato, DefaultTableModel tabla) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT IDCLIENTE, NOMBRES, APCLIENTE, AMCLIENTE, NUMCELULAR, CORREO FROM CLIENTES_E WHERE IDCLIENTE LIKE ? OR NOMBRES LIKE ? OR APCLIENTE LIKE ? OR AMCLIENTE LIKE ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + dato + "%");
            pst.setString(2, "%" + dato + "%");
            pst.setString(3, "%" + dato + "%");
            pst.setString(4, "%" + dato + "%");
            rs = pst.executeQuery();
            tabla.setRowCount(0);

            while (rs.next()) {
                String idCliente = rs.getString("IDCLIENTE");
                String nombres = rs.getString("NOMBRES");
                String ap = rs.getString("APCLIENTE");
                String am = rs.getString("AMCLIENTE");
                String celular = rs.getString("NUMCELULAR");
                String correo = rs.getString("CORREO");
                tabla.addRow(new Object[]{idCliente, nombres, ap, am, celular, correo});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar clientes: " + e.getMessage());
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
