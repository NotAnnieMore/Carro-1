package es.antrob;

/**
 * A classe Carro representa uma viatura automóvel, conhecida popularmente por Carro.
 *
 *  
 * Pretende-se construir uma abstracção simples de um carro, 
 * na sequência da Resolução da Ficha 3 de POO.
 *    
 * @author antrob
 *
 */
public class Carro {
	
	static private final double CONSUMO=5.5; // litros por 100 km/l
	
	private double quantidadeCombustivel;	// quantidade de combustível no depósito (unidade litros)
	private double capacidadeDeposito;		// capacidade do depósito em termos de combustível (unidade litros)
	
	/*		Construtores	*/
	 
	/**
	 *  Construtor por defeito.
	 *  
	 *  O nível de combustível inicial é 0. 
	 *  A capacidade do depósito é constante e igual a 40 litros 
	 */
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	/*		Acessores		*/ 

	/**
	 * Obter o Consumo do carro em litros por 100km/l.
	 * 
	 * O consumo corresponde a uma especificação de fábrica e assume-se como sendo constante na circulação do automóvel. 
	 * 
	 * @return retorna o número de litros gastos por cada 100 km/l
	 */
	public static double getConsumo() {
		return CONSUMO;
	}

	/**
	 * Obter a Quantidade de combustível que está no depósito. 
	 * 
	 * @return retorna o número de litros de combustível armazenado no depósito  
	 */
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	/**
	 * Obter a Capacidade do depósito 
	 * 
	 * A capacidade do depósito não se altera no decorrer da vida útil do carro. 
	 * 
	 * @return
	 */
	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	/*		Métodos			*/ 
	
	/**
	 * Meter uma determinada quantidade de combustível no carro
	 * 
	 * Esta é uma das hipóteses de meter combustível
	 * definindo a quantidade a abastecer 
	 *  
	 * @param quantidade - número de litros a introduzir no depósito
	 * @return retorna a quantidade de litros metida no depósito
	 */
	public double meterCombustivel( double quantidade) { 		
		
		double litrosMetidos = 0;
		// Devia testar se Transborda o depósito
		// Podia retornar os Litros Metidos 
		if(quantidadeCombustivel > capacidadeDeposito)
			System.out.println("Transborda");
		else {
			quantidadeCombustivel = quantidadeCombustivel + quantidade;
			litrosMetidos += quantidade;
		}
		return litrosMetidos;
		
	}
	
	
	/**
	 * Meter combustível no carro de forma a atestar o depósito.
	 * 
	 * Atestar o depósito do carro é uma operação comum nos condutores,
	 * designadamente antes ou quando em viagem.
	 * 
	 * @return retorna a quantidade de litros metida no depósito
	 */
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	
	/**
	 * Andar simula o ato de conduzir o veículo ao longo de uma certa distância.
	 * 
	 * @param distancia números de klm a percorrer com o carro
	 *  
	 * @return retornar a distância realmente percorrida
	 */
	public double andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return distancia;
		}
		else {
			
			// Andar até parar porque fica sem combustivel
			double distanciaPercorrida = obterAutonomia();
			quantidadeCombustivel = 0;
			return distanciaPercorrida;
		}
			
			
	}
	
	
	// kmCombustivel( )   
	/**
	 * Obter Autonomia permite saber quantos Klms podem ser feitos com o carro sem meter combustível.
	 * 
	 * @return retorna o número de klm que podem ser percorridos com o atual nível do depósito
	 */
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
