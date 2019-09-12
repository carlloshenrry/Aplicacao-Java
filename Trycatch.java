/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author 18720367
 */
public class Trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Unomile way = new Unomile();
        try
        {
            int [] Erro_pq_quero={200,30,2};
            System.out.println( Erro_pq_quero[10]);
        }catch (Exception e)
        {
            ///System.out.println("erro");
            System.err.println("erro"+e);
        }
    }
    
}
