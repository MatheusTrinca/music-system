package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Album {
	
	private Integer id;
	private Artista artista;
	private String nome;
	private Integer ano;
	public List<Musica> musicas = new ArrayList<>();
	
	
	public Album(Integer id, Artista artista, String nome, Integer ano) {
		this.id = id;
		this.artista = artista;
		this.nome = nome;
		this.ano = ano;
	}
	
	public Integer getId() {
		return id;
	}

	public Artista getArtista() {
		return artista;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAno() {
		return ano;
	}
	
	public void addMusica(Musica musica) {
		musicas.add(musica);
	}
	
	public List<Musica> getMusica(){
		return musicas;
	}

	public double duracaoTotal() {
		double total = 0;
		for(Musica musica : musicas) {
			total += musica.getDuracao();
		}
		return total;
	}

}
