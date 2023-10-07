/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author suare
 */
public class Conexion {

    //CONEXION LOCAL
    public static Connection conectar() {
        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bovicontrol_bd", "root", "");
            return cn;
        } catch (SQLException e) {

            System.err.println("Error en la conexion local " + e);
            JOptionPane.showMessageDialog(null, "Verifique su conexion a internet");
        }
        return (null);
    }
}
