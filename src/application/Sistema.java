package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Sistema {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcion�rio: " + funcionario);
		
		System.out.println("Qual porcentagem deseja acrescentar no sal�rio? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("Atualizado: " + funcionario);
		
		sc.close();
	}

}
