/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 18720367
public class Passag
 */
public class Passageiro extends Pessoa {
    public String passaporte;
    public int mala;

    public Passageiro(String nome,int idade, String nacionalidade,int rg,String passaporte, int mala) {
        super(nome,idade, nacionalidade, rg);
        this.passaporte = passaporte;
        this.mala = mala;
    }

    public Passageiro() {
    }
    

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public int getMala() {
        return mala;
    }

    public void setMala(int mala) {
        this.mala = mala;
    }
    
    public void pesoestimado(int Mala){
        if(Mala> this.mala)
            System.out.println("Peso acima, Taxa a ser cobrada. ");
        else
                System.out.println("Peso de acordo com o exigido. ");
    }
    public void imprimirParametros2()
    {
        System.out.println("Passaporte: "+this.getPassaporte()+" / Peso da mala passageiro: "+this.getMala());
    }
}
