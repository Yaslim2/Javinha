package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Circunferencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunfer(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunfer�ncia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI = %.2f", Calculator.PI);
		
		sc.close();
	}

}
