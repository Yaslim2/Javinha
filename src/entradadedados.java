import java.util.Locale;
import java.util.Scanner;

public class entradadedados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char letra;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		letra = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		System.out.printf("Você digitou: %c\n", letra);
		
		sc.close();
	}

}
