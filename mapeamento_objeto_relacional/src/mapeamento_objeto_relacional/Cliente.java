package mapeamento_objeto_relacional;

import java.util.List;

public class Cliente {
	private long id;
	private String nome;
	private String endereco;
	private List <Pedido> pedidos;

	public Cliente() {
		super ();
	}

	public Cliente(long id, String nome, String endereco, List<Pedido> pedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.pedidos = pedidos;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
