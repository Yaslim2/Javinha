package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Convert {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? ");
		double dol = sc.nextDouble();
		System.out.printf("Quantos doláres você deseja comprar? ");
		double quant = sc.nextDouble();
		double valor = Conversor.converting(dol, quant);
		
		System.out.printf("Valor equivalente em reais: %.2f", valor);
		
		sc.close();
	}

}
