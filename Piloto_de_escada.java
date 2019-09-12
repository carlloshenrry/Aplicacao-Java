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
public class Piloto_de_escada {
public int tempo_de_CNH;
public int Qtd_de_multas;
public String Nome;
public String carro;

    public int getTempo_de_CNH() {
        return tempo_de_CNH;
    }

    public void setTempo_de_CNH(int tempo_de_CNH) {
        this.tempo_de_CNH = tempo_de_CNH;
    }

    public int getQtd_de_multas() {
        return Qtd_de_multas;
    }

    public void setQtd_de_multas(int Qtd_de_multas) {
        this.Qtd_de_multas = Qtd_de_multas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCarro() {
        return carro;
    }

    public void comprar_Carro(String carro) {
        this.carro = carro;
    }


}
