
package Projeto;

/**
 *
 * @author Felipe Alves
 */
public class Bike extends Veiculo {
    
    Veiculo bike = new Veiculo();
    
    /**
	 * Construtor da classe Bike, que usa um super para chamar o construtor da classe Veículo
	 */
    public Bike (int x, int y, double velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
    }
    
    
    
    
}
