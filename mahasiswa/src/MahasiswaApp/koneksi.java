/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MahasiswaApp;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;

public class koneksi{
    private static Connection mysqlkonek;
    
    public static Connection koneksiDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/mahasiswaapp";
            String user = "root";
            String pass = "";
            
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkonek= DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        return mysqlkonek;
    }
}
