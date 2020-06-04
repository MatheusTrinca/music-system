package model.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import model.entities.Album;

public class SearchService {
	
	public void ordenaNome(List<Album> albuns) {
		List<String> nomeAlbum = new ArrayList<>();
		for(Album album: albuns) {
			nomeAlbum.add(album.getNome());
		}
		Collections.sort(nomeAlbum);
		for(String ordenad : nomeAlbum) {
			System.out.println(ordenad);
		}
	}
	
	public void ordenaAno(List<Album> albuns) {
		List<Integer> anoAlbum = new ArrayList<>();
		List<String> ordenado = new ArrayList<>();
		for(Album album : albuns) {
			anoAlbum.add(album.getAno());
		}
		Collections.sort(anoAlbum);
		for(Integer ano : anoAlbum) {
			for(Album album : albuns) {
				if(ano == album.getAno()) {
					ordenado.add(album.getNome());
				}
			}
		}
		for(String ordenad : ordenado) {
			System.out.println(ordenad);
		}
	}
	
	public void ordenaDuracao(List<Album> albuns) {
		List<Double> duracaoAlbum = new ArrayList<>();
		List<String> ordenado = new ArrayList<>();
		for(Album album : albuns) {
			duracaoAlbum.add(album.duracaoTotal());
		}
		Collections.sort(duracaoAlbum);
		for(Double duracao : duracaoAlbum) {
			for(Album album : albuns) {
				if(duracao == album.duracaoTotal()) {
					ordenado.add(album.getNome());
				}
			}
		}
		for(String ordenad : ordenado) {
			System.out.println(ordenad);
		}
	}

}
