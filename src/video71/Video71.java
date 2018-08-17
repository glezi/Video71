/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video71;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author gleez
 */
public class Video71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoConTeclas mimarco = new MarcoConTeclas(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoConTeclas extends JFrame{
    public MarcoConTeclas(){
        setVisible(true); 
        setBounds(700,300,600,450); 
        
        //oyente para que haga su trabajo 
        EventoDeTeclado tecla = new EventoDeTeclado(); 
        addKeyListener(tecla); 
    }

}

class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
      char letra=e.getKeyChar();
      System.out.println(letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo=e.getKeyCode();
       
       System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}