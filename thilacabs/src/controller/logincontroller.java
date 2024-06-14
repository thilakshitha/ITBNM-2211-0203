/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.Main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DBSearch;

/**
 *
 * @author Administrator
 */
public class logincontroller {
    
    public void userLogin(String username, String password, JFrame frame){
        ResultSet rs;
        String usernameDB ="", passwordDB="";
        if(username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "Empty fields", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            rs = new DBSearch().searchUserByID(username);
            try {
                while(rs.next()){
                    usernameDB = rs.getString("username");
                    passwordDB = rs.getString("password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(logincontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(username.equals(usernameDB) && password.equals(passwordDB)){
                new Main().setVisible(true);
                frame.dispose();
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + username, JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }
    
}
