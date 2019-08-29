/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 18720367
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Passageiro passageiro1=new Passageiro("Carlos",20,"Br",3452845,"Brasil",35);
        passageiro1.pesoestimado(50);
        passageiro1.imprimirParametros();
        passageiro1.imprimirParametros2();
        
        
        
        
    }
    
    
}
