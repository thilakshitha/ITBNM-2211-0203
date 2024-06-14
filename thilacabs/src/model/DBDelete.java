/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DBDelete {
     Statement stmt;
    
    public void DeleteCar(String car_reg){
        
    String query=String.format("DELETE FROM  car_reg WHERE car_reg='%s'",car_reg);
    stmt =Connector.ConnectDb();
    try{
     stmt.executeUpdate(query);
    }catch(SQLException ex){
        Logger.getLogger(DBDelete.class.getName()).log(Level.SEVERE,null,ex);
        
     
    }
    }
    
}
