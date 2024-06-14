/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Administrator
 */
public class DBInsert {
     Statement stmt;
    
    public void InsertCar(String car_reg, String make, String model,String available){
        String query=String.format("INSERT INTO car_reg (car_reg, make, model,available)"+"VALUES('%s','%s','%s','%s')",car_reg,make,model,available);
        stmt = Connector.ConnectDb();
        try{
            stmt.executeUpdate(query);
        }catch(SQLException ex){
            Logger.getLogger(DBInsert.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    
    }
    
    public void InsertCustomer(String cust_id, String name, String address, String mobile){
        String query=String.format("INSERT INTO customer (cust_id, name, address, mobile)"+"VALUES('%s','%s','%s','%s')",cust_id, name, address, mobile);
        stmt = Connector.ConnectDb();
      try{
            stmt.executeUpdate(query);
        }catch(SQLException ex){
            Logger.getLogger(DBInsert.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}
