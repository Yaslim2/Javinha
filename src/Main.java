import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int y = 18;
		double x = 10.56858501;
		System.out.println("Hello, world");
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Yaslim Soares");
		System.out.println(y);
		System.out.println("Yaslim tem " + y + " anos" );
		System.out.printf("Yaslim tem %d anos\n", y);
		
		
		String nome = "Paulo";
		int idade = 50;
		double renda = 2500.550;
		System.out.printf("%s tem %d anos e a sua renda é de: %.2f\n", nome, idade, renda);
	}

}
