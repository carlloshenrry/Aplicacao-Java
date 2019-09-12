package trycatch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18720367
 */
public class Unomile extends Automovel{
    
public int Num_escadas;
public int tamanho_porta_malas;

    public int getNum_escadas() {
        return Num_escadas;
    }

    public void setNum_escadas(int Num_escadas) {
        this.Num_escadas = Num_escadas;
    }

    public int getTamanho_porta_malas() {
        return tamanho_porta_malas;
    }

    public void setTamanho_porta_malas(int tamanho_porta_malas) {
        this.tamanho_porta_malas = tamanho_porta_malas;
    }
   
    public int Tempo (int aceleracao){
        return (27/aceleracao);
    }
    public int getNum_portas(){
        return Num_portas;
    }
    
    public void setNum_portas(int Num_portas){
          this.Num_portas = Num_portas;
    }

    public int getNum_cilindros(){
         return Num_cilindros;
    }

    public void setNum_cilindros(int Num_cilindros){
        this.Num_cilindros= Num_cilindros;
    }

    public boolean isTurbo(boolean Turbo){
        return this.turbo;
    }

    public void setTurbo(boolean turbo){
        this.turbo=turbo;
    }
    
}

