import java.util.Locale;
import java.util.Scanner;

public class vetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x=0;
		int N = sc.nextInt();
		double vect[] = new double [N];
		
		for(int i =0; i<N; i++) {
			vect[i] = sc.nextDouble();
			x+= vect[i];
		}
		
		System.out.printf("MEDIA: %.2f\n" ,(double)x/N);
		
		sc.close();
	}

}
