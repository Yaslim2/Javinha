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
		
		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		System.out.println("Voc� digitou: " + z);
		System.out.printf("Voc� digitou: %c\n", letra);
		
		sc.close();
	}

}
