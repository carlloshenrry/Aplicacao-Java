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
        // Carro
        carros volks= new carros();
        volks.setCorCarroceria("Branco"); 
        volks.setNomeFabricante("Volkswagem");
        volks.setNomeModelo("Golf GTI Aro 20");   
        volks.setNumeroPortas(2);
        volks.setQuantidadePassageiros(5);  
        volks.setQuantidadeRodas(4);
        volks.setQuilometragem(100000);
        volks.setPortaAberta(true);
        
        //Condutor:
        Condutor piloto= new Condutor();
        piloto.setIdadeCondutor(30);
        piloto.setNacionalidadeCondutor("Alemão");
        piloto.setNivelHabilidade(100);
        piloto.setNomeCondutor("Shummacher");
        piloto.setTipoCondutor("Piloto de F1");
        
        
        //Print Carro
        System.out.println("Cor da Carroceria: " + volks.corCarroceria + "\n");
        System.out.println("Fabricante: " + volks.nomeFabricante + "\n");
        System.out.println("Modelo: " + volks.nomeModelo + "\n");
        System.out.println("Portas: " + volks.numeroPortas + "\n");
        System.out.println("Num de Passageiros: " + volks.quantidadePassageiros + "\n");
        System.out.println("Numero de rodas: " + volks.quantidadeRodas + "\n");
        System.out.println("Quilometragem: " + volks.Quilometragem + "\n");
        
                if(volks.portaAberta == true)
                {
            System.out.println("Porta Aberta \n \n");
                }
                else
                {
            System.out.println("Porta fechada \n \n");
                }
        
        //Print Condutor
        System.out.println("Piloto: " + piloto.nomeCondutor + "\n");
        System.out.println("Idade: " + piloto.idadeCondutor + "\n");
        System.out.println("Nacionalidade: " + piloto.nacionalidadeCondutor + "\n");
        System.out.println("Tipo de Piloto: " + piloto.tipoCondutor + "\n");
        System.out.println("Nivel de Habilidade: " + piloto.nivelHabilidade + "\n ");
        
    }   
    
}
