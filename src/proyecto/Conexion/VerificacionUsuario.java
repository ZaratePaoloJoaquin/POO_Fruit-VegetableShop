/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerificacionUsuario {
   public boolean verificacionUsuario(Connection con, String rol, String contra) {
    PreparedStatement pst = null;
    ResultSet rs = null;
    String sql = "SELECT CONTRA_USUARIO FROM USUARIOS_E WHERE ROL = ?";
    try {
        pst = con.prepareStatement(sql);
        pst.setString(1, rol);
        rs = pst.executeQuery();
        if (rs.next()) {
            String c = rs.getString("CONTRA_USUARIO");
            return c.equals(contra);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return false;
}
}
