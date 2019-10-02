/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import javax.swing.JFrame;
import javax.swing.*; 	
/**
 *
 * @author carlo
 */
public class Tela {
   //Carregando Imagens
  ImageIcon vit2 = new ImageIcon("gif.gif");
   ImageIcon vit1 = new ImageIcon("non2.png");
   ImageIcon fundo = new ImageIcon("ganhei2.gif");
   
   //Labels
    JLabel centro = new JLabel(fundo);
    JLabel fundo1 = new JLabel(vit1);
    JLabel fundo2 = new JLabel(vit2);
    
    public void Tela() {
        
        JFrame perdeu = new JFrame();
        perdeu.setResizable(false);
        perdeu.setSize(600,600);
        perdeu.setLocationRelativeTo(null);
        perdeu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        perdeu.setLayout(null); 
       perdeu.setVisible(true);
       
       fundo1.setBounds(0,0,600,600);
       fundo2.setBounds(0,0,600,600);
       centro.setBounds(0,-100,700,700);
       
       
      //perdeu.add(fundo2);
        perdeu.add(fundo1);
        perdeu.add(centro);
    }
    

}
