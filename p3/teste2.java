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
public abstract class teste2  {
    public int idade;
    public String Nome;
    public int renda;

    public teste2() {
    }

    public teste2(int idade, String Nome, int renda) {
        this.idade = idade;
        this.Nome = Nome;
        this.renda = renda;
    }
    
    


      public abstract int getIdade();
       
    

    public abstract void setIdade(int Idade); 
   

    public abstract String getNome(); 
   

    public abstract void setNome(String Nome);
       
    public abstract int getRenda();
    

    public abstract void setRenda(int Renda);

   public void Rendamax(){
     
   }
    
}
