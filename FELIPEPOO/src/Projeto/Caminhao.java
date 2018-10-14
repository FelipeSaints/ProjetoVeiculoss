/**

 * @author Felipe Alves
 */ 
 
package Projeto;


public class Caminhao extends Veiculo {
    
    Veiculo v = new Veiculo();
    /**
	 * Construtor da classe Caminhao, que usa um super para chamar o construtor da classe Veículo*/
	 
    
    public Caminhao (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
    
}
