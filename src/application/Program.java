package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Album;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Album> albuns = new ArrayList<>(); 
		int op;
		System.out.println("Bem Vindo(a)!!");
		
		do {
			op = UI.menuInicial();
			switch (op) {
			case 1:
				while(true) {
				albuns.add(UI.cadastrarAlbum());
				System.out.println("Deseja novo cadastro?(S/N): ");
				char op1 = sc.next().toLowerCase().charAt(0);
				if(op1 == 'n')
					break;
				}
				break;
			case 2:
				UI.ordenar(albuns);		
				break;
			case 3:
				System.out.println("FIM");
				break;
	
			}
		}while(op != 3);
		
		sc.close();
		

	}

}
