import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		double areat, areac, areatrapezio, areaquadrado, arear;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areat = (A*C)/2;
		areac = 3.14159 * Math.pow(C,2);
		areatrapezio = ((A+B)*C)/2;
		areaquadrado = Math.pow(B,2);
		arear = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", areat);
		System.out.printf("CIRCULO: %.3f\n", areac);
		System.out.printf("TRAPEZIO: %.3f\n", areatrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaquadrado);
		System.out.printf("RETANGULO: %.3f\n", arear);
		
		
		sc.close();
	}

}
