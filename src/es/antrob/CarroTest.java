package es.antrob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroTest {

	private Carro herbie;
	
	@BeforeEach
	void setUp() throws Exception {
		herbie = new Carro();
	}

	@Test
	void testarConstrucaoCarro() {
//		fail("Not yet implemented");
		
		assertEquals(40.0, herbie.getCapacidadeDeposito(), "A capacidade do depósito deve ser igual a 40.0 ");
		assertEquals(0, herbie.getQuantidadeCombustivel(), "A quantidade do combustível deve ser igual a 0 ");
		
	}

}
