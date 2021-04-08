package cliente.carro;

import es.antrob.Carro;

public class Principal {

	public static void main(String[] args) {
		
		boolean constroiBem = testarConstrucaoCarro();
		
		if( constroiBem )
			System.out.println("Carro bem construído");
		else 
			System.out.println("Carro mal construído");
		

	}
	
	private static boolean testarConstrucaoCarro() {
		
		Carro carroTeste = new Carro();
		
		if((carroTeste.getCapacidadeDeposito() == 40.0) && (carroTeste.getQuantidadeCombustivel() == 0))
			return true;
		else
			return false;
	}
	
	private static boolean testarMeterCombustivelcomQuantidade() {
		
		// Considerar 3 casos 
		
		// Dando uma quantidade que faria transbordar o depósito
		
		// Dando a exacta quantidade para atestar o depósito 
		
		// Dando uma quantidade que aumentaria o nível de combustível sem encher por completo o depósito
		
		return false;
	}
	
	private static boolean testarMeterCombustivelAtestar() {
		
		return false;
	}
	
	private static boolean testarAndar() {
		
		// 3 casos 
		
		// Recendo uma distância dentro da autonomia do carro 
		
		// Recebendo uma distância superior à autonomia do carro 
		
		// Recebendo uma distância igual à autonomia do carro 
		
		return false;
	}
	
	
	
	

}
