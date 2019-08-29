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
public class Pessoa {
    
    public String nome;
    public int idade;
    public String nacionalidade;
    public int rg;
    
    
    public Pessoa() {
    }

    
    public Pessoa(String nome, int idade, String nacionalidade, int rg) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.rg = rg;
        
    }   


   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

 

    public void imprimirParametros()
    {
        System.out.println("Nome do passageiro: "+this.getNome()+" / Idade: "+this.getIdade()+" / Nacionalidade: "+this.getNacionalidade()+ "/ rg: "+this.getRg());
    }
}
