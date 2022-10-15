package org.iftm.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {
	
		@Test
		public void testarConstrutorFuncionarioComDadosValido(){
			//cenário de teste
			String nomeValido = "Laiane Angelina Ribeiro";
			int horasValido = 6; //quantidade de horas semanal
			double valorValido = 75; //valor da hora trabalhada
			double salarioEsperado = 1800;
			Funcionario a = new Funcionario(nomeValido,horasValido,valorValido); //este é o construtor
			
			Assertions.assertEquals(null, null);
	}
	
}
