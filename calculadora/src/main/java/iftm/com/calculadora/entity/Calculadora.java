package iftm.com.calculadora.entity;

public class Calculadora {
	private int resultado;

	public int getResultado() {
		return resultado;
	};

	public void somar(int num1, int num2) {
		resultado = num1 + num2;
	}

	public int subtrair(int num1, int num2) {
		resultado = num1 - num2;;
	}

	public int multiplicar(int num1, int num2) {
		resultado = num1 * num2;
	}

	public int dividir(int num1, int num2) {
		resultado = num1 / num2;
	}
}
