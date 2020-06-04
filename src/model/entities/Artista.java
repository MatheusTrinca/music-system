package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Artista {
	
	private String nome;
	private String nacionalidade;
	public List<Album> albuns = new ArrayList<>();
	
	public Artista() {
		
	}

	public Artista(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void addAlbum(Album album) {
		albuns.add(album);
	}
	
	
	

}
