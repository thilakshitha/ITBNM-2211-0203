/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.DBUpdate;

/**
 *
 * @author Administrator
 */
public class UpdateController {
    
    public void UpdateCar(String car_reg, String make, String model,String available){
        
    
        if(car_reg.equals("")||make.equals("")||model.equals("")||available.equals("")){
        JOptionPane.showMessageDialog(null, "not update " );
        }
        else{
         new DBUpdate().UpdateCar(car_reg, make, model, available);
         JOptionPane.showMessageDialog(null, " updated" );
        
        }
    }
    
}
