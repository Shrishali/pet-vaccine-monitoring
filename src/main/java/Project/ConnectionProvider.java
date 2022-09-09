/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Vetvaccine",
                "root", "password");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("There were error while connecting to db.");
            return null;
        }
    }
}
