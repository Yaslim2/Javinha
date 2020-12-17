package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ret;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ret retangulo = new ret();
		System.out.println("Entre com a largura e a altura do retângulo:");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETRO = " + retangulo.perimetro());
		double diagonal = retangulo.diagonal();
		System.out.printf("DIAGONAL = %.2f", diagonal);
		
		sc.close();
	}

}
