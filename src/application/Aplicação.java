package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Aplicação {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		double depositoInicial;
		double deposito;
		double saque;
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Informe o titular da conta: ");
		sc.nextLine();
		String nomeConta = sc.nextLine();
		System.out.print("Deseja adicionar um valor inicial? (y/n) ");
		char cond = sc.next().charAt(0);
		
		if(cond == 'y') {
			System.out.print("--------------------------------------");
			System.out.print("\nDigite o valor inicial: ");
			depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeConta, depositoInicial);
			System.out.print("--------------------------------------");
			System.out.println("\nDados da conta: ");
			System.out.println(conta);
			
			System.out.print("Digite um valor para o depósito: ");
			deposito = sc.nextDouble();
			conta.deposito(deposito);
			System.out.print("--------------------------------------");
			System.out.println("\nConta atualizada: ");
			System.out.println(conta);
			
			System.out.print("Digite um valor para efetuar o saque: ");
			saque = sc.nextDouble();
			conta.saque(saque);
			System.out.print("--------------------------------------");
			System.out.println("\nConta atualizada: ");
			System.out.println(conta);
			System.out.println("SISTEMA FINALIZADO");
			System.out.print("--------------------------------------");
			
		} else {
			conta = new Conta(numConta, nomeConta);
			System.out.print("--------------------------------------");
			System.out.println("\nDados da conta: ");
			System.out.print(conta);
			System.out.print("--------------------------------------");
			System.out.print("\nDigite um valor para o depósito: ");
			deposito = sc.nextDouble();
			conta.deposito(deposito);
			System.out.print("--------------------------------------");
			System.out.println("\nConta atualizada: ");
			System.out.println(conta);
			
			System.out.print("Digite um valor para efetuar o saque: ");
			saque = sc.nextDouble();
			conta.saque(saque);
			System.out.print("--------------------------------------");
			System.out.println("\nConta atualizada: ");
			System.out.println(conta);
			System.out.println("SISTEMA FINALIZADO");
			System.out.print("--------------------------------------");
		}
		
		sc.close();
	}

}
