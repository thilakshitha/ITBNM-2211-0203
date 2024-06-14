/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.DBDelete;

/**
 *
 * @author Administrator
 */
public class Deletecontroller {
    
    public void DeleteCar(String car_reg){
        if(car_reg.equals("")) {
        JOptionPane.showMessageDialog(null, "not Deleted" );
        }
        else{
        new DBDelete().DeleteCar(car_reg);
        JOptionPane.showMessageDialog(null, "Deleted " );
        }
    
    }
    
}
