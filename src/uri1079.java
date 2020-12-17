import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double a,b,c;
		
		for(int i = 0; i<N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			System.out.printf("%.1f\n", ((a*2)+(b*3)+(c*5))/10 );
		}
		
		sc.close();
	}

}
