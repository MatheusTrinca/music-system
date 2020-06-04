package model.entities;

public class Musica {

	private Integer id;
	private String nome;
	private double duracao;
	
	public Musica(Integer id, String nome, double duracao) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	

	
	
	
	
	
}
