package iftm.com.calculadora.entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteDividir {		

		public class CalculadoraTesteDividir {

			@Test
			public void testaDividirCorretaParaDoisInteirosPositivos() {
				Calculadora calculadora =new Calculadora();
				
				int entradaNumero1 = 10;
				int entradaNumero2 = 5;
				
				int resultadoEsperado = 2;
				calculadora.dividir(entradaNumero1, entradaNumero2);
				int resultadoObtido = calculadora.getResultado;
				
				Assertions.assertEquals(resultadoEsperado, resultadoObtido);
				
			}
		}

}
