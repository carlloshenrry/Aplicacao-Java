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
public abstract class Automovel {
    
    
    public int Num_portas;
    public int Num_cilindros;
    public boolean turbo;
    public String cor_carroceria;
    public int placa;
    public int potencia;
    
    public abstract int getNum_portas();
    
    public abstract void setNum_portas(int portas);

    public abstract int getNum_cilindros();

    public abstract void setNum_cilindros(int cilindros);

    public abstract boolean isTurbo(boolean turbo);

    public abstract void setTurbo(boolean turbo);
    
    public String getCor_carroceria() {
        return cor_carroceria;
    }

    public void setCor_carroceria(String cor_carroceria) {
        this.cor_carroceria = cor_carroceria;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    public abstract int Tempo( int aceleracao);
}
