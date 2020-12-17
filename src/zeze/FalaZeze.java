package zeze;

import java.util.Locale;
import java.util.Scanner;

import salario.Salario;

public class FalaZeze {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Salário do Thiago Neves: ");
		double dindin = sc.nextDouble();
		Salario thiagoNeves = new Salario(dindin);
		System.out.println("-------------------------------------------------------");
		System.out.println(thiagoNeves);
		
		System.out.println("-------------------------------------------------------");
		System.out.print("Proposta de aumento do salário por parte do Cruzeiro: ");
		double porcentagem = sc.nextDouble();
		porcentagem = porcentagem / 100;
		System.out.println("-------------------------------------------------------");
		thiagoNeves.aumentoDoSalario(porcentagem);
		
		if(porcentagem < 0.6) {
			System.out.println("-------------------------------------------------------");
			System.out.println("CSA: 1");
			System.out.println("Cruzeiro: 0");
			System.out.println("Thiago Neves perde penâlti");
			System.out.println("Cruzeiro cai para a série B");
			System.out.println("-------------------------------------------------------");
		} else {
			System.out.println("-------------------------------------------------------");
			System.out.println("CSA: 0");
			System.out.println("Cruzeiro: 1");
			System.out.println("Thiago Neves converte penâlti");
			System.out.println("Cruzeiro continua na série A");
			System.out.println("-------------------------------------------------------");
		}
		
		sc.close();
	}

}
