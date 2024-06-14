package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class Connector {
    static Connection conn = null;
    static Statement stmt = null;

    public static Statement ConnectDb() {     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thilacabs?useSSL=true", "root", "");
//            JOptionPane.showMessageDialog(null, "Connection Established");
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return stmt;
    }
}
