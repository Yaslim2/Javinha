import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod, quant;
		double resultado=0;
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		if(cod == 1) {
			resultado = 4 * quant;
		} else if(cod == 2) {
			resultado = 4.50 * quant;
		} else if(cod == 3) {
			resultado = 5 * quant;
		} else if(cod == 4) {
			resultado = 2 * quant;
		} else if(cod == 5) {
			resultado = 1.50 * quant;
		}
		
		System.out.printf("Total = R$ %.2f", resultado);
		
		sc.close();
	}

}
