package registro;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author viivi
 */
public class Conexion {

    public static void main(Strin[] arg) throws ClassNotFoundException, SQLException {

        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/programacionii";
        Connection con;
        Statement stmt;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = (Connection) DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO encuestados VALUES(null, 'Jhon doe','jdoe@mail.com','12345')");
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    


