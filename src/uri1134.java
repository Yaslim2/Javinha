import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,a=0,g=0,d=0;
		x = sc.nextInt();
		
		while(x!=4) {
			if(x == 1) {
				a += 1;
				x = sc.nextInt();
			} else if(x == 2) {
				g += 1;
				x = sc.nextInt();
			} else if(x == 3) {
				d += 1;
				x = sc.nextInt();
			} else {
				x = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
	
		sc.close();
	}

}
