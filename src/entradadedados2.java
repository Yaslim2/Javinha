import java.util.Locale;
import java.util.Scanner;

public class entradadedados2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int x;
		String s1,s2,s3,aux;
		
		x = sc.nextInt();
		aux = sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(x);
		System.out.println("Frase de s1: " + s1);
		System.out.println("Frase de s2: " + s2);
		System.out.println("Frase de s3: " + s3);
		sc.close();
	}

}
