/* @author Felipe Alves*/

 


package Projeto;

public class Carro extends Veiculo {
    
    Veiculo v = new Veiculo();
    /**
	  Construtor da classe Carro, que usa um super para chamar o construtor da classe Veículo
	 */
    
    public Carro (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
    
}
