/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Juego {
    private boolean victoria;
    private int num, n;
    private String name;
    
    public Juego(){
    }
    
    public void setName(){
        name = JOptionPane.showInputDialog("Introduce el nombre del jugador.");
    }
    public String getName(){
        return name;
    }
    
    public void setNum(){
        num = (int)(Math.random()*100);
        
        while(num<=0|num>50){
            num = (int)(Math.random()*100);
        }
    }
    
    public void play(){
        int rep =(int)(Math.random()*100);
        while(rep<5|rep>15){
            rep =(int)(Math.random()*100);
        }
        n = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número en el que pensé.\nEstá entre 1 y 50.\nTienes " + rep + " intentos."));
        rep--;
        while(rep>0&&n!=num){
            fallos();
            n = Integer.parseInt(JOptionPane.showInputDialog("Vuelve a intentar adivinar el número.\nTe quedan " + rep + " intentos."));
            rep--;
        }
        if(n==num){
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!\nEl número era " + num + ".\n＼(＾▽＾)／");
            victoria = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Lo siento, no has podido ganar.\nHas superado el número de intentos.\nEl número era " + num + ".");
            victoria = false;
        }
    }
    
    private void fallos(){
        if((Math.abs(num-n))<=5){
            JOptionPane.showMessageDialog(null, "Muy caliente.");
        }
        else if((Math.abs(num-n))<=10&&(Math.abs(num-n))>5){
            JOptionPane.showMessageDialog(null, "Caliente.");
        }
        else if((Math.abs(num-n))<=20&&(Math.abs(num-n))>10){
            JOptionPane.showMessageDialog(null, "Frío.");
        }
        else if((Math.abs(num-n))>20){
            JOptionPane.showMessageDialog(null, "Muy frío.");
        }
    }
    
    public void extMode(){
        int rep =(int)(Math.random()*100);
        while(rep<5|rep>15){
            rep =(int)(Math.random()*100);
        }
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número en el que pensé.\nEstá entre 1 y 50.\nTienes " + rep + " intentos."));
        rep--;
        
        while(rep>0&&n!=num){
            n = Integer.parseInt(JOptionPane.showInputDialog("Vuelve a intentar adivinar el número.\nTe quedan " + rep + " intentos."));
            rep--;
        }
        
        if(n==num){
            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado en el modo extremo!\nEl número era " + num + ".\n＼(＾▽＾)／");
            victoria = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Lo siento, no has podido ganar.\nHas superado el número de intentos.\nEl número era " + num + ".");
            victoria = false;
        }
    }
    public boolean getVictoria(){
        return victoria;
    }
}

