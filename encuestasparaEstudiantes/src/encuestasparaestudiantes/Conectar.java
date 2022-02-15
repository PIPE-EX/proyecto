/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuestasparaestudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author viivi
 */
public class Conectar {
    
    Connection conectar=null;
    public Connection conexion(){
        
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/encuestas","root","");
        System.out.println("Conexion aceptada...");
        
    }catch (ClassNotFoundException | SQLException e) {
        System.out.print("Mensaje de errror"+e);
        JOptionPane.showMessageDialog(null,"No se pudo conectar");
    }
    return conectar;
    
    }

    
    
     
    
}
