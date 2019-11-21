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
public  class teste3 extends teste2 {
     public int rg;
     public int salario;
     public String sobrenome;

    public teste3() {
        super(10, "Bla", 10);
    }

     
     
     
    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

     @Override
    public int getIdade() {
        return idade;
    }

     @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

     @Override
    public String getNome() {
        return Nome;
    }

     @Override
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

     @Override
    public int getRenda() {
        return renda;
    }

     @Override
    public void setRenda(int renda) {
        this.renda = renda;
    }
    
    public void contaPoup()
    {
        
    }
     
     
}
