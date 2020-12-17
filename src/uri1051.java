import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double f1=0,r=0;
		double x;
		x = sc.nextDouble();
		
		if(x>=0 && x<=2000) {
			System.out.println("Isento.");
		} else if(x>2000 && x<=3000) {
			f1 = x - 2000;
			r=f1*0.08;
			
		} else if(x>3000 && x<=4500) {
			f1 = (x-3000) * 0.18;
			r = f1 + 80; // 80 é igual a 3000*0.08, pois o que iremos calcular nesse if, é apenas o imposto de renda em cima do valor excedido
			
		} else {
			f1 = (x - 4500) * 0.28;
			r = f1 + 350; // 350 é igual a 1500*0.18 + 3000*0.08, devido as condições acima.
			
		}
		if(!(r==0)) {
			System.out.printf("R$ %.2f\n", r);
		}
		
		sc.close();
	}

}
