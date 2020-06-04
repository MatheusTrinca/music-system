package application;

import java.util.List;
import java.util.Scanner;

import model.entities.Album;
import model.entities.Artista;
import model.entities.Musica;
import model.exceptions.MusicException;
import model.services.SearchService;

public class UI {
	
	public static int menuInicial(){
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("1.Cadastrar Album\n2.Ordenar\n3.FIM");
			op = sc.nextInt();
		}while(op < 1 || op > 3);
		return op;
	}
	
	public static Album cadastrarAlbum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do artista: ");
		String artista = sc.nextLine();
		System.out.print("Digite a nacionalidade do artista: ");
		String nacionalidade = sc.nextLine();
		System.out.print("Digite o id do album: ");
		int albumId = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do album: ");
		String albumNome = sc.nextLine();
		System.out.print("Digite o ano do album: ");
		int anoAlbum = sc.nextInt();
		Album album = new Album(albumId, new Artista(artista, nacionalidade), albumNome, anoAlbum);
		System.out.print("Digite a quantidade de músicas: ");
		int qtdMusica = sc.nextInt();
		for(int i = 1; i <= qtdMusica; i++) {
			sc.nextLine();
			System.out.print("Digite o nome da música "+i+": ");
			String nomeMusica = sc.nextLine();
			System.out.print("Digite a duração da música(minutos): ");
			Double musicaDuracao = sc.nextDouble();
			album.addMusica(new Musica(i, nomeMusica, musicaDuracao));
		}
		return album;
	}
	
	
	public static void ordenar(List<Album> albuns){
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.print("Ordenar por 1.nome, 2.ano ou 3.duracao? ");
			op = sc.nextInt();
		}while(op != 1 && op != 2 && op != 3);
		SearchService ss = new SearchService();
		if(op == 1) {
			ss.ordenaNome(albuns);
		}else if(op == 2) {
			ss.ordenaAno(albuns);
		}else {
			ss.ordenaDuracao(albuns);
		}
	}
	

	

	
	
}
