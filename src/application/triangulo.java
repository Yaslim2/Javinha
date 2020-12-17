package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		
		
		double areay = y.area();
		
		System.out.printf("Area do triangulo X: %.4f\n", areax);
		System.out.printf("Area do triangulo Y: %.4f\n", areay);
		
		if(areax > areay) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area : Y");
		}
		sc.close();
	}

}
