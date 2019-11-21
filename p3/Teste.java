/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author 18720367
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        teste3 t3 = new teste3();
        System.out.println(t3.getIdade());
        
        try{
            int result=divideInt(10,5);
            System.out.format("10 divided by 5 is %d%n", result);
            divideInt(10,0);
            System.out.format("10 divided by 0 is %d%n", result);
        }
        catch (divid0 ex){
            System.out.println(ex.getmsg());
        }
    }
        public static int divideInt(int i , int j) throws divid0 {
            if(j==0){
                throws new divid0 ("Divisor cannot be zero");
            }
            return i/j;
        }
    }
    

