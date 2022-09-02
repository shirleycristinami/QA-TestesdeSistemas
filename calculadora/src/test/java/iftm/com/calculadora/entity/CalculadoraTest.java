package iftm.com.calculadora.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testaSomaCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora =new Calculadora();
		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		
		int resultadoEsperado = 15;
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	
	@Test
	public void testaDividirCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora =new Calculadora();
		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		
		int resultadoEsperado = 2;
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMultiplicarCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora =new Calculadora();
		
		int entradaNumero1 = 5;
		int entradaNumero2 = 5;
		
		int resultadoEsperado = 25;
		calculadora.multiplicar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaSubtrairCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora =new Calculadora();
		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		
		int resultadoEsperado = 5;
		calculadora.subtrair(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);	
	}
}
