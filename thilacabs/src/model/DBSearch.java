/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DBSearch {
    
    Statement stmt;
    
    public ResultSet searchUserByID(String username){
        ResultSet rs = null;
        String query="select * from login where username='" + username + "'";
        try {
           stmt = Connector.ConnectDb();
           rs = stmt.executeQuery(query);
        }catch (HeadlessException | SQLException e) {
            //            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Username or Password incorrect");}
        return rs;
    }
}
    