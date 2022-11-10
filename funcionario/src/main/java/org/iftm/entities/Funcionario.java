package org.iftm.entities;

public class Funcionario {
	private String nome;
	private double valor;
	private int horasTrabalhadas;


	public Funcionario(String nome, int horas, double valor) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horas;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 40) {
		throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		this.horasTrabalhadas = horasTrabalhadas;
		}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public double calculaSalario() {
		return (horasTrabalhadas * valor * 4 );
		
	}
}
