/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikasir_salu;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author OWNER
 */
public class Koneksi {

    static PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     Connection koneksi=null;
     
      public static Connection koneksiDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kasir_devi","root","");
            return Koneksi;
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }  
}
