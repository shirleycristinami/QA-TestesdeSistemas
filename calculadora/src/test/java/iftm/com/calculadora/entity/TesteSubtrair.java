package iftm.com.calculadora.entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteSubtrair {
	

	public class CalculadoraTesteSubtrair {

		@Test
		public void testaSubtrairCorretaParaDoisInteirosPositivos() {
			Calculadora calculadora =new Calculadora();
			
			int entradaNumero1 = 10;
			int entradaNumero2 = 5;
			
			int resultadoEsperado = 5;
			calculadora.subtrair(entradaNumero1, entradaNumero2);
			int resultadoObtido = calculadora.getResultado;
			
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}
	}


}
