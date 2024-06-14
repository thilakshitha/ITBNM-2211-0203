/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.DBInsert;


/**
 *
 * @author Administrator
 */
public class InsertController {
    
    public void InsertCar(String car_reg, String make, String model, String available){
        if(car_reg.equals("")||make.equals("")||model.equals("")||available.equals("")){
        JOptionPane.showMessageDialog(null, "not inserted " );
        }
        else{
         new DBInsert().InsertCar(car_reg, make, model, available);
         JOptionPane.showMessageDialog(null, " inserted " );
         
        }
    
    }
    
    public void InsertCustomer(String cust_id, String name, String address, String mobile){
        if(cust_id.equals("")||name.equals("")||address.equals("")||mobile.equals("")){
        JOptionPane.showMessageDialog(null, "not inserted " );
        }
        else{
         new DBInsert().InsertCustomer(cust_id, name, address, mobile);
         JOptionPane.showMessageDialog(null, " inserted " );
         
        }
    
    }
    
}
