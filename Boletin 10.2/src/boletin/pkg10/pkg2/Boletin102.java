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
public class Boletin102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Juego game = new Juego();
        
        int jugador = 0, ordenador = 0, marcador;
        game.setName();
        int mode = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para una partida rápida.\nIntroduce 2 para un duelo.\nIntroduce 3 para una partida rápida en modo extremo.\nIntroduce 4 para un duelo en modo extremo.\nIntroduce cualquier otro número para cerrar.\n(⌒ω⌒)"));
        while((mode>0&&mode<5)){
            if(mode==1){
                game.setNum();
                game.play();
            }
            else if(mode==2){
                marcador = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de puntos máximo para ganar."));
                while(marcador<=1){
                    marcador = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de puntos máximo para ganar.\nQue sean más de 1."));
                }
                while(jugador!=marcador&&ordenador!=marcador){
                    game.setNum();
                    game.play();
                    if(game.getVictoria()==true){
                        jugador++;
                    }
                    else{
                        ordenador++;
                    }
                }
                if(jugador==marcador){
                    JOptionPane.showMessageDialog(null, "¡Felicidades, me has conseguido ganar con una diferencia de " + (jugador-ordenador) + " puntos!\n＼(＾▽＾)／");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Creo que te he ganado con una diferencia de " + (ordenador-jugador) + " puntos.\n(≧▽≦)");
                }
            }
            else if(mode==3){
                game.extMode();
            }
            else{
                marcador = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de puntos máximo para ganar.\nPreparate para un verdadero desafio.\n( ͡° ͜ʖ ͡°)"));
                while(marcador<=1){
                    marcador = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de puntos máximo para ganar.\nQue sean más de 1."));
                }
                while(jugador!=marcador&&ordenador!=marcador){
                    game.extMode();
                    if(game.getVictoria()==true){
                        jugador++;
                    }
                    else{
                        ordenador++;
                    }
                }
                if(jugador==marcador){
                    JOptionPane.showMessageDialog(null, "¡Felicidades, me has conseguido ganar con una diferencia de " + (jugador-ordenador) + " puntos!\n¡Ha sido lo más impresionante que he visto!\n(⊙_⊙)");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Creo que te he ganado con una diferencia de " + (ordenador-jugador) + " puntos, era difícil.\n(≧▽≦)");
                }
            }
            mode = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 para una partida rápida.\nIntroduce 2 para un duelo.\nIntroduce 3 para una partida rápida en modo extremo.\nIntroduce 4 para un duelo en modo extremo.\nIntroduce cualquier otro número para cerrar.\n(⌒ω⌒)"));
        }
        JOptionPane.showMessageDialog(null, "Gracias por jugar " + game.getName() + ".\nMe he divertido mucho.\n(⌒ω⌒)");
    }
    
    
    
}