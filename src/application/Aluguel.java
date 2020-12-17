package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Aluguel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");	
		int n = sc.nextInt();
		
		Cadastro[] cad = new Cadastro[10];
		
		String nome;
		String email;
		int quarto;
		int aux = 1;
		
		for(int i=1;i<=n;i++) {
			
			sc.nextLine();
			System.out.println("\nAluguel #"+aux +":");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Quarto: ");
			quarto = sc.nextInt();
			
			cad[quarto] = new Cadastro(nome, email);
			aux+=1;
		}
		
		
		System.out.println("\nQuartos ocupados:");
		for(int i = 0;i<cad.length;i++) {
			if(cad[i] != null) {
				System.out.printf("Quarto %d: %s, %s\n", i, cad[i].getNome(), cad[i].getEmail());
			}
		}
		
		sc.close();
	}

}
