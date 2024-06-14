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
public class DBUpdate {
     Statement stmt;
     
    public void UpdateCar(String car_reg, String make, String model,String available){
        String query=String.format("UPDATE car_reg SET car_reg= '%s',make='%s',model='%s',available='%s' WHERE car_reg='%s'",car_reg,make,model,available);
        stmt = Connector.ConnectDb();
         try{
            stmt.executeUpdate(query);
        }catch(SQLException ex){
            Logger.getLogger(DBInsert.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
}
