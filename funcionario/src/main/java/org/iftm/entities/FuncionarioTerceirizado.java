package org.iftm.entities;

public class FuncionarioTerceirizado {
	private String nome;
	private int horas;
	private double valor;
	private int horasTrabalhadas;
	private double despesasAdicionais;

	public double getDespesasAdicionais() {
		return despesasAdicionais;
	}

	public void setDespesasAdicionais(double despesasAdicionais) {
		this.despesasAdicionais = despesasAdicionais;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public FuncionarioTerceirizado(String nome, int horas, double valor) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
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
	

}
