import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double horas, valor, aux;
		num = sc.nextInt();
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		
		aux = horas*valor;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f", aux);
		
		sc.close();

	}

}
