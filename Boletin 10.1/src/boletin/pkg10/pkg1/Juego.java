/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg10.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Juego {
    private int num, intent, n, rep;
    private String nom1, nom2;
    
    public Juego(){
    }
    
    public void names(){
        
        nom1 = JOptionPane.showInputDialog("Introduce el nombre del jugador 1.");
        nom2 = JOptionPane.showInputDialog("Introduce el nombre del jugador 2.");
    }
    
    public void player1(){

        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número entre 1 y 50."));
        intent = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos para " + nom2));
        
        while((num<=0|num>50)|(intent<=0|intent>=50)){
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número entre 1 y 50."));
            intent = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos para " + nom2));
        }
        
    }
    
    public void player2(){
        
        rep = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número en el que pensó " + nom1));
        
        while(rep<intent&&n!=num){
            fallo();
        }
        
        if(n==num){
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!\nEl número era " + num + ".");
        }
        else{
            JOptionPane.showMessageDialog(null, "Lo siento, no has podido ganar.\nHas superado los " + intent + " intentos.\nEl número era " + num + ".");
        }
            
    }
    
    private void fallo(){
        if(n<num){
            n = Integer.parseInt(JOptionPane.showInputDialog("Te has equivocado, el número es mayor.\nVuelve a intentarlo.\nTe quedan " + (intent - rep) + " intentos."));
            rep++;
        }
        else{
            n = Integer.parseInt(JOptionPane.showInputDialog("Te has equivocado, el número es menor.\nVuelve a intentarlo.\nTe quedan " + (intent - rep) + " intentos."));
            rep++;
        }
    }
}
