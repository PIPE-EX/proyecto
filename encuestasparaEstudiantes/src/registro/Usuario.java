/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;
import com.sun.java.util.jar.pack.ConstantPool.Index;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author viivi
 */
public class Usuario {
    
public static void main(String[] args) {
        new Index().setVisible(true);
    }

    public boolean registrarEncuestados(int id, String nombres, String apellidos, String fechanacimiento, String ciudad, String grado, String escuela)
    {
        String sql = "INSERT INTO encuestados (id,nombres,apellidos,fechanacimiento,ciudad,grado,escuela) VALUES (?,?,?,?,?,?,?)";

        Connection conectar;
        PreparedStatement pst;

        try 
        {
            conectar = Conexion.getConnection();

            pst = conectar.prepareStatement(sql);

            pst.setInt(1, id);

            pst.setString(2, nombres);

            pst.setString(3, apellidos);
            
            pst.setString(4, fechanacimiento);
            
            pst.setString(5, ciudad);
            
            pst.setString(6, grado);
            
             pst.setString(7, escuela);
            

            int i = pst.executeUpdate();

            if (i != 0) {
                JOptionPane.showMessageDialog(null, "Los datos se han guardado satisfactoriamente");

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error en la transaccion");

                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

            return false;
        }
    }

    private static class Conexion {

        private static Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Conexion() {
        }
    }

}

