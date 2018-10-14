/**
 
 * @author Felipe Alves*/

package Projeto;


public class Moto extends Veiculo {
    
    Veiculo v = new Veiculo();
    /**
	 * Construtor da classe Moto, que usa um super para chamar o construtor da classe Veículo*/
	
    
    public Moto (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
    
}
