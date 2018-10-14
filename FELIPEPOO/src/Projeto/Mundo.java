/**
 * Mundo
 
 * 
 * @author Felipe Alves*/


package Projeto;

import java.util.ArrayList;

public class Mundo {
    
        /**Instanciando a classe veículo*/
	 
	 
    
    Veiculo v = new Veiculo();
    
        /** ArrayList */
    
	ArrayList <Carro> car = new ArrayList<>();
	ArrayList <Caminhao> cao = new ArrayList<>();
        ArrayList <Moto> moto = new ArrayList<>();
        ArrayList <Bike> bike = new ArrayList<>(); 
        
	
    
    
    public int mapa[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            	           {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            	           {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
     
        /** Meoto para gerar veiculos */
	 
   public void geraVeiculos() {
		for(int i = 0; i < 10; i++) {
			

			cao.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "amarelo", false));
                        
			while (mapa[cao.get(i).getX()][cao.get(i).getY()] == 2) {
                            
				cao.get(i).setX();
                                
				cao.get(i).setY();
			}
                        car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
                        
			while (mapa[car.get(i).getX()][car.get(i).getY()] == 2) { 
                            
				car.get(i).setX();
                                
				car.get(i).setY();
			}

			
		
                
			bike.add(new Bike((v.setX()+1), (v.setY()+1), 1, "Verde", false));
                        
			while (mapa[bike.get(i).getX()][bike.get(i).getY()] == 2) {
                            
				bike.get(i).setX();
                                
				bike.get(i).setY();
			}
                        moto.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
                        
			while (mapa[moto.get(i).getX()][moto.get(i).getY()] == 2) {
                            
				moto.get(i).setX();
				moto.get(i).setY();
			}
                        
                        }
	}
       
    
    public void zeraMapa() {
		for(int i = 0; i<30; i++) {
			for(int j = 0; j < 60; j++) {
				if(mapa[i][j] != 1 && mapa[i][j] != 2) {
					mapa[i][j] = 0;
				}
			}
		}
                for (int a = 0; a < car.size(); a++) {
			
			int xcar = car.get(a).getX(); 
                        
			int ycar = car.get(a).getY();
			

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xcar && j == ycar) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2; 
							
						}
						else {
							mapa[i][j] = 3;
						}
					}
				}
			}
		}
                
		
		for(int a  = 0; a < cao.size(); a++) {
                   
			int xcao = cao.get(a).getX();
                        
			int ycao = cao.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xcao && j == ycao) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 4;
						}
					}
				}
			}
		}
		
		for(int a = 0; a < moto.size(); a ++) {
                    
			int xm = moto.get(a).getX();
                        
			int ym = moto.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xm && j == ym) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 5;
						}
					}
				}
			}	
		}
                for(int a = 0; a < bike.size(); a ++) {
                    
			int xm = bike.get(a).getX();
                        
			int ym = bike.get(a).getY();
			
			for(int i = 0; i<30; i++) {
                            
				for(int j = 0; j < 60; j++) {
                                    
					if(i == xm && j == ym) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 6;
						}
					}
				}
			}	
		}
                
                
		
	}
    
       
    
    public void desenhaMundo() {
        
               //Veiculos e códigos das suas cores*/
               
                String bikeAzul = "\u001B[34m";
               
                String fabrica = "\u001B[36m";
                
                String limite = "\u001B[35m" ;
                
                String map = "\u001B[37m";
                
		String carroAmarelo = "\u001B[33m";
                
                String camiVermelho = "\u001B[31m";
                
                String motoVerde = "\u001B[32m";
                
                
                
                int caminhoes = 0;
                
                int bikes = 0;
                
                
		int carros = 0;
                
                
                
		int motos = 0;
                
                
                
                
		
		
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					
                                       /** Desenhando o mundo */
					
					if(mapa[i][j] == 1) {
						System.out.print(limite + "█");
					}
					
					
					else if(mapa[i][j] == 2) {
						System.out.print(fabrica + "█");
					}
                                        
                                        else if(mapa[i][j] == 0) {
						System.out.print(map + "█");
					}
                                        
					else if(mapa[i][j] == 3){
						System.out.print(carroAmarelo + "█");
					}
                                        
					else if(mapa[i][j] == 4){
						System.out.print(camiVermelho + "█");
					}
					else if(mapa[i][j] == 5){
						System.out.print(motoVerde + "█");
					}
                                        
                                        else if(mapa[i][j] == 6){
						System.out.print(bikeAzul + "█");
					}
					
				}
				
				System.out.println("");
			}	
			
                         /**
			 * Imprimindo a legenda
			 */
			
			System.out.print(carroAmarelo + "█");
			System.out.print(" Carros   ");
                        
			System.out.print(camiVermelho + "█");
			System.out.print(" Caminhão   ");
                        
			System.out.print(motoVerde + "█");
			System.out.print(" Motos  ");
                        
			System.out.print(bikeAzul + "█");
			System.out.println(" Bikes");
			
                       for(int a = 0; a < moto.size(); a++) {
				motos++;
			}
                        
			for(int a = 0; a < bike.size(); a++) {
				bikes++;
			}
			
			for(int a = 0; a < car.size(); a++) {
				carros++;
			}
			for(int a = 0; a < cao.size(); a++) {
				caminhoes++;
			}
			
		System.out.println("Numero de Motos: " + motos);
                
                        System.out.println("Numero de Bikes: " + bikes);
                        
                        
			System.out.println("Numero de Carros: " + carros);
                        
			System.out.println("Numero de Caminhoes: " + caminhoes);
			
	}
	
	
	public void atualizaMundo() {
		for(int i = 0; i < car.size(); i++) {
			car.get(i).moveCarro(car.get(i));
                        
		}
		
		for (int i = 0; i < cao.size(); i ++) {
			cao.get(i).moveCaminhao(cao.get(i));
                        
		}
		
		for (int i = 0; i < moto.size(); i ++) {
			moto.get(i).moveMoto(moto.get(i));
                        
		}
                for (int i = 0; i < bike.size(); i ++) {
			bike.get(i).moveBike(bike.get(i));
                        
		}
                
		zeraMapa();
                
		desenhaMundo();
                
		geraVeiculo();
                
		detectaColisao();
		
                
	}
	
	
	public void detectaColisao() {
		// carro com carro
		for (int i = 0; i < car.size(); i ++) {
			for (int j = 0; j < car.size(); j++) {
				if(car.get(j).getX() == car.get(i).getX() && car.get(j).getY() == car.get(i).getY()) {
					if (i == j) { 
						
					}
					else {
						car.remove(car.get(i));
					}	
				}
			}
		}
		// caminhão com caminhão
		
		for (int i = 0; i < cao.size(); i ++) {
			for (int j = 0; j < cao.size(); j++) {
				if(cao.get(j).getX() == cao.get(i).getX() && cao.get(j).getY() == cao.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						cao.remove(cao.get(i));
					}	
				}
			}
		}
                //Bike e Bike
                for (int i = 0; i < bike.size(); i ++) {
                    
			for (int j = 0; j < bike.size(); j++) {
                            
				if(bike.get(j).getX() == bike.get(i).getX() && bike.get(j).getY() == bike.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						bike.remove(bike.get(i));
					}	
				}
			}
		}
                
		//moto com moto
		for (int i = 0; i < moto.size(); i ++) {
                    
			for (int j = 0; j < moto.size(); j++) {
                            
				if(moto.get(j).getX() == moto.get(i).getX() && moto.get(j).getY() == moto.get(i).getY()) {
                                    
					if(i == j) {
						
					}
					else {
						moto.remove(moto.get(i));
					}	
				}
			}
		}
		
		//caminhão e carro
		for(int i = 0; i < cao.size(); i++) {
                    
			for (int j = 0; j < car.size(); j++) {
                            
				if(car.get(j).getX() == cao.get(i).getX() && car.get(j).getY() == cao.get(i).getY()) {
                                    
					if(cao.size() > car.size()) {
						
					}
					else {
						car.remove(car.get(j));
					}
				}
			}
		}
		
		//caminhão e moto
		for(int i = 0; i < cao.size(); i++) {
                    
			for (int j = 0; j < moto.size(); j++) {
                            
				if(moto.get(j).getX() == cao.get(i).getX() && moto.get(j).getY() == cao.get(i).getY()) {
                                    
					if(cao.size() > moto.size()) {
						
					}
					else {
						moto.remove(moto.get(j));
					}
				}
			}
		}
                 //Bike e Caminhao
                for(int i = 0; i < cao.size(); i++) {
                    
                    
			for (int j = 0; j < bike.size(); j++) {
                            
				if(bike.get(j).getX() == cao.get(i).getX() && bike.get(j).getY() == cao.get(i).getY()) {
					if(cao.size()>bike.size()) {
						
					}
					else {
						bike.remove(bike.get(i));
					}
					
				}
			}
		}
		
		
                
                
                //Bike e Moto
                for(int i = 0; i < moto.size(); i++) {
                    
			for (int j = 0; j < bike.size(); j++) {
                            
				if(bike.get(j).getX() == moto.get(i).getX() && bike.get(j).getY() == moto.get(i).getY()) {
					if(moto.size()>bike.size()) {
						
					}
					else {
						bike.remove(bike.get(i));
					}
					
				}
			}
		}
                //Bike e Carro
                for(int i = 0; i < car.size(); i++) {
                    
			for (int j = 0; j < bike.size(); j++) {
                            
				if(bike.get(j).getX() == car.get(i).getX() && bike.get(j).getY() == car.get(i).getY()) {
                                    
					if(car.size()>bike.size()) {
						
					}
					else {
						bike.remove(bike.get(i));
					}
					
				}
			}
		}
                //moto e carro
		for(int i = 0; i < car.size(); i++) {
                    
			for (int j = 0; j < moto.size(); j++) {
                            
				if(moto.get(j).getX() == car.get(i).getX() && moto.get(j).getY() == car.get(i).getY()) {
                                    
					if(car.size()>moto.size()) {
						
					}
					else {
						moto.remove(moto.get(i));
					}
					
				}
			}
		}
               
	}
	
	
	public void geraVeiculo() {
            
		for(int a = 0; a < car.size(); a++) {
			int x = car.get(a).getX();
                        
			int y = car.get(a).getY();
                        
				for(int i = 0; i < 30; i ++) {
                                    
					for(int j = 0; j < 60; j++) {
                                            
						if(i == x && j == y) {
                                                    
							if(mapa[i][j] == 2 && car.get(a).isFabrica() == false) {
                                                            
								car.get(a).setFabrica(true); 
                                                                
								car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
								}
							}
						}
					}
				}
		
		for(int a = 0; a < cao.size(); a++) {
			int x = cao.get(a).getX();
                        
                        
			int y = cao.get(a).getY();
                        
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
                                            
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && cao.get(a).isFabrica() == false) {
								cao.get(a).setFabrica(true);
								cao.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "verde", false));
								}
							}
						}
					}
				}
		
	
		for(int a = 0; a < moto.size(); a++) {
                    
			int x = moto.get(a).getX();
                        
			int y = moto.get(a).getY();
                        
				for(int i = 0; i < 30; i ++) {
                                    
					for(int j = 0; j < 60; j++) {
                                            
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && moto.get(a).isFabrica() == false) {
								moto.get(a).setFabrica(true);
								moto.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
							}
						}
					}
				}
		}
                for(int a = 0; a < bike.size(); a++) {
                    
			int x = bike.get(a).getX();
                        
			int y = bike.get(a).getY();
                        
		for(int i = 0; i < 30; i ++) {
			for(int j = 0; j < 60; j++) {
					if(i == x && j == y) {
							if(mapa[i][j] == 2 && bike.get(a).isFabrica() == false) {
                                                            
						bike.get(a).setFabrica(true);
                                                
							bike.add(new Bike((v.setX()+1), (v.setY()+1), 3, "Verde", false));
                                                        
							}
						}
					}
				}
		}
	}
        

    }
    
    

