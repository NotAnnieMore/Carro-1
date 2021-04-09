package cliente.carro;

import es.antrob.Carro;

public class Principal {

	public static void main(String[] args) {
		
		boolean constroiBem = testarConstrucaoCarro();
		
		if( constroiBem )
			System.out.println("Carro bem construído");
		else 
			System.out.println("Carro mal construído");
		
		if(testarMeterCombustivelAtestar())
			System.out.println("Está a Atestar bem o carro ");
		else
			System.out.println("Está a Atestar mal o carro ");

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
		
		Carro herbie = new Carro();
		
		double CombustivelAntesAtestar = herbie.getQuantidadeCombustivel();
//		herbie.getQuantidadeCombustivel() - CombustivelAntesAtestar == quantidadeMetidaDeposito;
		
		double quantidadeMetidaDeposito = herbie.meterCombustivel();
		
		herbie.meterCombustivel();
		
		if((herbie.getQuantidadeCombustivel() == herbie.getCapacidadeDeposito()) && 
				(herbie.getQuantidadeCombustivel() - CombustivelAntesAtestar == quantidadeMetidaDeposito))
			return true;
		else 
			return false;
		
//		return (herbie.getQuantidadeCombustivel() == herbie.getCapacidadeDeposito());
		
	}
	
	private static boolean testarAndar() {
		
		// 3 casos 
		
		// Recendo uma distância dentro da autonomia do carro 
		
		// Recebendo uma distância superior à autonomia do carro 
		
		// Recebendo uma distância igual à autonomia do carro 
		
		return false;
	}
	
	
	
	

}
