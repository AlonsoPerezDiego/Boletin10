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
public class Boletin101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select = Integer.parseInt(JOptionPane.showInputDialog("Introducid 1 si quereis empezar a jugar.\nIntroducid cualquier otro número para no jugar."));
        Juego game = new Juego();
        while(select==1){
            game.names();
            game.player1();
            game.player2();
            
            select = Integer.parseInt(JOptionPane.showInputDialog("Introducid 1 si quereis empezar a jugar.\nIntroducid cualquier otro número para no jugar."));
        }
        if(select!=1){
            JOptionPane.showMessageDialog(null, "Adios.\nGracias por jugar.");
        }
    }
    
}
