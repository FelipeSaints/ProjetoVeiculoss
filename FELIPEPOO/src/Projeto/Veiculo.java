/*
 * @author Felipe Alves*/
 

package Projeto;

import java.util.Random;

public class Veiculo {
    
    private double velocidade; 
    
    
	private boolean fabrica; 
        
        
	private String cor;
        
        private int x; /// Coordenada X do veículo
        
	private int y; /// Coordenada Y do veículo
	 
    
    	Random r = new Random(); 
        
       //Construtor
    
    public Veiculo() {
        
        fabrica = false; 
        
        
        cor = null; 
        
        x = 0; 
        
        y = 0; 
        
        velocidade = 0; 
        
        
        
        
        
        
        
	}
    
    	/**
	 * Construtor da classe Veículo*/
	 
    
   public Veiculo(int x, int y, double velocidade, String cor, boolean fabrica) {
        
        this.cor = cor;
        
        
		this.fabrica = fabrica;
                
                
		this.x = x;
                
                
		this.y = y;
                
                
		this.velocidade = velocidade;
		
	}
    
    public int setX() {
        
        x =  r.nextInt(28);
        
        return x;
    }
    
    
    public int setY() {
        
	y = r.nextInt(58);
        
	return y;
    }
    
    public int getX() {
        return x;
    }

    

    public int getY() {
        return y;
    }
    

    public void MoveX(int x) {
        
        this.x = x;
        
    }
    
    
    
    public void MoveY(int y) {
        
        
	this.y = y;
        
        
    }
    

   

    public boolean isFabrica() {
        
        return fabrica;
    }
    

    public void setFabrica(boolean fabrica) {
        
        this.fabrica = fabrica;
    }

    
    
    public String getCor() {
        return cor;
    }

    
   

    public double getVelocidade() {
        
        return velocidade;
    }
        
    Random car = new Random();
    
       
    
    public void moveCarro(Carro ca){
        int mov;
        
        	mov = car.nextInt(4);
		
		
	if(mov == 0) {
		int x1 = ca.getX(); ///< Obtendo o valor atual de X
                
		x1 = x1 + 2;///< Somando 2 (velocidade do carro) no valor atual de X 
                
		ca.MoveX(verificaX(x1));///< Chamando a função moveX da classe Veículo para realizar a movimentação 
                
		}	
                
	if(mov == 1) {
		int x2 = ca.getX();
		x2 = x2 - 2;
			ca.MoveX(verificaX(x2));
		}
		
	if(mov == 2) {
		int y1 = ca.getY();
                
		y1 = y1 + 2;
                
			ca.MoveY(verificaY(y1));
		}
		
	if(mov == 3) {
		int y2 = ca.getY();
                
		y2 = y2 - 2;
                
			ca.MoveY(verificaY(y2));
		}          
             
               
    }
    
       
    Random caminhao = new Random();
    
    
    
     public void moveCaminhao(Caminhao ca){
         
        int mov;
        
        	mov = caminhao.nextInt(4);
		
               
		
	if(mov == 0) {
			int x1 = ca.getX(); 
			x1 = x1 + 1; 
			ca.MoveX(verificaX(x1)); 
		}		
		
                
	if(mov == 1) {
			int x2 = ca.getX();
			x2 = x2 - 1;
			ca.MoveX(verificaX(x2));
		}
		
	if(mov == 2) {
			int y1 = ca.getY();
			y1 = y1 + 1;
			ca.MoveY(verificaY(y1));
		}
		
	if(mov == 3) {
			int y2 = ca.getY();
			y2 = y2 - 1;
			ca.MoveY(verificaY(y2));
		}        
        
    }
       
     Random moty = new Random();
     
    
     
      public void moveMoto(Moto m){
          
          int mov;
        
        	mov = moty.nextInt(4);
		
		
	if(mov == 0) {
		int x1 = m.getX(); 
		x1 = x1 + 3; 
		m.MoveX(verificaX(x1)); 
		}
                
               
		
	if(mov == 1) {
		int x2 = m.getX();
		x2 = x2 - 3;
		m.MoveX(verificaX(x2));
		}
		
	if(mov == 2) {
		int y1 = m.getY();
		y1 = y1 + 3;
		m.MoveY(verificaY(y1));
		}
		
	if(mov == 3) {
		int y2 = m.getY();
                
		y2 = y2 - 3;
                
		m.MoveY(verificaY(y2));
		}        
        
        
    }
      public void moveBike(Bike b){
          
          int mov;
        
        	mov = moty.nextInt(4);
		
		
	if(mov == 0) {
		int x1 = b.getX(); 
                
		x1 = x1 + 2; 
                
		b.MoveX(verificaX(x1)); 
                
                
		}
                
               
		
	if(mov == 1) {
		int x2 = b.getX();
                
		x2 = x2 - 2;
                
			b.MoveX(verificaX(x2));
                        
		}
		
                            if(mov == 2) {
		int y1 = b.getY();
                
			y1 = y1 + 2;
                        
			b.MoveY(verificaY(y1));
		}
		
		if(mov == 3) {
			int y2 = b.getY();
                        
			y2 = y2 - 2;
                        
			b.MoveY(verificaY(y2));
                        
		}        
        
        
    }
      
                public int verificaX(int x) {
		if (x >= 29) {
		x = 1;
		}
		if(x <= 0) {
			x = 28;
		}
		return x;
	}
      
      
	
	
	public int verificaY(int y) {
	if (y >= 59) {
			y = 1;
		}
		if(y <= 0) {
		y = 58;
		}
		return y;
	}  
    
    
    
    
    
        
    
}
