/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Refac {
    
    public int pedirNumDigitos(){//Method to ask for "numDigitos"
        int numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introducir nº de cifras."));
        while(numDigitos<0|numDigitos>5){
            numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introducir nº de cifras (Entre 0 y 5)."));
        }
        return numDigitos;
    }
    
}
