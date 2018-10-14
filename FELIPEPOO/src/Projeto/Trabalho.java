/**
 * @author Felipe Alves
 */

package Projeto;


public abstract class Trabalho {

    
    public static void main(String[] args) throws InterruptedException{
      
        	Mundo m = new Mundo();
		
		m.geraVeiculos(); 
		m.desenhaMundo(); 
		
		int i = 0;
		
		while (i == 0) {
			m.atualizaMundo(); 
			Thread.sleep(300);  
		}
        
    }
    
}
