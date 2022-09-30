package org.iftm.entities;

public class Funcionario {
	private String nome ;
	private int horas ;
	private double valor;
	public Funcionario(String nome, int horas, double valor) {
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
	
	
}
