package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		aluno.mostrarDados();
		
		System.out.println("MEDIA FINAL: " + aluno.mediaFinal());
		
		if(aluno.mediaFinal() < 60) {
			System.out.println("FALHOU");
			System.out.printf("FALTOU %.2f pontos", aluno.pontosParaPassar());
		} else {
			System.out.println("PASSOU");
		}
		
		sc.close();
	}

}
