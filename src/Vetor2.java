import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Vetor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Products[] vect = new Products[n];
		double soma = 0;
		
		for(int i =0;i<n;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Products(nome, preco);
		}
		
		for(int i=0;i<n;i++) {
			soma += vect[i].getPreco();
		}
		
		System.out.printf("MEDIA DE PREÇOS: %.2f\n", (double) soma/n);
		
		sc.close();
	}

}
