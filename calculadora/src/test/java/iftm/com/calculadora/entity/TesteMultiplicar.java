package iftm.com.calculadora.entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteMultiplicar {		

		public class CalculadoraTesteMultiplicar {

			@Test
			public void testaMultiplicarCorretaParaDoisInteirosPositivos() {
				Calculadora calculadora =new Calculadora();
				
				int entradaNumero1 = 5;
				int entradaNumero2 = 5;
				
				int resultadoEsperado = 25;
				calculadora.multiplicar(entradaNumero1, entradaNumero2);
				int resultadoObtido = calculadora.getResultado;
				
				Assertions.assertEquals(resultadoEsperado, resultadoObtido);
				
			}
		}

}