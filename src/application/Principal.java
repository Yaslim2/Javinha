package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;
import entities.Contaa;

public class Principal {

	public static void main(String[] args) {
		int loop = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contaa account;
		System.out.print("Digite o nome do banco que você quer criar sua conta: ");
		String nomeBanco = sc.nextLine();
		Banco bank = new Banco(nomeBanco);
		while(loop == 0) {
			System.out.println("----------------------");
			System.out.println("SISTEMA DO " + bank.getNomeBanco().toUpperCase());
			System.out.println("----------------------");
			System.out.println("Qual operação você deseja realizar? \n1-Criar uma nova conta \n2-Depositar \n3-Sacar \n4-Alterar Dados \n5-Sair \n6-Mostrar contas ");
			int cond = sc.nextInt();
			if(cond == 1) {
				System.out.println("----------------------");
				sc.nextLine();
				System.out.print("Digite o nome do titular: ");
				String nome = sc.nextLine();
				System.out.print("Informe o número da conta: ");
				int numConta = sc.nextInt();
				System.out.print("Deseja adicionar um saldo inicial? (1-Sim 2-Não) ");
				int condicaoSaldo = sc.nextInt();
				double saldoInicial;
				
				if(condicaoSaldo == 1) {
					System.out.print("Informe o saldo inicial: ");
					saldoInicial = sc.nextDouble();
					account = new Contaa(nome, numConta, saldoInicial);
					System.out.println("Conta criada");
					bank.getList().add(account);
				} else {
					account = new Contaa(nome, numConta);
					System.out.println("Conta criada\n");
					bank.getList().add(account);
				}
			} else if(cond == 2) {
				System.out.println("----------------------");
				System.out.print("Qual o número da conta que você deseja realizar o depósito? ");
				int num = sc.nextInt();
				Integer conditional = bank.acharNum(bank.getList(), num);
				while(conditional == null) {
					System.out.print("Conta não encontrada. Tente novamente: ");
					num = sc.nextInt();
					conditional = bank.acharNum(bank.getList(), num);
				}
				System.out.print("Qual o valor do depósito? ");
				double dep = sc.nextInt();
				bank.getList().get(conditional).depositar(dep);
			} else if(cond == 3) {
				System.out.println("----------------------");
				System.out.print("Qual o número da conta que você deseja realizar o saque? ");
				int num = sc.nextInt();
				Integer conditional = bank.acharNum(bank.getList(), num);
				while(conditional == null) {
					System.out.print("Conta não encontrada. Tente novamente: ");
					num = sc.nextInt();
					conditional = bank.acharNum(bank.getList(), num);
				}
				System.out.print("Qual o valor do saque? ");
				double saque = sc.nextInt();
				bank.getList().get(conditional).sacar(saque);;
			} else if(cond == 4) {
				System.out.println("----------------------");
				System.out.print("Qual o número da conta que você deseja alterar seus dados? ");
				int num = sc.nextInt();
				Integer conditional = bank.acharNum(bank.getList(), num);
				while(conditional == null) {
					System.out.print("Conta não encontrada. Tente novamente: ");
					num = sc.nextInt();
					conditional = bank.acharNum(bank.getList(), num);
				}
				System.out.print("Digite um novo titular da conta: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Digite um novo número para a conta: ");
				int numConta = sc.nextInt();
				bank.getList().get(conditional).setNome(name);
				bank.getList().get(conditional).setNumConta(numConta);
			} else if(cond == 5) {
				break;
			} else if(cond == 6) {
				bank.mostrandoContas();
			} else {
				System.out.println("Operação inválida");
				continue;
			}
		}
		sc.close();
	}

}
